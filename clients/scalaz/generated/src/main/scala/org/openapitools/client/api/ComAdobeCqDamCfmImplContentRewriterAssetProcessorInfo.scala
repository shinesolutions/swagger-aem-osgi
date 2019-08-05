package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo._

case class ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties])

object ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfoCodecJson: CodecJson[ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo] = CodecJson.derive[ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo]
  implicit val ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfoDecoder: EntityDecoder[ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo] = jsonOf[ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo]
  implicit val ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfoEncoder: EntityEncoder[ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo] = jsonEncoderOf[ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo]
}
