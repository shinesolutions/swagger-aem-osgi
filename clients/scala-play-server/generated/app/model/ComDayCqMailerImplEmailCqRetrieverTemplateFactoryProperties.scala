package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties(
  mailerEmailEmbed: Option[ConfigNodePropertyBoolean],
  mailerEmailCharset: Option[ConfigNodePropertyString],
  mailerEmailRetrieverUserID: Option[ConfigNodePropertyString],
  mailerEmailRetrieverUserPWD: Option[ConfigNodePropertyString]
)

object ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {
  implicit lazy val comDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesJsonFormat: Format[ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties] = Json.format[ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties]
}

