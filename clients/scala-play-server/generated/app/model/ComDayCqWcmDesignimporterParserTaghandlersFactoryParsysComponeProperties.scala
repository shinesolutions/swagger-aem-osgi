package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties(
  serviceRanking: Option[ConfigNodePropertyInteger],
  tagpattern: Option[ConfigNodePropertyString],
  componentResourceType: Option[ConfigNodePropertyString]
)

object ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties {
  implicit lazy val comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePropertiesJsonFormat: Format[ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties] = Json.format[ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties]
}

