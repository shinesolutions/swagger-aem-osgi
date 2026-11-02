package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties(
  serviceRanking: Option[ConfigNodePropertyInteger],
  tagpattern: Option[ConfigNodePropertyString]
)

object ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties {
  implicit lazy val comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHPropertiesJsonFormat: Format[ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties] = Json.format[ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties]
}

