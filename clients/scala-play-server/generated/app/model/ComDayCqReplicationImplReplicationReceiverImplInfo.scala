package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqReplicationImplReplicationReceiverImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqReplicationImplReplicationReceiverImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqReplicationImplReplicationReceiverImplProperties]
)

object ComDayCqReplicationImplReplicationReceiverImplInfo {
  implicit lazy val comDayCqReplicationImplReplicationReceiverImplInfoJsonFormat: Format[ComDayCqReplicationImplReplicationReceiverImplInfo] = Json.format[ComDayCqReplicationImplReplicationReceiverImplInfo]
}

