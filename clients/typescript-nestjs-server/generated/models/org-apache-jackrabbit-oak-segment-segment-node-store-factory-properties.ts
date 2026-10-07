import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties { 
  'repository.home'?: ConfigNodePropertyString;
  'tarmk.mode'?: ConfigNodePropertyString;
  'tarmk.size'?: ConfigNodePropertyInteger;
  'segmentCache.size'?: ConfigNodePropertyInteger;
  'stringCache.size'?: ConfigNodePropertyInteger;
  'templateCache.size'?: ConfigNodePropertyInteger;
  'stringDeduplicationCache.size'?: ConfigNodePropertyInteger;
  'templateDeduplicationCache.size'?: ConfigNodePropertyInteger;
  'nodeDeduplicationCache.size'?: ConfigNodePropertyInteger;
  pauseCompaction?: ConfigNodePropertyBoolean;
  'compaction.retryCount'?: ConfigNodePropertyInteger;
  'compaction.force.timeout'?: ConfigNodePropertyInteger;
  'compaction.sizeDeltaEstimation'?: ConfigNodePropertyInteger;
  'compaction.disableEstimation'?: ConfigNodePropertyBoolean;
  'compaction.retainedGenerations'?: ConfigNodePropertyInteger;
  'compaction.memoryThreshold'?: ConfigNodePropertyInteger;
  'compaction.progressLog'?: ConfigNodePropertyInteger;
  standby?: ConfigNodePropertyBoolean;
  customBlobStore?: ConfigNodePropertyBoolean;
  customSegmentStore?: ConfigNodePropertyBoolean;
  splitPersistence?: ConfigNodePropertyBoolean;
  'repository.backup.dir'?: ConfigNodePropertyString;
  blobGcMaxAgeInSecs?: ConfigNodePropertyInteger;
  blobTrackSnapshotIntervalInSecs?: ConfigNodePropertyInteger;
  role?: ConfigNodePropertyString;
  registerDescriptors?: ConfigNodePropertyBoolean;
  dispatchChanges?: ConfigNodePropertyBoolean;
}

