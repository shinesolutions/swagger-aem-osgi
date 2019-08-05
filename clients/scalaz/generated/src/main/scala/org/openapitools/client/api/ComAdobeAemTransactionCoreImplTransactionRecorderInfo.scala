package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeAemTransactionCoreImplTransactionRecorderInfo._

case class ComAdobeAemTransactionCoreImplTransactionRecorderInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeAemTransactionCoreImplTransactionRecorderProperties])

object ComAdobeAemTransactionCoreImplTransactionRecorderInfo {
  import DateTimeCodecs._

  implicit val ComAdobeAemTransactionCoreImplTransactionRecorderInfoCodecJson: CodecJson[ComAdobeAemTransactionCoreImplTransactionRecorderInfo] = CodecJson.derive[ComAdobeAemTransactionCoreImplTransactionRecorderInfo]
  implicit val ComAdobeAemTransactionCoreImplTransactionRecorderInfoDecoder: EntityDecoder[ComAdobeAemTransactionCoreImplTransactionRecorderInfo] = jsonOf[ComAdobeAemTransactionCoreImplTransactionRecorderInfo]
  implicit val ComAdobeAemTransactionCoreImplTransactionRecorderInfoEncoder: EntityEncoder[ComAdobeAemTransactionCoreImplTransactionRecorderInfo] = jsonEncoderOf[ComAdobeAemTransactionCoreImplTransactionRecorderInfo]
}
