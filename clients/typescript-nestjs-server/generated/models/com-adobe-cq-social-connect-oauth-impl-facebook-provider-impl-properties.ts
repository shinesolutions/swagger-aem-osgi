import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties { 
  'oauth.provider.id'?: ConfigNodePropertyString;
  'oauth.cloud.config.root'?: ConfigNodePropertyString;
  'provider.config.root'?: ConfigNodePropertyString;
  'provider.config.create.tags.enabled'?: ConfigNodePropertyBoolean;
  'provider.config.user.folder'?: ConfigNodePropertyDropDown;
  'provider.config.facebook.fetch.fields'?: ConfigNodePropertyBoolean;
  'provider.config.facebook.fields'?: ConfigNodePropertyArray;
  'provider.config.refresh.userdata.enabled'?: ConfigNodePropertyBoolean;
}

