package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(
  schedulerPeriod: Option[ConfigNodePropertyInteger],
  schedulerConcurrent: Option[ConfigNodePropertyBoolean],
  serviceBadLinkToleranceInterval: Option[ConfigNodePropertyInteger],
  serviceCheckOverridePatterns: Option[ConfigNodePropertyArray],
  serviceCacheBrokenInternalLinks: Option[ConfigNodePropertyBoolean],
  serviceSpecialLinkPrefix: Option[ConfigNodePropertyArray],
  serviceSpecialLinkPatterns: Option[ConfigNodePropertyArray]
)

object ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties {
  implicit lazy val comDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesJsonFormat: Format[ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties] = Json.format[ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties]
}

