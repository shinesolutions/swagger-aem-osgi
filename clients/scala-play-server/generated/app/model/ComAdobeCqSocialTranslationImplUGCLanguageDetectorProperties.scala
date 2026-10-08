package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties(
  eventTopics: Option[ConfigNodePropertyString],
  eventFilter: Option[ConfigNodePropertyString],
  translateListenerType: Option[ConfigNodePropertyArray],
  translatePropertyList: Option[ConfigNodePropertyArray],
  poolSize: Option[ConfigNodePropertyInteger],
  maxPoolSize: Option[ConfigNodePropertyInteger],
  queueSize: Option[ConfigNodePropertyInteger],
  keepAliveTime: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties {
  implicit lazy val comAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesJsonFormat: Format[ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties] = Json.format[ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties]
}

