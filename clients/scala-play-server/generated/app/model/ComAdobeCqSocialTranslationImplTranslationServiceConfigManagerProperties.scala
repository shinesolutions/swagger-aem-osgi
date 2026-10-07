package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties(
  translateLanguage: Option[ConfigNodePropertyDropDown],
  translateDisplay: Option[ConfigNodePropertyDropDown],
  translateAttribution: Option[ConfigNodePropertyBoolean],
  translateCaching: Option[ConfigNodePropertyDropDown],
  translateSmartRendering: Option[ConfigNodePropertyDropDown],
  translateCachingDuration: Option[ConfigNodePropertyString],
  translateSessionSaveInterval: Option[ConfigNodePropertyString],
  translateSessionSaveBatchLimit: Option[ConfigNodePropertyString]
)

object ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties {
  implicit lazy val comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesJsonFormat: Format[ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties] = Json.format[ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties]
}

