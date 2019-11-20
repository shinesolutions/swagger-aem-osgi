package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo._

case class ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties])

object ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoCodecJson: CodecJson[ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo] = CodecJson.derive[ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo]
  implicit val ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoDecoder: EntityDecoder[ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo] = jsonOf[ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo]
  implicit val ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfoEncoder: EntityEncoder[ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo] = jsonEncoderOf[ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo]
}