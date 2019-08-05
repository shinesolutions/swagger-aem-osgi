package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo._

case class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoCodecJson: CodecJson[ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo] = CodecJson.derive[ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo]
  implicit val ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoDecoder: EntityDecoder[ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo] = jsonOf[ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo]
  implicit val ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoEncoder: EntityEncoder[ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo] = jsonEncoderOf[ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo]
}
