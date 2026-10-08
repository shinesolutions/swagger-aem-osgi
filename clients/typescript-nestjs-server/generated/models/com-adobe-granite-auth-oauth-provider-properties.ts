import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteAuthOauthProviderProperties { 
  'oauth.config.id'?: ConfigNodePropertyString;
  'oauth.client.id'?: ConfigNodePropertyString;
  'oauth.client.secret'?: ConfigNodePropertyString;
  'oauth.scope'?: ConfigNodePropertyArray;
  'oauth.config.provider.id'?: ConfigNodePropertyString;
  'oauth.create.users'?: ConfigNodePropertyBoolean;
  'oauth.userid.property'?: ConfigNodePropertyString;
  'force.strict.username.matching'?: ConfigNodePropertyBoolean;
  'oauth.encode.userids'?: ConfigNodePropertyBoolean;
  'oauth.hash.userids'?: ConfigNodePropertyBoolean;
  'oauth.callBackUrl'?: ConfigNodePropertyString;
  'oauth.access.token.persist'?: ConfigNodePropertyBoolean;
  'oauth.access.token.persist.cookie'?: ConfigNodePropertyBoolean;
  'oauth.csrf.state.protection'?: ConfigNodePropertyBoolean;
  'oauth.redirect.request.params'?: ConfigNodePropertyBoolean;
  'oauth.config.siblings.allow'?: ConfigNodePropertyBoolean;
}

