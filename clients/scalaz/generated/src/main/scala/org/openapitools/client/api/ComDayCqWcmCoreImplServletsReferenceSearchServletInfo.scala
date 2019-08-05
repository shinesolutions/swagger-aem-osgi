package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplServletsReferenceSearchServletInfo._

case class ComDayCqWcmCoreImplServletsReferenceSearchServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplServletsReferenceSearchServletProperties])

object ComDayCqWcmCoreImplServletsReferenceSearchServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplServletsReferenceSearchServletInfoCodecJson: CodecJson[ComDayCqWcmCoreImplServletsReferenceSearchServletInfo] = CodecJson.derive[ComDayCqWcmCoreImplServletsReferenceSearchServletInfo]
  implicit val ComDayCqWcmCoreImplServletsReferenceSearchServletInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplServletsReferenceSearchServletInfo] = jsonOf[ComDayCqWcmCoreImplServletsReferenceSearchServletInfo]
  implicit val ComDayCqWcmCoreImplServletsReferenceSearchServletInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplServletsReferenceSearchServletInfo] = jsonEncoderOf[ComDayCqWcmCoreImplServletsReferenceSearchServletInfo]
}
