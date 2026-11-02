package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for configNodePropertyDropDown.
  * @param name property name
  * @param optional True if optional
  * @param isSet True if property is set
  * @param value Property value
  * @param description Property description
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConfigNodePropertyDropDown(
  name: Option[String],
  optional: Option[Boolean],
  isSet: Option[Boolean],
  `type`: Option[ConfigNodePropertyDropDownType],
  value: Option[OasAnyTypeNotMapped],
  description: Option[String]
)

object ConfigNodePropertyDropDown {
  implicit lazy val configNodePropertyDropDownJsonFormat: Format[ConfigNodePropertyDropDown] = Json.format[ConfigNodePropertyDropDown]
}

