package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingEngineImplSlingMainServletInfo._

case class OrgApacheSlingEngineImplSlingMainServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingEngineImplSlingMainServletProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingEngineImplSlingMainServletInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingEngineImplSlingMainServletInfoCodecJson: CodecJson[OrgApacheSlingEngineImplSlingMainServletInfo] = CodecJson.derive[OrgApacheSlingEngineImplSlingMainServletInfo]
  implicit val OrgApacheSlingEngineImplSlingMainServletInfoDecoder: EntityDecoder[OrgApacheSlingEngineImplSlingMainServletInfo] = jsonOf[OrgApacheSlingEngineImplSlingMainServletInfo]
  implicit val OrgApacheSlingEngineImplSlingMainServletInfoEncoder: EntityEncoder[OrgApacheSlingEngineImplSlingMainServletInfo] = jsonEncoderOf[OrgApacheSlingEngineImplSlingMainServletInfo]
}
