package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteRepositoryImplCommitStatsConfigInfo._

case class ComAdobeGraniteRepositoryImplCommitStatsConfigInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteRepositoryImplCommitStatsConfigProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeGraniteRepositoryImplCommitStatsConfigInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteRepositoryImplCommitStatsConfigInfoCodecJson: CodecJson[ComAdobeGraniteRepositoryImplCommitStatsConfigInfo] = CodecJson.derive[ComAdobeGraniteRepositoryImplCommitStatsConfigInfo]
  implicit val ComAdobeGraniteRepositoryImplCommitStatsConfigInfoDecoder: EntityDecoder[ComAdobeGraniteRepositoryImplCommitStatsConfigInfo] = jsonOf[ComAdobeGraniteRepositoryImplCommitStatsConfigInfo]
  implicit val ComAdobeGraniteRepositoryImplCommitStatsConfigInfoEncoder: EntityEncoder[ComAdobeGraniteRepositoryImplCommitStatsConfigInfo] = jsonEncoderOf[ComAdobeGraniteRepositoryImplCommitStatsConfigInfo]
}
