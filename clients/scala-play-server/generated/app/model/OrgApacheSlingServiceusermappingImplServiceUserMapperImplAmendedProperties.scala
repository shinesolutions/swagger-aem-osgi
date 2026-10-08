package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties(
  serviceRanking: Option[ConfigNodePropertyInteger],
  userMapping: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties {
  implicit lazy val orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesJsonFormat: Format[OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties] = Json.format[OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties]
}

