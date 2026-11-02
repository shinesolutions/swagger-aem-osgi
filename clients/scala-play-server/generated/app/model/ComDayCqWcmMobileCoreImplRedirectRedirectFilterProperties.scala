package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties(
  redirectEnabled: Option[ConfigNodePropertyBoolean],
  redirectStatsEnabled: Option[ConfigNodePropertyBoolean],
  redirectExtensions: Option[ConfigNodePropertyArray],
  redirectPaths: Option[ConfigNodePropertyArray]
)

object ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties {
  implicit lazy val comDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesJsonFormat: Format[ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties] = Json.format[ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties]
}

