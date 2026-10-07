import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties { 
  name?: ConfigNodePropertyString;
  type?: ConfigNodePropertyDropDown;
  importMode?: ConfigNodePropertyString;
  aclHandling?: ConfigNodePropertyString;
  'package.roots'?: ConfigNodePropertyString;
  'package.filters'?: ConfigNodePropertyArray;
  'property.filters'?: ConfigNodePropertyArray;
  tempFsFolder?: ConfigNodePropertyString;
  useBinaryReferences?: ConfigNodePropertyBoolean;
  autoSaveThreshold?: ConfigNodePropertyInteger;
  cleanupDelay?: ConfigNodePropertyInteger;
  fileThreshold?: ConfigNodePropertyInteger;
  MEGA_BYTES?: ConfigNodePropertyDropDown;
  useOffHeapMemory?: ConfigNodePropertyBoolean;
  digestAlgorithm?: ConfigNodePropertyDropDown;
  monitoringQueueSize?: ConfigNodePropertyInteger;
  pathsMapping?: ConfigNodePropertyArray;
  strictImport?: ConfigNodePropertyBoolean;
}

