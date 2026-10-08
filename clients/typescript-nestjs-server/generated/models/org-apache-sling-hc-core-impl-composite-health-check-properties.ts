import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingHcCoreImplCompositeHealthCheckProperties { 
  'hc.name'?: ConfigNodePropertyString;
  'hc.tags'?: ConfigNodePropertyArray;
  'hc.mbean.name'?: ConfigNodePropertyString;
  'filter.tags'?: ConfigNodePropertyArray;
  'filter.combineTagsWithOr'?: ConfigNodePropertyBoolean;
}

