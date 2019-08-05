package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqAuditPurgePagesInfo._

case class ComAdobeCqAuditPurgePagesInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqAuditPurgePagesProperties])

object ComAdobeCqAuditPurgePagesInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqAuditPurgePagesInfoCodecJson: CodecJson[ComAdobeCqAuditPurgePagesInfo] = CodecJson.derive[ComAdobeCqAuditPurgePagesInfo]
  implicit val ComAdobeCqAuditPurgePagesInfoDecoder: EntityDecoder[ComAdobeCqAuditPurgePagesInfo] = jsonOf[ComAdobeCqAuditPurgePagesInfo]
  implicit val ComAdobeCqAuditPurgePagesInfoEncoder: EntityEncoder[ComAdobeCqAuditPurgePagesInfo] = jsonEncoderOf[ComAdobeCqAuditPurgePagesInfo]
}
