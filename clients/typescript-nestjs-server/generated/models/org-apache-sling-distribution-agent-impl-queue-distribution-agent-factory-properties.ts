import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties { 
  name?: ConfigNodePropertyString;
  title?: ConfigNodePropertyString;
  details?: ConfigNodePropertyString;
  enabled?: ConfigNodePropertyBoolean;
  serviceName?: ConfigNodePropertyString;
  'log.level'?: ConfigNodePropertyDropDown;
  'allowed.roots'?: ConfigNodePropertyArray;
  'requestAuthorizationStrategy.target'?: ConfigNodePropertyString;
  'queueProviderFactory.target'?: ConfigNodePropertyString;
  'packageBuilder.target'?: ConfigNodePropertyString;
  'triggers.target'?: ConfigNodePropertyString;
  priorityQueues?: ConfigNodePropertyArray;
}

