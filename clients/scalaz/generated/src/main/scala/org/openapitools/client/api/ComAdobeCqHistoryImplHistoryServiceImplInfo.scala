package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqHistoryImplHistoryServiceImplInfo._

case class ComAdobeCqHistoryImplHistoryServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqHistoryImplHistoryServiceImplProperties],
additionalProperties: Option[String],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeCqHistoryImplHistoryServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqHistoryImplHistoryServiceImplInfoCodecJson: CodecJson[ComAdobeCqHistoryImplHistoryServiceImplInfo] = CodecJson.derive[ComAdobeCqHistoryImplHistoryServiceImplInfo]
  implicit val ComAdobeCqHistoryImplHistoryServiceImplInfoDecoder: EntityDecoder[ComAdobeCqHistoryImplHistoryServiceImplInfo] = jsonOf[ComAdobeCqHistoryImplHistoryServiceImplInfo]
  implicit val ComAdobeCqHistoryImplHistoryServiceImplInfoEncoder: EntityEncoder[ComAdobeCqHistoryImplHistoryServiceImplInfo] = jsonEncoderOf[ComAdobeCqHistoryImplHistoryServiceImplInfo]
}
