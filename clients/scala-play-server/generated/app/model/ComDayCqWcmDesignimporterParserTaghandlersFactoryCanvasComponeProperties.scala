package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties(
  serviceRanking: Option[ConfigNodePropertyInteger],
  tagpattern: Option[ConfigNodePropertyString]
)

object ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties {
  implicit lazy val comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponePropertiesJsonFormat: Format[ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties] = Json.format[ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties]
}

