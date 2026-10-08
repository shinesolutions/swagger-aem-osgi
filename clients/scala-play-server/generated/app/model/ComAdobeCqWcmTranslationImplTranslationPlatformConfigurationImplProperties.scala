package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties(
  syncTranslationStateSchedulingFormat: Option[ConfigNodePropertyString],
  schedulingRepeatTranslationSchedulingFormat: Option[ConfigNodePropertyString],
  syncTranslationStateLockTimeoutInMinutes: Option[ConfigNodePropertyString],
  exportFormat: Option[ConfigNodePropertyDropDown]
)

object ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties {
  implicit lazy val comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesJsonFormat: Format[ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties] = Json.format[ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties]
}

