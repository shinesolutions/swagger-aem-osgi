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

case class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties (
                  eventTopics: Option[ConfigNodePropertyString],
                  eventFilter: Option[ConfigNodePropertyString],
                  translateListenerType: Option[ConfigNodePropertyArray],
                  translatePropertyList: Option[ConfigNodePropertyArray],
                  poolSize: Option[ConfigNodePropertyInteger],
                  maxPoolSize: Option[ConfigNodePropertyInteger],
                  queueSize: Option[ConfigNodePropertyInteger],
                  keepAliveTime: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties {
implicit val format: Format[ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties] = Json.format
}
