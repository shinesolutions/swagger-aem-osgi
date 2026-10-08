
package org.openapitools.client.model


case class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties (
    _oauthProviderId: Option[ConfigNodePropertyString],
    _oauthCloudConfigRoot: Option[ConfigNodePropertyString],
    _providerConfigRoot: Option[ConfigNodePropertyString],
    _providerConfigCreateTagsEnabled: Option[ConfigNodePropertyBoolean],
    _providerConfigUserFolder: Option[ConfigNodePropertyDropDown],
    _providerConfigFacebookFetchFields: Option[ConfigNodePropertyBoolean],
    _providerConfigFacebookFields: Option[ConfigNodePropertyArray],
    _providerConfigRefreshUserdataEnabled: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties {
    def toStringBody(var_oauthProviderId: Object, var_oauthCloudConfigRoot: Object, var_providerConfigRoot: Object, var_providerConfigCreateTagsEnabled: Object, var_providerConfigUserFolder: Object, var_providerConfigFacebookFetchFields: Object, var_providerConfigFacebookFields: Object, var_providerConfigRefreshUserdataEnabled: Object) =
        s"""
        | {
        | "oauthProviderId":$var_oauthProviderId,"oauthCloudConfigRoot":$var_oauthCloudConfigRoot,"providerConfigRoot":$var_providerConfigRoot,"providerConfigCreateTagsEnabled":$var_providerConfigCreateTagsEnabled,"providerConfigUserFolder":$var_providerConfigUserFolder,"providerConfigFacebookFetchFields":$var_providerConfigFacebookFetchFields,"providerConfigFacebookFields":$var_providerConfigFacebookFields,"providerConfigRefreshUserdataEnabled":$var_providerConfigRefreshUserdataEnabled
        | }
        """.stripMargin
}
