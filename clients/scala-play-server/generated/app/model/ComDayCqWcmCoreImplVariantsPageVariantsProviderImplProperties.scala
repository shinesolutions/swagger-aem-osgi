package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties(
  defaultExternalizerDomain: Option[ConfigNodePropertyString]
)

object ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties {
  implicit lazy val comDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesJsonFormat: Format[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties] = Json.format[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties]
}

