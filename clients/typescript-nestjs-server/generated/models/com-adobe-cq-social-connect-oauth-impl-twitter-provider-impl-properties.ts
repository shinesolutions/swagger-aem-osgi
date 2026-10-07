import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties { 
  'oauth.provider.id'?: ConfigNodePropertyString;
  'oauth.cloud.config.root'?: ConfigNodePropertyString;
  'provider.config.root'?: ConfigNodePropertyString;
  'provider.config.user.folder'?: ConfigNodePropertyDropDown;
  'provider.config.twitter.enable.params'?: ConfigNodePropertyBoolean;
  'provider.config.twitter.params'?: ConfigNodePropertyArray;
  'provider.config.refresh.userdata.enabled'?: ConfigNodePropertyBoolean;
}

