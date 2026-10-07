package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties(
  defaultExternalizerDomain: Option[ConfigNodePropertyString]
)

object ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties {
  implicit lazy val comDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesJsonFormat: Format[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties] = Json.format[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties]
}

