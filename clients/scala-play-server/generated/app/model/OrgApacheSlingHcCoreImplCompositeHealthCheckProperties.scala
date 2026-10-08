package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingHcCoreImplCompositeHealthCheckProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties(
  hcName: Option[ConfigNodePropertyString],
  hcTags: Option[ConfigNodePropertyArray],
  hcMbeanName: Option[ConfigNodePropertyString],
  filterTags: Option[ConfigNodePropertyArray],
  filterCombineTagsWithOr: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingHcCoreImplCompositeHealthCheckProperties {
  implicit lazy val orgApacheSlingHcCoreImplCompositeHealthCheckPropertiesJsonFormat: Format[OrgApacheSlingHcCoreImplCompositeHealthCheckProperties] = Json.format[OrgApacheSlingHcCoreImplCompositeHealthCheckProperties]
}

