import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeCqSocialUserImplTransportHttpToPublisherProperties { 
  enable?: ConfigNodePropertyBoolean;
  'agent.configuration'?: ConfigNodePropertyArray;
  'context.path'?: ConfigNodePropertyString;
  'disabled.cipher.suites'?: ConfigNodePropertyArray;
  'enabled.cipher.suites'?: ConfigNodePropertyArray;
}

