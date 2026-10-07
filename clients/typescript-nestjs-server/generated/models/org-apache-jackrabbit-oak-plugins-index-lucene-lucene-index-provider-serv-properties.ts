import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties { 
  disabled?: ConfigNodePropertyBoolean;
  debug?: ConfigNodePropertyBoolean;
  localIndexDir?: ConfigNodePropertyString;
  enableOpenIndexAsync?: ConfigNodePropertyBoolean;
  threadPoolSize?: ConfigNodePropertyInteger;
  prefetchIndexFiles?: ConfigNodePropertyBoolean;
  extractedTextCacheSizeInMB?: ConfigNodePropertyInteger;
  extractedTextCacheExpiryInSecs?: ConfigNodePropertyInteger;
  alwaysUsePreExtractedCache?: ConfigNodePropertyBoolean;
  booleanClauseLimit?: ConfigNodePropertyInteger;
  enableHybridIndexing?: ConfigNodePropertyBoolean;
  hybridQueueSize?: ConfigNodePropertyInteger;
  disableStoredIndexDefinition?: ConfigNodePropertyBoolean;
  deletedBlobsCollectionEnabled?: ConfigNodePropertyBoolean;
  propIndexCleanerIntervalInSecs?: ConfigNodePropertyInteger;
  enableSingleBlobIndexFiles?: ConfigNodePropertyBoolean;
}

