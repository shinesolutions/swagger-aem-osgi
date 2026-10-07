package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingServletsGetDefaultGetServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingServletsGetDefaultGetServletProperties(
  aliases: Option[ConfigNodePropertyArray],
  index: Option[ConfigNodePropertyBoolean],
  indexFiles: Option[ConfigNodePropertyArray],
  enableHtml: Option[ConfigNodePropertyBoolean],
  enableJson: Option[ConfigNodePropertyBoolean],
  enableTxt: Option[ConfigNodePropertyBoolean],
  enableXml: Option[ConfigNodePropertyBoolean],
  jsonMaximumresults: Option[ConfigNodePropertyInteger],
  ecmaSuport: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingServletsGetDefaultGetServletProperties {
  implicit lazy val orgApacheSlingServletsGetDefaultGetServletPropertiesJsonFormat: Format[OrgApacheSlingServletsGetDefaultGetServletProperties] = Json.format[OrgApacheSlingServletsGetDefaultGetServletProperties]
}

