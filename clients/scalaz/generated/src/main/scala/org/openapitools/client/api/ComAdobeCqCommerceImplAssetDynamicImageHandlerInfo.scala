package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo._

case class ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties])

object ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoCodecJson: CodecJson[ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo] = CodecJson.derive[ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo]
  implicit val ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoDecoder: EntityDecoder[ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo] = jsonOf[ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo]
  implicit val ComAdobeCqCommerceImplAssetDynamicImageHandlerInfoEncoder: EntityEncoder[ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo] = jsonEncoderOf[ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo]
}
