package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo._

case class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties])

object ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoCodecJson: CodecJson[ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo] = CodecJson.derive[ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo]
  implicit val ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoDecoder: EntityDecoder[ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo] = jsonOf[ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo]
  implicit val ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoEncoder: EntityEncoder[ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo] = jsonEncoderOf[ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo]
}
