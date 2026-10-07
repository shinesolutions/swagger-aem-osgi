import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqWcmFoundationImplHTTPAuthHandlerProperties { 
  path?: ConfigNodePropertyString;
  'auth.http.nologin'?: ConfigNodePropertyBoolean;
  'auth.http.realm'?: ConfigNodePropertyString;
  'auth.default.loginpage'?: ConfigNodePropertyString;
  'auth.cred.form'?: ConfigNodePropertyArray;
  'auth.cred.utf8'?: ConfigNodePropertyArray;
}

