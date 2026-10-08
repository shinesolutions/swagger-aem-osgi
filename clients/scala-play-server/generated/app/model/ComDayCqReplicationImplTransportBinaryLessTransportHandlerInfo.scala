package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqReplicationImplTransportBinaryLessTransportHandlerInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties]
)

object ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo {
  implicit lazy val comDayCqReplicationImplTransportBinaryLessTransportHandlerInfoJsonFormat: Format[ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo] = Json.format[ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo]
}

