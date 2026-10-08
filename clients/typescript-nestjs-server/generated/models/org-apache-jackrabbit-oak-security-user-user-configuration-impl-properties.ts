import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties { 
  usersPath?: ConfigNodePropertyString;
  groupsPath?: ConfigNodePropertyString;
  systemRelativePath?: ConfigNodePropertyString;
  defaultDepth?: ConfigNodePropertyInteger;
  importBehavior?: ConfigNodePropertyDropDown;
  passwordHashAlgorithm?: ConfigNodePropertyString;
  passwordHashIterations?: ConfigNodePropertyInteger;
  passwordSaltSize?: ConfigNodePropertyInteger;
  omitAdminPw?: ConfigNodePropertyBoolean;
  supportAutoSave?: ConfigNodePropertyBoolean;
  passwordMaxAge?: ConfigNodePropertyInteger;
  initialPasswordChange?: ConfigNodePropertyBoolean;
  passwordHistorySize?: ConfigNodePropertyInteger;
  passwordExpiryForAdmin?: ConfigNodePropertyBoolean;
  cacheExpiration?: ConfigNodePropertyInteger;
  enableRFC7613UsercaseMappedProfile?: ConfigNodePropertyBoolean;
}

