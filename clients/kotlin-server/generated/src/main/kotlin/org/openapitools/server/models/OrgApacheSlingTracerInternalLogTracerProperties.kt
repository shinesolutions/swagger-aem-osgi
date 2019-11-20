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
package org.openapitools.server.models

import org.openapitools.server.models.ConfigNodePropertyArray
import org.openapitools.server.models.ConfigNodePropertyBoolean
import org.openapitools.server.models.ConfigNodePropertyInteger

/**
 * 
 * @param tracerSets 
 * @param enabled 
 * @param servletEnabled 
 * @param recordingCacheSizeInMB 
 * @param recordingCacheDurationInSecs 
 * @param recordingCompressionEnabled 
 * @param gzipResponse 
 */
data class OrgApacheSlingTracerInternalLogTracerProperties (
    val tracerSets: ConfigNodePropertyArray? = null,
    val enabled: ConfigNodePropertyBoolean? = null,
    val servletEnabled: ConfigNodePropertyBoolean? = null,
    val recordingCacheSizeInMB: ConfigNodePropertyInteger? = null,
    val recordingCacheDurationInSecs: ConfigNodePropertyInteger? = null,
    val recordingCompressionEnabled: ConfigNodePropertyBoolean? = null,
    val gzipResponse: ConfigNodePropertyBoolean? = null
) {

}
