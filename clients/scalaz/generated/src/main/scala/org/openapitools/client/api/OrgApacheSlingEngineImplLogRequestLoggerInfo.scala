package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingEngineImplLogRequestLoggerInfo._

case class OrgApacheSlingEngineImplLogRequestLoggerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingEngineImplLogRequestLoggerProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingEngineImplLogRequestLoggerInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingEngineImplLogRequestLoggerInfoCodecJson: CodecJson[OrgApacheSlingEngineImplLogRequestLoggerInfo] = CodecJson.derive[OrgApacheSlingEngineImplLogRequestLoggerInfo]
  implicit val OrgApacheSlingEngineImplLogRequestLoggerInfoDecoder: EntityDecoder[OrgApacheSlingEngineImplLogRequestLoggerInfo] = jsonOf[OrgApacheSlingEngineImplLogRequestLoggerInfo]
  implicit val OrgApacheSlingEngineImplLogRequestLoggerInfoEncoder: EntityEncoder[OrgApacheSlingEngineImplLogRequestLoggerInfo] = jsonEncoderOf[OrgApacheSlingEngineImplLogRequestLoggerInfo]
}
