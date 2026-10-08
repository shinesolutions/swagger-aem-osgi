
package org.openapitools.client.model


case class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties (
    _parameterWhitelist: Option[ConfigNodePropertyArray],
    _parameterWhitelistPrefixes: Option[ConfigNodePropertyArray],
    _binaryParameterWhitelist: Option[ConfigNodePropertyArray],
    _modifierWhitelist: Option[ConfigNodePropertyArray],
    _operationWhitelist: Option[ConfigNodePropertyArray],
    _operationWhitelistPrefixes: Option[ConfigNodePropertyArray],
    _typehintWhitelist: Option[ConfigNodePropertyArray],
    _resourcetypeWhitelist: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties {
    def toStringBody(var_parameterWhitelist: Object, var_parameterWhitelistPrefixes: Object, var_binaryParameterWhitelist: Object, var_modifierWhitelist: Object, var_operationWhitelist: Object, var_operationWhitelistPrefixes: Object, var_typehintWhitelist: Object, var_resourcetypeWhitelist: Object) =
        s"""
        | {
        | "parameterWhitelist":$var_parameterWhitelist,"parameterWhitelistPrefixes":$var_parameterWhitelistPrefixes,"binaryParameterWhitelist":$var_binaryParameterWhitelist,"modifierWhitelist":$var_modifierWhitelist,"operationWhitelist":$var_operationWhitelist,"operationWhitelistPrefixes":$var_operationWhitelistPrefixes,"typehintWhitelist":$var_typehintWhitelist,"resourcetypeWhitelist":$var_resourcetypeWhitelist
        | }
        """.stripMargin
}
