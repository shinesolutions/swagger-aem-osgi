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

package io.swagger.client.model
import play.api.libs.json._

case class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties (
                  htmllibmanagerTiming: Option[ConfigNodePropertyBoolean],
                  htmllibmanagerDebugInitJs: Option[ConfigNodePropertyString],
                  htmllibmanagerMinify: Option[ConfigNodePropertyBoolean],
                  htmllibmanagerDebug: Option[ConfigNodePropertyBoolean],
                  htmllibmanagerGzip: Option[ConfigNodePropertyBoolean],
                  htmllibmanagerMaxDataUriSize: Option[ConfigNodePropertyInteger],
                  htmllibmanagerMaxage: Option[ConfigNodePropertyInteger],
                  htmllibmanagerForceCQUrlInfo: Option[ConfigNodePropertyBoolean],
                  htmllibmanagerDefaultthemename: Option[ConfigNodePropertyString],
                  htmllibmanagerDefaultuserthemename: Option[ConfigNodePropertyString],
                  htmllibmanagerClientmanager: Option[ConfigNodePropertyString],
                  htmllibmanagerPathList: Option[ConfigNodePropertyArray],
                  htmllibmanagerExcludedPathList: Option[ConfigNodePropertyArray],
                  htmllibmanagerProcessorJs: Option[ConfigNodePropertyArray],
                  htmllibmanagerProcessorCss: Option[ConfigNodePropertyArray],
                  htmllibmanagerLongcachePatterns: Option[ConfigNodePropertyArray],
                  htmllibmanagerLongcacheFormat: Option[ConfigNodePropertyString],
                  htmllibmanagerUseFileSystemOutputCache: Option[ConfigNodePropertyBoolean],
                  htmllibmanagerFileSystemOutputCacheLocation: Option[ConfigNodePropertyString],
                  htmllibmanagerDisableReplacement: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties {
implicit val format: Format[ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties] = Json.format
}
