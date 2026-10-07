import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties { 
  'hc.tags'?: ConfigNodePropertyArray;
  'disk.space.warn.threshold'?: ConfigNodePropertyInteger;
  'disk.space.error.threshold'?: ConfigNodePropertyInteger;
}

