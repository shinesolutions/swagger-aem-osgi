import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeCqDeserfwImplDeserializationFirewallImplProperties { 
  'firewall.deserialization.whitelist'?: ConfigNodePropertyArray;
  'firewall.deserialization.blacklist'?: ConfigNodePropertyArray;
  'firewall.deserialization.diagnostics'?: ConfigNodePropertyString;
}

