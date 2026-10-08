import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties { 
  mongouri?: ConfigNodePropertyString;
  db?: ConfigNodePropertyString;
  socketKeepAlive?: ConfigNodePropertyBoolean;
  cache?: ConfigNodePropertyInteger;
  nodeCachePercentage?: ConfigNodePropertyInteger;
  prevDocCachePercentage?: ConfigNodePropertyInteger;
  childrenCachePercentage?: ConfigNodePropertyInteger;
  diffCachePercentage?: ConfigNodePropertyInteger;
  cacheSegmentCount?: ConfigNodePropertyInteger;
  cacheStackMoveDistance?: ConfigNodePropertyInteger;
  blobCacheSize?: ConfigNodePropertyInteger;
  persistentCache?: ConfigNodePropertyString;
  journalCache?: ConfigNodePropertyString;
  customBlobStore?: ConfigNodePropertyBoolean;
  journalGCInterval?: ConfigNodePropertyInteger;
  journalGCMaxAge?: ConfigNodePropertyInteger;
  prefetchExternalChanges?: ConfigNodePropertyBoolean;
  role?: ConfigNodePropertyString;
  versionGcMaxAgeInSecs?: ConfigNodePropertyInteger;
  versionGCExpression?: ConfigNodePropertyString;
  versionGCTimeLimitInSecs?: ConfigNodePropertyInteger;
  blobGcMaxAgeInSecs?: ConfigNodePropertyInteger;
  blobTrackSnapshotIntervalInSecs?: ConfigNodePropertyInteger;
  'repository.home'?: ConfigNodePropertyString;
  maxReplicationLagInSecs?: ConfigNodePropertyInteger;
  documentStoreType?: ConfigNodePropertyDropDown;
  bundlingDisabled?: ConfigNodePropertyBoolean;
  updateLimit?: ConfigNodePropertyInteger;
  persistentCacheIncludes?: ConfigNodePropertyArray;
  leaseCheckMode?: ConfigNodePropertyDropDown;
}

