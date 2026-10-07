import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties { 
  'hc.name'?: ConfigNodePropertyString;
  'hc.tags'?: ConfigNodePropertyArray;
  'hc.mbean.name'?: ConfigNodePropertyString;
  'mbean.name'?: ConfigNodePropertyString;
  'attribute.name'?: ConfigNodePropertyString;
  'attribute.value.constraint'?: ConfigNodePropertyString;
}

