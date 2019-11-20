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

import org.openapitools.client.models.ConfigNodePropertyArray
import org.openapitools.client.models.ConfigNodePropertyBoolean
import org.openapitools.client.models.ConfigNodePropertyString

/**
 * 
 * @param path 
 * @param authPeriodhttpPeriodnologin 
 * @param authPeriodhttpPeriodrealm 
 * @param authPerioddefaultPeriodloginpage 
 * @param authPeriodcredPeriodform 
 * @param authPeriodcredPeriodutf8 
 */
data class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties (
    val path: ConfigNodePropertyString? = null,
    val authPeriodhttpPeriodnologin: ConfigNodePropertyBoolean? = null,
    val authPeriodhttpPeriodrealm: ConfigNodePropertyString? = null,
    val authPerioddefaultPeriodloginpage: ConfigNodePropertyString? = null,
    val authPeriodcredPeriodform: ConfigNodePropertyArray? = null,
    val authPeriodcredPeriodutf8: ConfigNodePropertyArray? = null
) {

}
