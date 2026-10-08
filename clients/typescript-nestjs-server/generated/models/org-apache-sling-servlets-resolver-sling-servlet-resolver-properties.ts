import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingServletsResolverSlingServletResolverProperties { 
  'servletresolver.servletRoot'?: ConfigNodePropertyString;
  'servletresolver.cacheSize'?: ConfigNodePropertyInteger;
  'servletresolver.paths'?: ConfigNodePropertyArray;
  'servletresolver.defaultExtensions'?: ConfigNodePropertyArray;
}

