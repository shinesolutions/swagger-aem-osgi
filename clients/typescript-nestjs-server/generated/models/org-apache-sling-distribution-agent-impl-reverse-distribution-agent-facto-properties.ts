import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties { 
  name?: ConfigNodePropertyString;
  title?: ConfigNodePropertyString;
  details?: ConfigNodePropertyString;
  enabled?: ConfigNodePropertyBoolean;
  serviceName?: ConfigNodePropertyString;
  'log.level'?: ConfigNodePropertyDropDown;
  'queue.processing.enabled'?: ConfigNodePropertyBoolean;
  'packageExporter.endpoints'?: ConfigNodePropertyArray;
  'pull.items'?: ConfigNodePropertyInteger;
  'http.conn.timeout'?: ConfigNodePropertyInteger;
  'requestAuthorizationStrategy.target'?: ConfigNodePropertyString;
  'transportSecretProvider.target'?: ConfigNodePropertyString;
  'packageBuilder.target'?: ConfigNodePropertyString;
  'triggers.target'?: ConfigNodePropertyString;
}

