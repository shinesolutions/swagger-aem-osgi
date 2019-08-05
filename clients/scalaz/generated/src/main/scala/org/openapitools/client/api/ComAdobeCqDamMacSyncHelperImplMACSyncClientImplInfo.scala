package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo._

case class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties])

object ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoCodecJson: CodecJson[ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo] = CodecJson.derive[ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo]
  implicit val ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoDecoder: EntityDecoder[ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo] = jsonOf[ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo]
  implicit val ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoEncoder: EntityEncoder[ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo] = jsonEncoderOf[ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo]
}
