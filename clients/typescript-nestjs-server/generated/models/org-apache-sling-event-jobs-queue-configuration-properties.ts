import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';
import { ConfigNodePropertyFloat } from './config-node-property-float';


export interface OrgApacheSlingEventJobsQueueConfigurationProperties { 
  'queue.name'?: ConfigNodePropertyString;
  'queue.topics'?: ConfigNodePropertyArray;
  'queue.type'?: ConfigNodePropertyDropDown;
  'queue.priority'?: ConfigNodePropertyDropDown;
  'queue.retries'?: ConfigNodePropertyInteger;
  'queue.retrydelay'?: ConfigNodePropertyInteger;
  'queue.maxparallel'?: ConfigNodePropertyFloat;
  'queue.keepJobs'?: ConfigNodePropertyBoolean;
  'queue.preferRunOnCreationInstance'?: ConfigNodePropertyBoolean;
  'queue.threadPoolSize'?: ConfigNodePropertyInteger;
  'service.ranking'?: ConfigNodePropertyInteger;
}

