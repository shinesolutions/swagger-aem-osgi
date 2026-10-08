import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties { 
  enabledActions?: ConfigNodePropertyDropDown;
  userPrivilegeNames?: ConfigNodePropertyArray;
  groupPrivilegeNames?: ConfigNodePropertyArray;
  constraint?: ConfigNodePropertyString;
}

