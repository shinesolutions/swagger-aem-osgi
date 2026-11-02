package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingServletsPostImplSlingPostServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingServletsPostImplSlingPostServletProperties(
  servletPostDateFormats: Option[ConfigNodePropertyArray],
  servletPostNodeNameHints: Option[ConfigNodePropertyArray],
  servletPostNodeNameMaxLength: Option[ConfigNodePropertyInteger],
  servletPostCheckinNewVersionableNodes: Option[ConfigNodePropertyBoolean],
  servletPostAutoCheckout: Option[ConfigNodePropertyBoolean],
  servletPostAutoCheckin: Option[ConfigNodePropertyBoolean],
  servletPostIgnorePattern: Option[ConfigNodePropertyString]
)

object OrgApacheSlingServletsPostImplSlingPostServletProperties {
  implicit lazy val orgApacheSlingServletsPostImplSlingPostServletPropertiesJsonFormat: Format[OrgApacheSlingServletsPostImplSlingPostServletProperties] = Json.format[OrgApacheSlingServletsPostImplSlingPostServletProperties]
}

