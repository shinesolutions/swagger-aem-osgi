package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingEngineImplLogRequestLoggerServiceInfo._

case class OrgApacheSlingEngineImplLogRequestLoggerServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingEngineImplLogRequestLoggerServiceProperties])

object OrgApacheSlingEngineImplLogRequestLoggerServiceInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingEngineImplLogRequestLoggerServiceInfoCodecJson: CodecJson[OrgApacheSlingEngineImplLogRequestLoggerServiceInfo] = CodecJson.derive[OrgApacheSlingEngineImplLogRequestLoggerServiceInfo]
  implicit val OrgApacheSlingEngineImplLogRequestLoggerServiceInfoDecoder: EntityDecoder[OrgApacheSlingEngineImplLogRequestLoggerServiceInfo] = jsonOf[OrgApacheSlingEngineImplLogRequestLoggerServiceInfo]
  implicit val OrgApacheSlingEngineImplLogRequestLoggerServiceInfoEncoder: EntityEncoder[OrgApacheSlingEngineImplLogRequestLoggerServiceInfo] = jsonEncoderOf[OrgApacheSlingEngineImplLogRequestLoggerServiceInfo]
}
