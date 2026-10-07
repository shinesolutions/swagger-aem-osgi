
package org.openapitools.client.model


case class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties (
    _oauthProviderId: Option[ConfigNodePropertyString],
    _oauthCloudConfigRoot: Option[ConfigNodePropertyString],
    _providerConfigRoot: Option[ConfigNodePropertyString],
    _providerConfigUserFolder: Option[ConfigNodePropertyDropDown],
    _providerConfigTwitterEnableParams: Option[ConfigNodePropertyBoolean],
    _providerConfigTwitterParams: Option[ConfigNodePropertyArray],
    _providerConfigRefreshUserdataEnabled: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties {
    def toStringBody(var_oauthProviderId: Object, var_oauthCloudConfigRoot: Object, var_providerConfigRoot: Object, var_providerConfigUserFolder: Object, var_providerConfigTwitterEnableParams: Object, var_providerConfigTwitterParams: Object, var_providerConfigRefreshUserdataEnabled: Object) =
        s"""
        | {
        | "oauthProviderId":$var_oauthProviderId,"oauthCloudConfigRoot":$var_oauthCloudConfigRoot,"providerConfigRoot":$var_providerConfigRoot,"providerConfigUserFolder":$var_providerConfigUserFolder,"providerConfigTwitterEnableParams":$var_providerConfigTwitterEnableParams,"providerConfigTwitterParams":$var_providerConfigTwitterParams,"providerConfigRefreshUserdataEnabled":$var_providerConfigRefreshUserdataEnabled
        | }
        """.stripMargin
}
