package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteSecurityUserUserPropertiesServiceInfo._

case class ComAdobeGraniteSecurityUserUserPropertiesServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteSecurityUserUserPropertiesServiceProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeGraniteSecurityUserUserPropertiesServiceInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteSecurityUserUserPropertiesServiceInfoCodecJson: CodecJson[ComAdobeGraniteSecurityUserUserPropertiesServiceInfo] = CodecJson.derive[ComAdobeGraniteSecurityUserUserPropertiesServiceInfo]
  implicit val ComAdobeGraniteSecurityUserUserPropertiesServiceInfoDecoder: EntityDecoder[ComAdobeGraniteSecurityUserUserPropertiesServiceInfo] = jsonOf[ComAdobeGraniteSecurityUserUserPropertiesServiceInfo]
  implicit val ComAdobeGraniteSecurityUserUserPropertiesServiceInfoEncoder: EntityEncoder[ComAdobeGraniteSecurityUserUserPropertiesServiceInfo] = jsonEncoderOf[ComAdobeGraniteSecurityUserUserPropertiesServiceInfo]
}
