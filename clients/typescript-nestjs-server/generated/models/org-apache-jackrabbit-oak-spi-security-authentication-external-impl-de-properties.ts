import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties { 
  'handler.name'?: ConfigNodePropertyString;
  'user.expirationTime'?: ConfigNodePropertyString;
  'user.autoMembership'?: ConfigNodePropertyArray;
  'user.propertyMapping'?: ConfigNodePropertyArray;
  'user.pathPrefix'?: ConfigNodePropertyString;
  'user.membershipExpTime'?: ConfigNodePropertyString;
  'user.membershipNestingDepth'?: ConfigNodePropertyInteger;
  'user.dynamicMembership'?: ConfigNodePropertyBoolean;
  'user.disableMissing'?: ConfigNodePropertyBoolean;
  'group.expirationTime'?: ConfigNodePropertyString;
  'group.autoMembership'?: ConfigNodePropertyArray;
  'group.propertyMapping'?: ConfigNodePropertyArray;
  'group.pathPrefix'?: ConfigNodePropertyString;
  enableRFC7613UsercaseMappedProfile?: ConfigNodePropertyBoolean;
}

