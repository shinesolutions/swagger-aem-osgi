package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo._

case class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties])

object ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoCodecJson: CodecJson[ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo] = CodecJson.derive[ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo]
  implicit val ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoDecoder: EntityDecoder[ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo] = jsonOf[ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo]
  implicit val ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoEncoder: EntityEncoder[ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo] = jsonEncoderOf[ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo]
}
