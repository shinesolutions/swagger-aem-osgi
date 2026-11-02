package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties(
  schedulerPeriod: Option[ConfigNodePropertyInteger],
  schedulerConcurrent: Option[ConfigNodePropertyBoolean],
  goodLinkTestInterval: Option[ConfigNodePropertyInteger],
  badLinkTestInterval: Option[ConfigNodePropertyInteger],
  linkUnusedInterval: Option[ConfigNodePropertyInteger],
  connectionTimeout: Option[ConfigNodePropertyInteger]
)

object ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {
  implicit lazy val comDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesJsonFormat: Format[ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties] = Json.format[ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties]
}

