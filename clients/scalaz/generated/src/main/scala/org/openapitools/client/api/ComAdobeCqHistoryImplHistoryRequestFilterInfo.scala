package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqHistoryImplHistoryRequestFilterInfo._

case class ComAdobeCqHistoryImplHistoryRequestFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqHistoryImplHistoryRequestFilterProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeCqHistoryImplHistoryRequestFilterInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqHistoryImplHistoryRequestFilterInfoCodecJson: CodecJson[ComAdobeCqHistoryImplHistoryRequestFilterInfo] = CodecJson.derive[ComAdobeCqHistoryImplHistoryRequestFilterInfo]
  implicit val ComAdobeCqHistoryImplHistoryRequestFilterInfoDecoder: EntityDecoder[ComAdobeCqHistoryImplHistoryRequestFilterInfo] = jsonOf[ComAdobeCqHistoryImplHistoryRequestFilterInfo]
  implicit val ComAdobeCqHistoryImplHistoryRequestFilterInfoEncoder: EntityEncoder[ComAdobeCqHistoryImplHistoryRequestFilterInfo] = jsonEncoderOf[ComAdobeCqHistoryImplHistoryRequestFilterInfo]
}
