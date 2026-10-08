import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties { 
  path?: ConfigNodePropertyString;
  'jaas.controlFlag'?: ConfigNodePropertyString;
  'jaas.realmName'?: ConfigNodePropertyString;
  'jaas.ranking'?: ConfigNodePropertyInteger;
  'oauth.offline.validation'?: ConfigNodePropertyBoolean;
}

