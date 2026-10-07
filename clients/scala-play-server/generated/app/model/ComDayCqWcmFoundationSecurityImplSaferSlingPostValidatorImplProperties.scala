package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties(
  parameterWhitelist: Option[ConfigNodePropertyArray],
  parameterWhitelistPrefixes: Option[ConfigNodePropertyArray],
  binaryParameterWhitelist: Option[ConfigNodePropertyArray],
  modifierWhitelist: Option[ConfigNodePropertyArray],
  operationWhitelist: Option[ConfigNodePropertyArray],
  operationWhitelistPrefixes: Option[ConfigNodePropertyArray],
  typehintWhitelist: Option[ConfigNodePropertyArray],
  resourcetypeWhitelist: Option[ConfigNodePropertyArray]
)

object ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties {
  implicit lazy val comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesJsonFormat: Format[ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties] = Json.format[ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties]
}

