package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties(
  parameterWhitelist: Option[ConfigNodePropertyArray],
  parameterWhitelistPrefixes: Option[ConfigNodePropertyArray],
  binaryParameterWhitelist: Option[ConfigNodePropertyArray],
  modifierWhitelist: Option[ConfigNodePropertyArray],
  operationWhitelist: Option[ConfigNodePropertyArray],
  operationWhitelistPrefixes: Option[ConfigNodePropertyArray],
  typehintWhitelist: Option[ConfigNodePropertyArray],
  resourcetypeWhitelist: Option[ConfigNodePropertyArray]
)

object ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties {
  implicit lazy val comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesJsonFormat: Format[ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties] = Json.format[ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties]
}

