package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingJcrRepoinitRepositoryInitializerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties(
  references: Option[ConfigNodePropertyArray],
  scripts: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingJcrRepoinitRepositoryInitializerProperties {
  implicit lazy val orgApacheSlingJcrRepoinitRepositoryInitializerPropertiesJsonFormat: Format[OrgApacheSlingJcrRepoinitRepositoryInitializerProperties] = Json.format[OrgApacheSlingJcrRepoinitRepositoryInitializerProperties]
}

