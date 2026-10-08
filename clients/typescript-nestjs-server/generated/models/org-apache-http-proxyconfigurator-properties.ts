import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheHttpProxyconfiguratorProperties { 
  'proxy.enabled'?: ConfigNodePropertyBoolean;
  'proxy.host'?: ConfigNodePropertyString;
  'proxy.port'?: ConfigNodePropertyInteger;
  'proxy.user'?: ConfigNodePropertyString;
  'proxy.password'?: ConfigNodePropertyString;
  'proxy.exceptions'?: ConfigNodePropertyArray;
}

