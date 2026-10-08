import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties { 
  'large.index.critical.threshold'?: ConfigNodePropertyInteger;
  'large.index.warn.threshold'?: ConfigNodePropertyInteger;
  'hc.tags'?: ConfigNodePropertyArray;
}

