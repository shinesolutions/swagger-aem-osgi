import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteAuthOauthAccesstokenProviderProperties { 
  name?: ConfigNodePropertyString;
  'auth.token.provider.title'?: ConfigNodePropertyString;
  'auth.token.provider.default.claims'?: ConfigNodePropertyArray;
  'auth.token.provider.endpoint'?: ConfigNodePropertyString;
  'auth.access.token.request'?: ConfigNodePropertyString;
  'auth.token.provider.keypair.alias'?: ConfigNodePropertyString;
  'auth.token.provider.conn.timeout'?: ConfigNodePropertyInteger;
  'auth.token.provider.so.timeout'?: ConfigNodePropertyInteger;
  'auth.token.provider.client.id'?: ConfigNodePropertyString;
  'auth.token.provider.scope'?: ConfigNodePropertyString;
  'auth.token.provider.reuse.access.token'?: ConfigNodePropertyBoolean;
  'auth.token.provider.relaxed.ssl'?: ConfigNodePropertyBoolean;
  'token.request.customizer.type'?: ConfigNodePropertyString;
  'auth.token.validator.type'?: ConfigNodePropertyString;
}

