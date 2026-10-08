
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties (
    _cugSupportedPaths: Option[ConfigNodePropertyArray],
    _cugEnabled: Option[ConfigNodePropertyBoolean],
    _configurationRanking: Option[ConfigNodePropertyInteger]
)
object OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties {
    def toStringBody(var_cugSupportedPaths: Object, var_cugEnabled: Object, var_configurationRanking: Object) =
        s"""
        | {
        | "cugSupportedPaths":$var_cugSupportedPaths,"cugEnabled":$var_cugEnabled,"configurationRanking":$var_configurationRanking
        | }
        """.stripMargin
}
