package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties._

case class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties (
  translateLanguage: Option[ConfigNodePropertyDropDown],
translateDisplay: Option[ConfigNodePropertyDropDown],
translateAttribution: Option[ConfigNodePropertyBoolean],
translateCaching: Option[ConfigNodePropertyDropDown],
translateSmartRendering: Option[ConfigNodePropertyDropDown],
translateCachingDuration: Option[ConfigNodePropertyString],
translateSessionSaveInterval: Option[ConfigNodePropertyString],
translateSessionSaveBatchLimit: Option[ConfigNodePropertyString])

object ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesCodecJson: CodecJson[ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties] = CodecJson.derive[ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties]
  implicit val ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesDecoder: EntityDecoder[ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties] = jsonOf[ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties]
  implicit val ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesEncoder: EntityEncoder[ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties] = jsonEncoderOf[ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties]
}