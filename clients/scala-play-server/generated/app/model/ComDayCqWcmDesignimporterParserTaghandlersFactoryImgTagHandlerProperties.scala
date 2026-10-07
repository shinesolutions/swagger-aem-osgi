package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties(
  serviceRanking: Option[ConfigNodePropertyInteger],
  tagpattern: Option[ConfigNodePropertyString]
)

object ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties {
  implicit lazy val comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesJsonFormat: Format[ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties] = Json.format[ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties]
}

