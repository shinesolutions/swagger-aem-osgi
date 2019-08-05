package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo._

case class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties])

object ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoCodecJson: CodecJson[ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo] = CodecJson.derive[ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo]
  implicit val ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoDecoder: EntityDecoder[ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo] = jsonOf[ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo]
  implicit val ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoEncoder: EntityEncoder[ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo] = jsonEncoderOf[ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo]
}
