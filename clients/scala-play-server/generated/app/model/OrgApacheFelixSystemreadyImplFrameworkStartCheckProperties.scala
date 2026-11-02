package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheFelixSystemreadyImplFrameworkStartCheckProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties(
  timeout: Option[ConfigNodePropertyInteger],
  targetStartLevel: Option[ConfigNodePropertyInteger],
  targetStartLevelPropName: Option[ConfigNodePropertyString],
  `type`: Option[ConfigNodePropertyDropDown]
)

object OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties {
  implicit lazy val orgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesJsonFormat: Format[OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties] = Json.format[OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties]
}

