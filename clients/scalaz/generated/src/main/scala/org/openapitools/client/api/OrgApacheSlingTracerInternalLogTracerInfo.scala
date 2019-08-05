package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingTracerInternalLogTracerInfo._

case class OrgApacheSlingTracerInternalLogTracerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingTracerInternalLogTracerProperties])

object OrgApacheSlingTracerInternalLogTracerInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingTracerInternalLogTracerInfoCodecJson: CodecJson[OrgApacheSlingTracerInternalLogTracerInfo] = CodecJson.derive[OrgApacheSlingTracerInternalLogTracerInfo]
  implicit val OrgApacheSlingTracerInternalLogTracerInfoDecoder: EntityDecoder[OrgApacheSlingTracerInternalLogTracerInfo] = jsonOf[OrgApacheSlingTracerInternalLogTracerInfo]
  implicit val OrgApacheSlingTracerInternalLogTracerInfoEncoder: EntityEncoder[OrgApacheSlingTracerInternalLogTracerInfo] = jsonEncoderOf[OrgApacheSlingTracerInternalLogTracerInfo]
}
