import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties { 
  poolName?: ConfigNodePropertyString;
  allowedPoolNames?: ConfigNodePropertyArray;
  'scheduler.useleaderforsingle'?: ConfigNodePropertyBoolean;
  'metrics.filters'?: ConfigNodePropertyArray;
  slowThresholdMillis?: ConfigNodePropertyInteger;
}

