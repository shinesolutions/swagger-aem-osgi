import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties { 
  name?: ConfigNodePropertyString;
  type?: ConfigNodePropertyDropDown;
  'format.target'?: ConfigNodePropertyString;
  tempFsFolder?: ConfigNodePropertyString;
  fileThreshold?: ConfigNodePropertyInteger;
  memoryUnit?: ConfigNodePropertyDropDown;
  useOffHeapMemory?: ConfigNodePropertyBoolean;
  digestAlgorithm?: ConfigNodePropertyDropDown;
  monitoringQueueSize?: ConfigNodePropertyInteger;
  cleanupDelay?: ConfigNodePropertyInteger;
  'package.filters'?: ConfigNodePropertyArray;
  'property.filters'?: ConfigNodePropertyArray;
}

