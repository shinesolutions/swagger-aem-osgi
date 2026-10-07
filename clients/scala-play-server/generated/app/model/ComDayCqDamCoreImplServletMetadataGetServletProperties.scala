package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplServletMetadataGetServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplServletMetadataGetServletProperties(
  slingServletResourceTypes: Option[ConfigNodePropertyString],
  slingServletMethods: Option[ConfigNodePropertyString],
  slingServletExtensions: Option[ConfigNodePropertyString],
  slingServletSelectors: Option[ConfigNodePropertyString]
)

object ComDayCqDamCoreImplServletMetadataGetServletProperties {
  implicit lazy val comDayCqDamCoreImplServletMetadataGetServletPropertiesJsonFormat: Format[ComDayCqDamCoreImplServletMetadataGetServletProperties] = Json.format[ComDayCqDamCoreImplServletMetadataGetServletProperties]
}

