import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComDayCqDamCoreImplDamEventPurgeServiceProperties { 
  'scheduler.expression'?: ConfigNodePropertyString;
  maxSavedActivities?: ConfigNodePropertyInteger;
  saveInterval?: ConfigNodePropertyInteger;
  enableActivityPurge?: ConfigNodePropertyBoolean;
  eventTypes?: ConfigNodePropertyDropDown;
}

