package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties(
  totalWidth: Option[ConfigNodePropertyInteger],
  colWidthName: Option[ConfigNodePropertyInteger],
  colWidthResult: Option[ConfigNodePropertyInteger],
  colWidthTiming: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {
  implicit lazy val orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesJsonFormat: Format[OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties] = Json.format[OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties]
}

