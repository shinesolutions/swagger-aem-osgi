import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties { 
  enabled?: ConfigNodePropertyBoolean;
  configPath?: ConfigNodePropertyString;
  fallbackPaths?: ConfigNodePropertyArray;
  configCollectionInheritancePropertyNames?: ConfigNodePropertyArray;
}

