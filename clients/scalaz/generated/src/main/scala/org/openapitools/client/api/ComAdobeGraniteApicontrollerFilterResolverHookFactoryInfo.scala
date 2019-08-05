package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo._

case class ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoCodecJson: CodecJson[ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo] = CodecJson.derive[ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo]
  implicit val ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoDecoder: EntityDecoder[ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo] = jsonOf[ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo]
  implicit val ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfoEncoder: EntityEncoder[ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo] = jsonEncoderOf[ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo]
}
