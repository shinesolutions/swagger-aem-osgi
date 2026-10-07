import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties { 
  enabled?: ConfigNodePropertyBoolean;
  configRefResourceNames?: ConfigNodePropertyArray;
  configRefPropertyNames?: ConfigNodePropertyArray;
  'service.ranking'?: ConfigNodePropertyInteger;
}

