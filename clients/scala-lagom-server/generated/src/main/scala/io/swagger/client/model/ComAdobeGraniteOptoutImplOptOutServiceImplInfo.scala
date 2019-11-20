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

case class ComAdobeGraniteOptoutImplOptOutServiceImplInfo (
                  pid: Option[String],
                  title: Option[String],
                  description: Option[String],
                  properties: Option[ComAdobeGraniteOptoutImplOptOutServiceImplProperties],
                  bundleLocation: Option[String],
                  serviceLocation: Option[String]
)

object ComAdobeGraniteOptoutImplOptOutServiceImplInfo {
implicit val format: Format[ComAdobeGraniteOptoutImplOptOutServiceImplInfo] = Json.format
}
