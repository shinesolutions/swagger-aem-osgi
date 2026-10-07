import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties { 
  path?: ConfigNodePropertyString;
  'oauth.clientIds.allowed'?: ConfigNodePropertyArray;
  'auth.bearer.sync.ims'?: ConfigNodePropertyBoolean;
  'auth.tokenRequestParameter'?: ConfigNodePropertyString;
  'oauth.bearer.configid'?: ConfigNodePropertyString;
  'oauth.jwt.support'?: ConfigNodePropertyBoolean;
}

