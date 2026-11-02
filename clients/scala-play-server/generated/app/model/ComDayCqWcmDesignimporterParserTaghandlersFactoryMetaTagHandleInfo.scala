package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties]
)

object ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo {
  implicit lazy val comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoJsonFormat: Format[ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo] = Json.format[ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo]
}

