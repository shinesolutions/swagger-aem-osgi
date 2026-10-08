import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingEventImplJobsDefaultJobManagerProperties { 
  'queue.priority'?: ConfigNodePropertyDropDown;
  'queue.retries'?: ConfigNodePropertyInteger;
  'queue.retrydelay'?: ConfigNodePropertyInteger;
  'queue.maxparallel'?: ConfigNodePropertyInteger;
}

