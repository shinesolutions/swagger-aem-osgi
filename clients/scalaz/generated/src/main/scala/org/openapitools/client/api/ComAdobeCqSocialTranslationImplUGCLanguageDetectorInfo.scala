package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo._

case class ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties])

object ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfoCodecJson: CodecJson[ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo] = CodecJson.derive[ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo]
  implicit val ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfoDecoder: EntityDecoder[ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo] = jsonOf[ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo]
  implicit val ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfoEncoder: EntityEncoder[ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo] = jsonEncoderOf[ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo]
}
