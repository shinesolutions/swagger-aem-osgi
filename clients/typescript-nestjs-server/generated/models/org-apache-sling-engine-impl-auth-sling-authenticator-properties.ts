import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties { 
  'osgi.http.whiteboard.context.select'?: ConfigNodePropertyString;
  'osgi.http.whiteboard.listener'?: ConfigNodePropertyString;
  'auth.sudo.cookie'?: ConfigNodePropertyString;
  'auth.sudo.parameter'?: ConfigNodePropertyString;
  'auth.annonymous'?: ConfigNodePropertyBoolean;
  'sling.auth.requirements'?: ConfigNodePropertyArray;
  'sling.auth.anonymous.user'?: ConfigNodePropertyString;
  'sling.auth.anonymous.password'?: ConfigNodePropertyString;
  'auth.http'?: ConfigNodePropertyDropDown;
  'auth.http.realm'?: ConfigNodePropertyString;
  'auth.uri.suffix'?: ConfigNodePropertyArray;
}

