
package org.openapitools.client.model


case class ComDayCqAuthImplCugCugSupportImplProperties (
    _cugExemptedPrincipals: Option[ConfigNodePropertyArray],
    _cugEnabled: Option[ConfigNodePropertyBoolean],
    _cugPrincipalsRegex: Option[ConfigNodePropertyString],
    _cugPrincipalsReplacement: Option[ConfigNodePropertyString]
)
object ComDayCqAuthImplCugCugSupportImplProperties {
    def toStringBody(var_cugExemptedPrincipals: Object, var_cugEnabled: Object, var_cugPrincipalsRegex: Object, var_cugPrincipalsReplacement: Object) =
        s"""
        | {
        | "cugExemptedPrincipals":$var_cugExemptedPrincipals,"cugEnabled":$var_cugEnabled,"cugPrincipalsRegex":$var_cugPrincipalsRegex,"cugPrincipalsReplacement":$var_cugPrincipalsReplacement
        | }
        """.stripMargin
}
