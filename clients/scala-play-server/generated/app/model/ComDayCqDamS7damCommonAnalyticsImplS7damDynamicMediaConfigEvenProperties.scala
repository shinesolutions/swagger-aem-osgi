package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties(
  cqDamS7damDynamicmediaconfigeventlistenerEnabled: Option[ConfigNodePropertyBoolean]
)

object ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties {
  implicit lazy val comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesJsonFormat: Format[ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties] = Json.format[ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties]
}

