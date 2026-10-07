import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingHcCoreImplScriptableHealthCheckProperties { 
  'hc.name'?: ConfigNodePropertyString;
  'hc.tags'?: ConfigNodePropertyArray;
  'hc.mbean.name'?: ConfigNodePropertyString;
  expression?: ConfigNodePropertyString;
  'language.extension'?: ConfigNodePropertyString;
}

