import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingHapiImplHApiUtilImplProperties { 
  'org.apache.sling.hapi.tools.resourcetype'?: ConfigNodePropertyString;
  'org.apache.sling.hapi.tools.collectionresourcetype'?: ConfigNodePropertyString;
  'org.apache.sling.hapi.tools.searchpaths'?: ConfigNodePropertyArray;
  'org.apache.sling.hapi.tools.externalurl'?: ConfigNodePropertyString;
  'org.apache.sling.hapi.tools.enabled'?: ConfigNodePropertyBoolean;
}

