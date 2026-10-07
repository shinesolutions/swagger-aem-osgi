import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties { 
  'indexing.critical.threshold'?: ConfigNodePropertyInteger;
  'indexing.warn.threshold'?: ConfigNodePropertyInteger;
  'hc.tags'?: ConfigNodePropertyArray;
}

