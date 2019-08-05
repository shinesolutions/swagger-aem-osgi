package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqAuditPurgeReplicationInfo._

case class ComAdobeCqAuditPurgeReplicationInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqAuditPurgeReplicationProperties])

object ComAdobeCqAuditPurgeReplicationInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqAuditPurgeReplicationInfoCodecJson: CodecJson[ComAdobeCqAuditPurgeReplicationInfo] = CodecJson.derive[ComAdobeCqAuditPurgeReplicationInfo]
  implicit val ComAdobeCqAuditPurgeReplicationInfoDecoder: EntityDecoder[ComAdobeCqAuditPurgeReplicationInfo] = jsonOf[ComAdobeCqAuditPurgeReplicationInfo]
  implicit val ComAdobeCqAuditPurgeReplicationInfoEncoder: EntityEncoder[ComAdobeCqAuditPurgeReplicationInfo] = jsonEncoderOf[ComAdobeCqAuditPurgeReplicationInfo]
}
