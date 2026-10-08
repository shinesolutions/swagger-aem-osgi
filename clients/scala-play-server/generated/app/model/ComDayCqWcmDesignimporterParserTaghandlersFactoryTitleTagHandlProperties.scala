package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties(
  serviceRanking: Option[ConfigNodePropertyInteger],
  tagpattern: Option[ConfigNodePropertyString]
)

object ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties {
  implicit lazy val comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlPropertiesJsonFormat: Format[ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties] = Json.format[ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties]
}

