package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqReplicationImplReplicatorImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqReplicationImplReplicatorImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqReplicationImplReplicatorImplProperties]
)

object ComDayCqReplicationImplReplicatorImplInfo {
  implicit lazy val comDayCqReplicationImplReplicatorImplInfoJsonFormat: Format[ComDayCqReplicationImplReplicatorImplInfo] = Json.format[ComDayCqReplicationImplReplicatorImplInfo]
}

