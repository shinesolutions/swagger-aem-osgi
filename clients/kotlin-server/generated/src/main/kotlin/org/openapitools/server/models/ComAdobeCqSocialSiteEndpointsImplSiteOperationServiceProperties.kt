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
import org.openapitools.server.models.ConfigNodePropertyString

/**
 * 
 * @param fieldWhitelist 
 * @param sitePathFilters 
 * @param sitePackageGroup 
 */
data class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties (
    val fieldWhitelist: ConfigNodePropertyArray? = null,
    val sitePathFilters: ConfigNodePropertyArray? = null,
    val sitePackageGroup: ConfigNodePropertyString? = null
) {

}
