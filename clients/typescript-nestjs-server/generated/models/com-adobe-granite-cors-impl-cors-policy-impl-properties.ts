import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteCorsImplCORSPolicyImplProperties { 
  alloworigin?: ConfigNodePropertyArray;
  alloworiginregexp?: ConfigNodePropertyArray;
  allowedpaths?: ConfigNodePropertyArray;
  exposedheaders?: ConfigNodePropertyArray;
  maxage?: ConfigNodePropertyInteger;
  supportedheaders?: ConfigNodePropertyArray;
  supportedmethods?: ConfigNodePropertyArray;
  supportscredentials?: ConfigNodePropertyBoolean;
}

