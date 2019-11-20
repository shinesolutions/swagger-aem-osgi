/**
* Adobe Experience Manager OSGI config (AEM) API
* Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
*
* OpenAPI spec version: 1.0.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.ConfigNodePropertyBoolean
import org.openapitools.client.models.ConfigNodePropertyInteger
import org.openapitools.client.models.ConfigNodePropertyString

/**
 * 
 * @param disabled 
 * @param debug 
 * @param localIndexDir 
 * @param enableOpenIndexAsync 
 * @param threadPoolSize 
 * @param prefetchIndexFiles 
 * @param extractedTextCacheSizeInMB 
 * @param extractedTextCacheExpiryInSecs 
 * @param alwaysUsePreExtractedCache 
 * @param booleanClauseLimit 
 * @param enableHybridIndexing 
 * @param hybridQueueSize 
 * @param disableStoredIndexDefinition 
 * @param deletedBlobsCollectionEnabled 
 * @param propIndexCleanerIntervalInSecs 
 * @param enableSingleBlobIndexFiles 
 */
data class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties (
    val disabled: ConfigNodePropertyBoolean? = null,
    val debug: ConfigNodePropertyBoolean? = null,
    val localIndexDir: ConfigNodePropertyString? = null,
    val enableOpenIndexAsync: ConfigNodePropertyBoolean? = null,
    val threadPoolSize: ConfigNodePropertyInteger? = null,
    val prefetchIndexFiles: ConfigNodePropertyBoolean? = null,
    val extractedTextCacheSizeInMB: ConfigNodePropertyInteger? = null,
    val extractedTextCacheExpiryInSecs: ConfigNodePropertyInteger? = null,
    val alwaysUsePreExtractedCache: ConfigNodePropertyBoolean? = null,
    val booleanClauseLimit: ConfigNodePropertyInteger? = null,
    val enableHybridIndexing: ConfigNodePropertyBoolean? = null,
    val hybridQueueSize: ConfigNodePropertyInteger? = null,
    val disableStoredIndexDefinition: ConfigNodePropertyBoolean? = null,
    val deletedBlobsCollectionEnabled: ConfigNodePropertyBoolean? = null,
    val propIndexCleanerIntervalInSecs: ConfigNodePropertyInteger? = null,
    val enableSingleBlobIndexFiles: ConfigNodePropertyBoolean? = null
) {

}
