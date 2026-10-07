package models

type OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties struct {

	Disabled ConfigNodePropertyBoolean `json:"disabled,omitempty"`

	Debug ConfigNodePropertyBoolean `json:"debug,omitempty"`

	LocalIndexDir ConfigNodePropertyString `json:"localIndexDir,omitempty"`

	EnableOpenIndexAsync ConfigNodePropertyBoolean `json:"enableOpenIndexAsync,omitempty"`

	ThreadPoolSize ConfigNodePropertyInteger `json:"threadPoolSize,omitempty"`

	PrefetchIndexFiles ConfigNodePropertyBoolean `json:"prefetchIndexFiles,omitempty"`

	ExtractedTextCacheSizeInMB ConfigNodePropertyInteger `json:"extractedTextCacheSizeInMB,omitempty"`

	ExtractedTextCacheExpiryInSecs ConfigNodePropertyInteger `json:"extractedTextCacheExpiryInSecs,omitempty"`

	AlwaysUsePreExtractedCache ConfigNodePropertyBoolean `json:"alwaysUsePreExtractedCache,omitempty"`

	BooleanClauseLimit ConfigNodePropertyInteger `json:"booleanClauseLimit,omitempty"`

	EnableHybridIndexing ConfigNodePropertyBoolean `json:"enableHybridIndexing,omitempty"`

	HybridQueueSize ConfigNodePropertyInteger `json:"hybridQueueSize,omitempty"`

	DisableStoredIndexDefinition ConfigNodePropertyBoolean `json:"disableStoredIndexDefinition,omitempty"`

	DeletedBlobsCollectionEnabled ConfigNodePropertyBoolean `json:"deletedBlobsCollectionEnabled,omitempty"`

	PropIndexCleanerIntervalInSecs ConfigNodePropertyInteger `json:"propIndexCleanerIntervalInSecs,omitempty"`

	EnableSingleBlobIndexFiles ConfigNodePropertyBoolean `json:"enableSingleBlobIndexFiles,omitempty"`
}
