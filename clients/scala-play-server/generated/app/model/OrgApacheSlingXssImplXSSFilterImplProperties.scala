package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingXssImplXSSFilterImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingXssImplXSSFilterImplProperties(
  policyPath: Option[ConfigNodePropertyString]
)

object OrgApacheSlingXssImplXSSFilterImplProperties {
  implicit lazy val orgApacheSlingXssImplXSSFilterImplPropertiesJsonFormat: Format[OrgApacheSlingXssImplXSSFilterImplProperties] = Json.format[OrgApacheSlingXssImplXSSFilterImplProperties]
}

