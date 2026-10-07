package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingSecurityImplContentDispositionFilterProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingSecurityImplContentDispositionFilterProperties(
  slingContentDispositionPaths: Option[ConfigNodePropertyArray],
  slingContentDispositionExcludedPaths: Option[ConfigNodePropertyArray],
  slingContentDispositionAllPaths: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingSecurityImplContentDispositionFilterProperties {
  implicit lazy val orgApacheSlingSecurityImplContentDispositionFilterPropertiesJsonFormat: Format[OrgApacheSlingSecurityImplContentDispositionFilterProperties] = Json.format[OrgApacheSlingSecurityImplContentDispositionFilterProperties]
}

