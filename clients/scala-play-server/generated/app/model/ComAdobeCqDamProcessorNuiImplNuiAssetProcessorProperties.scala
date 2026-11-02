package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties(
  nuiEnabled: Option[ConfigNodePropertyBoolean],
  nuiServiceUrl: Option[ConfigNodePropertyString],
  nuiApiKey: Option[ConfigNodePropertyString]
)

object ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties {
  implicit lazy val comAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesJsonFormat: Format[ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties] = Json.format[ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties]
}

