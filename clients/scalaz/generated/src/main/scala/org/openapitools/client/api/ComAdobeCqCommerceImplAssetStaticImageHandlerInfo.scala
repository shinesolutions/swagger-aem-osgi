package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqCommerceImplAssetStaticImageHandlerInfo._

case class ComAdobeCqCommerceImplAssetStaticImageHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqCommerceImplAssetStaticImageHandlerProperties])

object ComAdobeCqCommerceImplAssetStaticImageHandlerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqCommerceImplAssetStaticImageHandlerInfoCodecJson: CodecJson[ComAdobeCqCommerceImplAssetStaticImageHandlerInfo] = CodecJson.derive[ComAdobeCqCommerceImplAssetStaticImageHandlerInfo]
  implicit val ComAdobeCqCommerceImplAssetStaticImageHandlerInfoDecoder: EntityDecoder[ComAdobeCqCommerceImplAssetStaticImageHandlerInfo] = jsonOf[ComAdobeCqCommerceImplAssetStaticImageHandlerInfo]
  implicit val ComAdobeCqCommerceImplAssetStaticImageHandlerInfoEncoder: EntityEncoder[ComAdobeCqCommerceImplAssetStaticImageHandlerInfo] = jsonEncoderOf[ComAdobeCqCommerceImplAssetStaticImageHandlerInfo]
}
