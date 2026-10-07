import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties { 
  'hc.name'?: ConfigNodePropertyString;
  'hc.tags'?: ConfigNodePropertyArray;
  'hc.mbean.name'?: ConfigNodePropertyString;
  numberOfRetriesAllowed?: ConfigNodePropertyInteger;
}

