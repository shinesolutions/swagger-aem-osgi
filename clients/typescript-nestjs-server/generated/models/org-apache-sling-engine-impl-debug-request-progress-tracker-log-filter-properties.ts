import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties { 
  extensions?: ConfigNodePropertyArray;
  minDurationMs?: ConfigNodePropertyInteger;
  maxDurationMs?: ConfigNodePropertyInteger;
  compactLogFormat?: ConfigNodePropertyBoolean;
}

