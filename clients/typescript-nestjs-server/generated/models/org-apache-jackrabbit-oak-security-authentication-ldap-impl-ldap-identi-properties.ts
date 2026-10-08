import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties { 
  'provider.name'?: ConfigNodePropertyString;
  'host.name'?: ConfigNodePropertyString;
  'host.port'?: ConfigNodePropertyInteger;
  'host.ssl'?: ConfigNodePropertyBoolean;
  'host.tls'?: ConfigNodePropertyBoolean;
  'host.noCertCheck'?: ConfigNodePropertyBoolean;
  'bind.dn'?: ConfigNodePropertyString;
  'bind.password'?: ConfigNodePropertyString;
  searchTimeout?: ConfigNodePropertyString;
  'adminPool.maxActive'?: ConfigNodePropertyInteger;
  'adminPool.lookupOnValidate'?: ConfigNodePropertyBoolean;
  'userPool.maxActive'?: ConfigNodePropertyInteger;
  'userPool.lookupOnValidate'?: ConfigNodePropertyBoolean;
  'user.baseDN'?: ConfigNodePropertyString;
  'user.objectclass'?: ConfigNodePropertyArray;
  'user.idAttribute'?: ConfigNodePropertyString;
  'user.extraFilter'?: ConfigNodePropertyString;
  'user.makeDnPath'?: ConfigNodePropertyBoolean;
  'group.baseDN'?: ConfigNodePropertyString;
  'group.objectclass'?: ConfigNodePropertyArray;
  'group.nameAttribute'?: ConfigNodePropertyString;
  'group.extraFilter'?: ConfigNodePropertyString;
  'group.makeDnPath'?: ConfigNodePropertyBoolean;
  'group.memberAttribute'?: ConfigNodePropertyString;
  useUidForExtId?: ConfigNodePropertyBoolean;
  customattributes?: ConfigNodePropertyArray;
}

