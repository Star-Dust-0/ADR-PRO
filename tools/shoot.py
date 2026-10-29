EXACT=True
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
        if text.lower() == (n.get('text') or n.get('content-desc') or '').strip().lower() or (text.lower() in t.lower() and not EXACT):
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
def tapxy(x,y,w=2): sh('adb','shell','input','tap',str(x),str(y)); time.sleep(w)
time.sleep(1)
shot('01-home')
tapxy(922,477); shot('02-settings'); back()
tapxy(797,477); shot('03-history'); back()
tapxy(540,718); shot('04-sync'); back()
tapxy(550,871,3); shot('10-picker')
for t in ['Show roots','Downloads']:
    tap_text(t,'11-'+t.replace(' ',''),wait=2)
shot('12-picker-list')
for n in ['T1.csv','T2.csv','T3.csv']:
    p=find(dump('_tmp'),n)
    if p: sh('adb','shell','input','swipe',str(p[0]),str(p[1]),str(p[0]),str(p[1]),'900'); time.sleep(1)
shot('13-picker-selected')
tap_text('Select','14-after-open',wait=4)
shot('15-loaded')

sw=lambda a,b: sh('adb','shell','input','swipe','540',str(a),'540',str(b),'300')
tap_text('Aggregate Readings Now','16-aggregated',wait=3)
sw(1800,600); time.sleep(1); shot('17-scrolled')
tap_text('T1.csv','18-inspector',wait=2); back()
sw(1800,600); time.sleep(1)
tap_text('Share','19-share',wait=3); back()
tap_text('Save CSV','20-save',wait=3); back()
sw(600,2000); sw(600,2000); time.sleep(1)
tapxy(797,477); shot('21-history-filled'); back()
tapxy(540,718); shot('22-sync')
tap_text('Select TEST Folder','23-tree-picker',wait=3)
for t in ['Show roots','Download','TEST']:
    tap_text(t,'24-tree-'+t.replace(' ',''),wait=2)
tap_text('Use this folder','25-use',wait=2)
tap_text('Allow','26-allow',wait=3)
shot('27-sync-listed')
tap_text('Merge This Folder','28-merged',wait=4)
