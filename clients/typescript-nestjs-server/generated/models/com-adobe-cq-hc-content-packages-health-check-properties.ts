import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeCqHcContentPackagesHealthCheckProperties { 
  'hc.name'?: ConfigNodePropertyString;
  'hc.tags'?: ConfigNodePropertyArray;
  'hc.mbean.name'?: ConfigNodePropertyString;
  'package.names'?: ConfigNodePropertyArray;
}

