from models.event import *
import datetime

event1 = Event(date(2012,12,12), "Warhammer Reading Group", 10, 'Floor 10', 'Reading group for fans of all things Black Library', True)
event2 = Event(date(2012,12,12), "Total War LAN Event", 15, "Floor 6", "COOP Campaigns all round!", False)
events = [event1, event2]

def add_new_event(new_event):
    events.append(new_event)