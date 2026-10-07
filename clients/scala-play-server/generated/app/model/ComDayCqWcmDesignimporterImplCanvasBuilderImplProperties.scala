package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmDesignimporterImplCanvasBuilderImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties(
  filepattern: Option[ConfigNodePropertyString],
  buildPageNodes: Option[ConfigNodePropertyBoolean],
  buildClientLibs: Option[ConfigNodePropertyBoolean],
  buildCanvasComponent: Option[ConfigNodePropertyBoolean]
)

object ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties {
  implicit lazy val comDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesJsonFormat: Format[ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties] = Json.format[ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties]
}

