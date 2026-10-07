package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties(
  linkExpiredPrefix: Option[ConfigNodePropertyString],
  linkExpiredRemove: Option[ConfigNodePropertyBoolean],
  linkExpiredSuffix: Option[ConfigNodePropertyString],
  linkInvalidPrefix: Option[ConfigNodePropertyString],
  linkInvalidRemove: Option[ConfigNodePropertyBoolean],
  linkInvalidSuffix: Option[ConfigNodePropertyString],
  linkPredatedPrefix: Option[ConfigNodePropertyString],
  linkPredatedRemove: Option[ConfigNodePropertyBoolean],
  linkPredatedSuffix: Option[ConfigNodePropertyString],
  linkWcmmodes: Option[ConfigNodePropertyArray]
)

object ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties {
  implicit lazy val comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesJsonFormat: Format[ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties] = Json.format[ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties]
}

