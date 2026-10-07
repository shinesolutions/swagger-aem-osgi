import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteAuthImsImplIMSProviderImplProperties { 
  'oauth.provider.id'?: ConfigNodePropertyString;
  'oauth.provider.ims.authorization.url'?: ConfigNodePropertyString;
  'oauth.provider.ims.token.url'?: ConfigNodePropertyString;
  'oauth.provider.ims.profile.url'?: ConfigNodePropertyString;
  'oauth.provider.ims.extended.details.urls'?: ConfigNodePropertyArray;
  'oauth.provider.ims.validate.token.url'?: ConfigNodePropertyString;
  'oauth.provider.ims.session.property'?: ConfigNodePropertyString;
  'oauth.provider.ims.service.token.client.id'?: ConfigNodePropertyString;
  'oauth.provider.ims.service.token.client.secret'?: ConfigNodePropertyString;
  'oauth.provider.ims.service.token'?: ConfigNodePropertyString;
  'ims.org.ref'?: ConfigNodePropertyString;
  'ims.group.mapping'?: ConfigNodePropertyArray;
  'oauth.provider.ims.only.license.group'?: ConfigNodePropertyBoolean;
}

