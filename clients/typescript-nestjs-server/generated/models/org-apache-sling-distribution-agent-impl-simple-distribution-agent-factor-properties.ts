import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties { 
  name?: ConfigNodePropertyString;
  title?: ConfigNodePropertyString;
  details?: ConfigNodePropertyString;
  enabled?: ConfigNodePropertyBoolean;
  serviceName?: ConfigNodePropertyString;
  'log.level'?: ConfigNodePropertyDropDown;
  'queue.processing.enabled'?: ConfigNodePropertyBoolean;
  'packageExporter.target'?: ConfigNodePropertyString;
  'packageImporter.target'?: ConfigNodePropertyString;
  'requestAuthorizationStrategy.target'?: ConfigNodePropertyString;
  'triggers.target'?: ConfigNodePropertyString;
}

