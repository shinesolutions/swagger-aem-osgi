import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeCqProjectsPurgeSchedulerProperties { 
  'scheduledpurge.name'?: ConfigNodePropertyString;
  'scheduledpurge.purgeActive'?: ConfigNodePropertyBoolean;
  'scheduledpurge.templates'?: ConfigNodePropertyArray;
  'scheduledpurge.purgeGroups'?: ConfigNodePropertyBoolean;
  'scheduledpurge.purgeAssets'?: ConfigNodePropertyBoolean;
  'scheduledpurge.terminateRunningWorkflows'?: ConfigNodePropertyBoolean;
  'scheduledpurge.daysold'?: ConfigNodePropertyInteger;
  'scheduledpurge.saveThreshold'?: ConfigNodePropertyInteger;
}

