import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteLicenseImplLicenseCheckFilterProperties { 
  checkInternval?: ConfigNodePropertyInteger;
  excludeIds?: ConfigNodePropertyArray;
  encryptPing?: ConfigNodePropertyBoolean;
}

