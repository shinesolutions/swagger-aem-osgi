package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqMcmCampaignImplIntegrationConfigImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqMcmCampaignImplIntegrationConfigImplProperties(
  aemMcmCampaignFormConstraints: Option[ConfigNodePropertyArray],
  aemMcmCampaignPublicUrl: Option[ConfigNodePropertyString],
  aemMcmCampaignRelaxedSSL: Option[ConfigNodePropertyBoolean]
)

object ComDayCqMcmCampaignImplIntegrationConfigImplProperties {
  implicit lazy val comDayCqMcmCampaignImplIntegrationConfigImplPropertiesJsonFormat: Format[ComDayCqMcmCampaignImplIntegrationConfigImplProperties] = Json.format[ComDayCqMcmCampaignImplIntegrationConfigImplProperties]
}

