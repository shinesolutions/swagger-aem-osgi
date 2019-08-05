package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo._

case class ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties])

object ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoCodecJson: CodecJson[ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo] = CodecJson.derive[ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo]
  implicit val ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoDecoder: EntityDecoder[ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo] = jsonOf[ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo]
  implicit val ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfoEncoder: EntityEncoder[ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo] = jsonEncoderOf[ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo]
}
