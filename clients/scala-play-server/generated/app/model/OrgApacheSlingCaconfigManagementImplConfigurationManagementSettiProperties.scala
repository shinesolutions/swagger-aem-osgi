package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties(
  ignorePropertyNameRegex: Option[ConfigNodePropertyArray],
  configCollectionPropertiesResourceNames: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties {
  implicit lazy val orgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesJsonFormat: Format[OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties] = Json.format[OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties]
}

