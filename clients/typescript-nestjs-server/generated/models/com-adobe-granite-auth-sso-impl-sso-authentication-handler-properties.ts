import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties { 
  path?: ConfigNodePropertyString;
  'service.ranking'?: ConfigNodePropertyInteger;
  'jaas.controlFlag'?: ConfigNodePropertyString;
  'jaas.realmName'?: ConfigNodePropertyString;
  'jaas.ranking'?: ConfigNodePropertyInteger;
  'headers'?: ConfigNodePropertyArray;
  cookies?: ConfigNodePropertyArray;
  parameters?: ConfigNodePropertyArray;
  usermap?: ConfigNodePropertyArray;
  format?: ConfigNodePropertyString;
  trustedCredentialsAttribute?: ConfigNodePropertyString;
}

