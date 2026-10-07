import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties { 
  name?: ConfigNodePropertyString;
  path?: ConfigNodePropertyString;
  ignoredPathsPatterns?: ConfigNodePropertyArray;
  serviceName?: ConfigNodePropertyString;
  deep?: ConfigNodePropertyBoolean;
}

