package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties(
  serviceRanking: Option[ConfigNodePropertyInteger],
  tagpattern: Option[ConfigNodePropertyString]
)

object ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties {
  implicit lazy val comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesJsonFormat: Format[ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties] = Json.format[ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties]
}

