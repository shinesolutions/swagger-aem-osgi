import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties { 
  enabled?: ConfigNodePropertyBoolean;
  agentName?: ConfigNodePropertyString;
  diffPath?: ConfigNodePropertyString;
  observedPath?: ConfigNodePropertyString;
  serviceName?: ConfigNodePropertyString;
  propertyNames?: ConfigNodePropertyString;
  distributionDelay?: ConfigNodePropertyInteger;
  'serviceUser.target'?: ConfigNodePropertyString;
}

