package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteHttpcacheFileFileCacheStoreInfo._

case class ComAdobeGraniteHttpcacheFileFileCacheStoreInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteHttpcacheFileFileCacheStoreProperties])

object ComAdobeGraniteHttpcacheFileFileCacheStoreInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteHttpcacheFileFileCacheStoreInfoCodecJson: CodecJson[ComAdobeGraniteHttpcacheFileFileCacheStoreInfo] = CodecJson.derive[ComAdobeGraniteHttpcacheFileFileCacheStoreInfo]
  implicit val ComAdobeGraniteHttpcacheFileFileCacheStoreInfoDecoder: EntityDecoder[ComAdobeGraniteHttpcacheFileFileCacheStoreInfo] = jsonOf[ComAdobeGraniteHttpcacheFileFileCacheStoreInfo]
  implicit val ComAdobeGraniteHttpcacheFileFileCacheStoreInfoEncoder: EntityEncoder[ComAdobeGraniteHttpcacheFileFileCacheStoreInfo] = jsonEncoderOf[ComAdobeGraniteHttpcacheFileFileCacheStoreInfo]
}
