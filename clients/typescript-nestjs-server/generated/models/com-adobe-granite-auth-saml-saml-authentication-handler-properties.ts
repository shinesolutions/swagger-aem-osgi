import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties { 
  path?: ConfigNodePropertyArray;
  'service.ranking'?: ConfigNodePropertyInteger;
  idpUrl?: ConfigNodePropertyString;
  idpCertAlias?: ConfigNodePropertyString;
  idpHttpRedirect?: ConfigNodePropertyBoolean;
  serviceProviderEntityId?: ConfigNodePropertyString;
  assertionConsumerServiceURL?: ConfigNodePropertyString;
  spPrivateKeyAlias?: ConfigNodePropertyString;
  keyStorePassword?: ConfigNodePropertyString;
  defaultRedirectUrl?: ConfigNodePropertyString;
  userIDAttribute?: ConfigNodePropertyString;
  useEncryption?: ConfigNodePropertyBoolean;
  createUser?: ConfigNodePropertyBoolean;
  userIntermediatePath?: ConfigNodePropertyString;
  addGroupMemberships?: ConfigNodePropertyBoolean;
  groupMembershipAttribute?: ConfigNodePropertyString;
  defaultGroups?: ConfigNodePropertyArray;
  nameIdFormat?: ConfigNodePropertyString;
  synchronizeAttributes?: ConfigNodePropertyArray;
  handleLogout?: ConfigNodePropertyBoolean;
  logoutUrl?: ConfigNodePropertyString;
  clockTolerance?: ConfigNodePropertyInteger;
  digestMethod?: ConfigNodePropertyString;
  signatureMethod?: ConfigNodePropertyString;
  identitySyncType?: ConfigNodePropertyDropDown;
  idpIdentifier?: ConfigNodePropertyString;
}

