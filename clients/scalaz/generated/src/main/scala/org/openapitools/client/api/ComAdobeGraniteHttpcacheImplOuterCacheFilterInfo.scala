package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo._

case class ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties])

object ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoCodecJson: CodecJson[ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo] = CodecJson.derive[ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo]
  implicit val ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoDecoder: EntityDecoder[ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo] = jsonOf[ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo]
  implicit val ComAdobeGraniteHttpcacheImplOuterCacheFilterInfoEncoder: EntityEncoder[ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo] = jsonEncoderOf[ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo]
}
