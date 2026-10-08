package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties(
  disabled: Option[ConfigNodePropertyBoolean],
  debug: Option[ConfigNodePropertyBoolean],
  localIndexDir: Option[ConfigNodePropertyString],
  enableOpenIndexAsync: Option[ConfigNodePropertyBoolean],
  threadPoolSize: Option[ConfigNodePropertyInteger],
  prefetchIndexFiles: Option[ConfigNodePropertyBoolean],
  extractedTextCacheSizeInMB: Option[ConfigNodePropertyInteger],
  extractedTextCacheExpiryInSecs: Option[ConfigNodePropertyInteger],
  alwaysUsePreExtractedCache: Option[ConfigNodePropertyBoolean],
  booleanClauseLimit: Option[ConfigNodePropertyInteger],
  enableHybridIndexing: Option[ConfigNodePropertyBoolean],
  hybridQueueSize: Option[ConfigNodePropertyInteger],
  disableStoredIndexDefinition: Option[ConfigNodePropertyBoolean],
  deletedBlobsCollectionEnabled: Option[ConfigNodePropertyBoolean],
  propIndexCleanerIntervalInSecs: Option[ConfigNodePropertyInteger],
  enableSingleBlobIndexFiles: Option[ConfigNodePropertyBoolean]
)

object OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties {
  implicit lazy val orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesJsonFormat: Format[OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties] = Json.format[OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties]
}

