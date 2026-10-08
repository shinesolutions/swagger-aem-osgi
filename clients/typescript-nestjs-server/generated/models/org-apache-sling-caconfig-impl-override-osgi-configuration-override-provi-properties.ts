import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties { 
  description?: ConfigNodePropertyString;
  overrides?: ConfigNodePropertyArray;
  enabled?: ConfigNodePropertyBoolean;
  'service.ranking'?: ConfigNodePropertyInteger;
}

