package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingServletsResolverSlingServletResolverProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingServletsResolverSlingServletResolverProperties(
  servletresolverServletRoot: Option[ConfigNodePropertyString],
  servletresolverCacheSize: Option[ConfigNodePropertyInteger],
  servletresolverPaths: Option[ConfigNodePropertyArray],
  servletresolverDefaultExtensions: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingServletsResolverSlingServletResolverProperties {
  implicit lazy val orgApacheSlingServletsResolverSlingServletResolverPropertiesJsonFormat: Format[OrgApacheSlingServletsResolverSlingServletResolverProperties] = Json.format[OrgApacheSlingServletsResolverSlingServletResolverProperties]
}

