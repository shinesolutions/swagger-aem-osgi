package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for configNodePropertyDropDown_type.
  * @param labels Drop Down label
  * @param values Drown Down value
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConfigNodePropertyDropDownType(
  labels: Option[OasAnyTypeNotMapped],
  values: Option[OasAnyTypeNotMapped]
)

object ConfigNodePropertyDropDownType {
  implicit lazy val configNodePropertyDropDownTypeJsonFormat: Format[ConfigNodePropertyDropDownType] = Json.format[ConfigNodePropertyDropDownType]
}

