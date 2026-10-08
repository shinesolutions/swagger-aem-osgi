package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for configNodePropertyString.
  * @param name property name
  * @param optional True if optional
  * @param isSet True if property is set
  * @param `type` Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
  * @param value Property value
  * @param description Property description
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConfigNodePropertyString(
  name: Option[String],
  optional: Option[Boolean],
  isSet: Option[Boolean],
  `type`: Option[Int],
  value: Option[String],
  description: Option[String]
)

object ConfigNodePropertyString {
  implicit lazy val configNodePropertyStringJsonFormat: Format[ConfigNodePropertyString] = Json.format[ConfigNodePropertyString]
}

