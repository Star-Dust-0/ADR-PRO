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
step = sys.argv[2]
time.sleep(1)
shot('01-home')
tap_text('Cell Settings', '02-settings-dialog'); sh('adb','shell','input','keyevent','4'); time.sleep(1)
tap_text('Merge History', '03-history-empty'); sh('adb','shell','input','keyevent','4'); time.sleep(1)
tap_text('Sync Data', '04-sync-no-root'); sh('adb','shell','input','keyevent','4'); time.sleep(1)
tap_text('Sample Test', '05-demo-result', wait=4)
sh('adb','shell','input','swipe','540','1800','540','600','300'); time.sleep(1); shot('06-scrolled')
sh('adb','shell','input','swipe','540','1800','540','600','300'); time.sleep(1); shot('07-scrolled2')
sh('adb','shell','input','swipe','540','1800','540','600','300'); time.sleep(1); shot('08-scrolled3')
tap_text('Merge History', '09-history-filled'); sh('adb','shell','input','keyevent','4'); time.sleep(1)
tap_text('28.45', '10-inspector')
