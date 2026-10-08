import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComDayCqMailerDefaultMailServiceProperties { 
  'smtp.host'?: ConfigNodePropertyString;
  'smtp.port'?: ConfigNodePropertyInteger;
  'smtp.user'?: ConfigNodePropertyString;
  'smtp.password'?: ConfigNodePropertyString;
  'from.address'?: ConfigNodePropertyString;
  'smtp.ssl'?: ConfigNodePropertyBoolean;
  'smtp.starttls'?: ConfigNodePropertyBoolean;
  'debug.email'?: ConfigNodePropertyBoolean;
}

