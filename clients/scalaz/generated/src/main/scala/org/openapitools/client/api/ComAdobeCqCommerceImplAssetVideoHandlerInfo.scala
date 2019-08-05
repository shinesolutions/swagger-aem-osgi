package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqCommerceImplAssetVideoHandlerInfo._

case class ComAdobeCqCommerceImplAssetVideoHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqCommerceImplAssetVideoHandlerProperties])

object ComAdobeCqCommerceImplAssetVideoHandlerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqCommerceImplAssetVideoHandlerInfoCodecJson: CodecJson[ComAdobeCqCommerceImplAssetVideoHandlerInfo] = CodecJson.derive[ComAdobeCqCommerceImplAssetVideoHandlerInfo]
  implicit val ComAdobeCqCommerceImplAssetVideoHandlerInfoDecoder: EntityDecoder[ComAdobeCqCommerceImplAssetVideoHandlerInfo] = jsonOf[ComAdobeCqCommerceImplAssetVideoHandlerInfo]
  implicit val ComAdobeCqCommerceImplAssetVideoHandlerInfoEncoder: EntityEncoder[ComAdobeCqCommerceImplAssetVideoHandlerInfo] = jsonEncoderOf[ComAdobeCqCommerceImplAssetVideoHandlerInfo]
}
