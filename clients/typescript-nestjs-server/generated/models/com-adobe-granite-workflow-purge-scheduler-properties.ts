import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComAdobeGraniteWorkflowPurgeSchedulerProperties { 
  'scheduledpurge.name'?: ConfigNodePropertyString;
  'scheduledpurge.workflowStatus'?: ConfigNodePropertyDropDown;
  'scheduledpurge.modelIds'?: ConfigNodePropertyArray;
  'scheduledpurge.daysold'?: ConfigNodePropertyInteger;
}

