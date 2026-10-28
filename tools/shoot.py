import re, subprocess, sys, xml.etree.ElementTree as ET
def sh(*a): return subprocess.run(a, capture_output=True, text=True).stdout
def dump(name):
    sh('adb','shell','uiautomator','dump','/sdcard/u.xml')
    x = sh('adb','shell','cat','/sdcard/u.xml')
    open(f'{OUT}/{name}.xml','w').write(x)
    return x
def shot(name):
    with open(f'{OUT}/{name}.png','wb') as f:
        f.write(subprocess.run(['adb','exec-out','screencap','-p'],capture_output=True).stdout)
    dump(name)
def find(x, text):
    try: root = ET.fromstring(x)
    except Exception: return None
    for n in root.iter('node'):
        t = (n.get('text') or '') + ' ' + (n.get('content-desc') or '')
        if text.lower() in t.lower():
            m = re.findall(r'\d+', n.get('bounds'))
            l,t_,r,b = map(int,m)
            return ((l+r)//2,(t_+b)//2)
    return None
def tap_text(text, name=None, wait=2):
    x = dump('_tmp')
    p = find(x, text)
    if not p:
        print('NOT FOUND', text); return False
    sh('adb','shell','input','tap',str(p[0]),str(p[1]))
    import time; time.sleep(wait)
    if name: shot(name)
    return True
import os, time
OUT = sys.argv[1]; os.makedirs(OUT, exist_ok=True)
def back(): sh('adb','shell','input','keyevent','4'); time.sleep(1.5)
time.sleep(1)
shot('01-home')
tap_text('Settings','02-settings-dialog'); back()
tap_text('History','03-history-empty'); back()
tap_text('Sync Data','04-sync-no-root'); back()
# CSV picker flow
tap_text('CSV','10-picker-open',wait=3)
if not tap_text('Downloads','11-picker-downloads',wait=2):
    tap_text('Show roots','11a-roots',wait=2); tap_text('Downloads','11-picker-downloads',wait=2)
shot('12-picker-list')
for n in ['T1.csv','T2.csv','T3.csv']:
    p=find(dump('_tmp'),n)
    if p: sh('adb','shell','input','swipe',str(p[0]),str(p[1]),str(p[0]),str(p[1]),'900'); time.sleep(1)
shot('13-picker-selected')
tap_text('Open','14-after-open',wait=4)
shot('15-result')
sh('adb','shell','input','swipe','540','1800','540','900','300'); time.sleep(1); shot('16-scrolled')
sh('adb','shell','input','swipe','540','1800','540','900','300'); time.sleep(1); shot('17-scrolled2')
sh('adb','shell','input','swipe','540','900','540','2000','300'); time.sleep(1)
sh('adb','shell','input','swipe','540','900','540','2000','300'); time.sleep(1)
tap_text('History','18-history-filled'); back()
tap_text('Settings','19-settings'); back()
tap_text('Inspect','20-inspector',wait=2)
