import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties { 
  'dav.root'?: ConfigNodePropertyString;
  'dav.create-absolute-uri'?: ConfigNodePropertyBoolean;
  'dav.realm'?: ConfigNodePropertyString;
  'collection.types'?: ConfigNodePropertyArray;
  'filter.prefixes'?: ConfigNodePropertyArray;
  'filter.types'?: ConfigNodePropertyString;
  'filter.uris'?: ConfigNodePropertyString;
  'type.collections'?: ConfigNodePropertyString;
  'type.noncollections'?: ConfigNodePropertyString;
  'type.content'?: ConfigNodePropertyString;
}

