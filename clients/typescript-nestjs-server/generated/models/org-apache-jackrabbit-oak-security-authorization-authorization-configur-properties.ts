import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties { 
  permissionsJr2?: ConfigNodePropertyDropDown;
  importBehavior?: ConfigNodePropertyDropDown;
  readPaths?: ConfigNodePropertyArray;
  administrativePrincipals?: ConfigNodePropertyArray;
  configurationRanking?: ConfigNodePropertyInteger;
}

