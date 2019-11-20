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

case class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties (
                  datasourceName: Option[ConfigNodePropertyString],
                  datasourceSvcPropName: Option[ConfigNodePropertyString],
                  datasourceJndiName: Option[ConfigNodePropertyString],
                  jndiProperties: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties {
implicit val format: Format[OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties] = Json.format
}
