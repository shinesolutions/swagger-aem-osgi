package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingEngineParametersInfo._

case class OrgApacheSlingEngineParametersInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingEngineParametersProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingEngineParametersInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingEngineParametersInfoCodecJson: CodecJson[OrgApacheSlingEngineParametersInfo] = CodecJson.derive[OrgApacheSlingEngineParametersInfo]
  implicit val OrgApacheSlingEngineParametersInfoDecoder: EntityDecoder[OrgApacheSlingEngineParametersInfo] = jsonOf[OrgApacheSlingEngineParametersInfo]
  implicit val OrgApacheSlingEngineParametersInfoEncoder: EntityEncoder[OrgApacheSlingEngineParametersInfo] = jsonEncoderOf[OrgApacheSlingEngineParametersInfo]
}
