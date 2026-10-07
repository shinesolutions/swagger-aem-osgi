import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties { 
  'hc.tags'?: ConfigNodePropertyArray;
  'dispatcher.address'?: ConfigNodePropertyString;
  'dispatcher.filter.allowed'?: ConfigNodePropertyArray;
  'dispatcher.filter.blocked'?: ConfigNodePropertyArray;
}

