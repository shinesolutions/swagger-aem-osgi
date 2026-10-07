import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComAdobeCqSocialSyncImplDiffChangesObserverProperties { 
  enabled?: ConfigNodePropertyBoolean;
  agentName?: ConfigNodePropertyString;
  diffPath?: ConfigNodePropertyString;
  propertyNames?: ConfigNodePropertyString;
}

