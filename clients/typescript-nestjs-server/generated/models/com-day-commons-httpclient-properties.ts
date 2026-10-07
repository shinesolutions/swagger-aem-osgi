import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCommonsHttpclientProperties { 
  'proxy.enabled'?: ConfigNodePropertyBoolean;
  'proxy.host'?: ConfigNodePropertyString;
  'proxy.user'?: ConfigNodePropertyString;
  'proxy.password'?: ConfigNodePropertyString;
  'proxy.ntlm.host'?: ConfigNodePropertyString;
  'proxy.ntlm.domain'?: ConfigNodePropertyString;
  'proxy.exceptions'?: ConfigNodePropertyArray;
}

