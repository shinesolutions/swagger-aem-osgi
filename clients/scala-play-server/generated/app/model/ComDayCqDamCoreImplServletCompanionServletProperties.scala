package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplServletCompanionServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplServletCompanionServletProperties(
  moreInfo: Option[ConfigNodePropertyString],
  mntOverlayDamGuiContentAssetsMoreinfoHtmlPath: Option[ConfigNodePropertyString]
)

object ComDayCqDamCoreImplServletCompanionServletProperties {
  implicit lazy val comDayCqDamCoreImplServletCompanionServletPropertiesJsonFormat: Format[ComDayCqDamCoreImplServletCompanionServletProperties] = Json.format[ComDayCqDamCoreImplServletCompanionServletProperties]
}

