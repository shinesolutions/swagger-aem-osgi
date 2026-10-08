import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties { 
  name?: ConfigNodePropertyString;
  title?: ConfigNodePropertyString;
  details?: ConfigNodePropertyString;
  enabled?: ConfigNodePropertyBoolean;
  serviceName?: ConfigNodePropertyString;
  'log.level'?: ConfigNodePropertyDropDown;
  'allowed.roots'?: ConfigNodePropertyArray;
  'queue.processing.enabled'?: ConfigNodePropertyBoolean;
  'packageImporter.endpoints'?: ConfigNodePropertyArray;
  passiveQueues?: ConfigNodePropertyArray;
  priorityQueues?: ConfigNodePropertyArray;
  'retry.strategy'?: ConfigNodePropertyDropDown;
  'retry.attempts'?: ConfigNodePropertyInteger;
  'requestAuthorizationStrategy.target'?: ConfigNodePropertyString;
  'transportSecretProvider.target'?: ConfigNodePropertyString;
  'packageBuilder.target'?: ConfigNodePropertyString;
  'triggers.target'?: ConfigNodePropertyString;
  'queue.provider'?: ConfigNodePropertyDropDown;
  'async.delivery'?: ConfigNodePropertyBoolean;
  'http.conn.timeout'?: ConfigNodePropertyInteger;
}

