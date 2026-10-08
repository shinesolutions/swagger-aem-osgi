import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingEventImplJobsJobConsumerManagerProperties { 
  'org.apache.sling.installer.configuration.persist'?: ConfigNodePropertyBoolean;
  'job.consumermanager.whitelist'?: ConfigNodePropertyArray;
  'job.consumermanager.blacklist'?: ConfigNodePropertyArray;
}

