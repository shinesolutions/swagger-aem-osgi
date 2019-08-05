package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamCfmImplConfFeatureConfigImplInfo._

case class ComAdobeCqDamCfmImplConfFeatureConfigImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDamCfmImplConfFeatureConfigImplProperties])

object ComAdobeCqDamCfmImplConfFeatureConfigImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamCfmImplConfFeatureConfigImplInfoCodecJson: CodecJson[ComAdobeCqDamCfmImplConfFeatureConfigImplInfo] = CodecJson.derive[ComAdobeCqDamCfmImplConfFeatureConfigImplInfo]
  implicit val ComAdobeCqDamCfmImplConfFeatureConfigImplInfoDecoder: EntityDecoder[ComAdobeCqDamCfmImplConfFeatureConfigImplInfo] = jsonOf[ComAdobeCqDamCfmImplConfFeatureConfigImplInfo]
  implicit val ComAdobeCqDamCfmImplConfFeatureConfigImplInfoEncoder: EntityEncoder[ComAdobeCqDamCfmImplConfFeatureConfigImplInfo] = jsonEncoderOf[ComAdobeCqDamCfmImplConfFeatureConfigImplInfo]
}
