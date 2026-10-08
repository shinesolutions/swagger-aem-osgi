import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComDayCqDamCoreImplDamEventRecorderImplProperties { 
  'event.filter'?: ConfigNodePropertyString;
  'event.queue.length'?: ConfigNodePropertyInteger;
  'eventrecorder.enabled'?: ConfigNodePropertyBoolean;
  'eventrecorder.blacklist'?: ConfigNodePropertyArray;
  'eventrecorder.eventtypes'?: ConfigNodePropertyDropDown;
}

