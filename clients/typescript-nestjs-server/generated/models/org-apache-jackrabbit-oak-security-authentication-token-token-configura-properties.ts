import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties { 
  tokenExpiration?: ConfigNodePropertyString;
  tokenLength?: ConfigNodePropertyString;
  tokenRefresh?: ConfigNodePropertyBoolean;
  tokenCleanupThreshold?: ConfigNodePropertyInteger;
  passwordHashAlgorithm?: ConfigNodePropertyString;
  passwordHashIterations?: ConfigNodePropertyInteger;
  passwordSaltSize?: ConfigNodePropertyInteger;
}

