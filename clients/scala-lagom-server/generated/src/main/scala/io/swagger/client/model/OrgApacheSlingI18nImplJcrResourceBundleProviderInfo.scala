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

case class OrgApacheSlingI18nImplJcrResourceBundleProviderInfo (
                  pid: Option[String],
                  title: Option[String],
                  description: Option[String],
                  properties: Option[OrgApacheSlingI18nImplJcrResourceBundleProviderProperties],
                  additionalProperties: Option[String],
                  bundleLocation: Option[String],
                  serviceLocation: Option[String]
)

object OrgApacheSlingI18nImplJcrResourceBundleProviderInfo {
implicit val format: Format[OrgApacheSlingI18nImplJcrResourceBundleProviderInfo] = Json.format
}
