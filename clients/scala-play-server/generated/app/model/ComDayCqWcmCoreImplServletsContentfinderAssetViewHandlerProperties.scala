package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties(
  damShowexpired: Option[ConfigNodePropertyBoolean],
  damShowhidden: Option[ConfigNodePropertyBoolean],
  tagTitleSearch: Option[ConfigNodePropertyBoolean],
  guessTotal: Option[ConfigNodePropertyString],
  damExpiryProperty: Option[ConfigNodePropertyString]
)

object ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties {
  implicit lazy val comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesJsonFormat: Format[ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties] = Json.format[ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties]
}

