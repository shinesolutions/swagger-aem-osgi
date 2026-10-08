
package org.openapitools.client.model


case class ComAdobeGraniteAuthImsImplIMSProviderImplProperties (
    _oauthProviderId: Option[ConfigNodePropertyString],
    _oauthProviderImsAuthorizationUrl: Option[ConfigNodePropertyString],
    _oauthProviderImsTokenUrl: Option[ConfigNodePropertyString],
    _oauthProviderImsProfileUrl: Option[ConfigNodePropertyString],
    _oauthProviderImsExtendedDetailsUrls: Option[ConfigNodePropertyArray],
    _oauthProviderImsValidateTokenUrl: Option[ConfigNodePropertyString],
    _oauthProviderImsSessionProperty: Option[ConfigNodePropertyString],
    _oauthProviderImsServiceTokenClientId: Option[ConfigNodePropertyString],
    _oauthProviderImsServiceTokenClientSecret: Option[ConfigNodePropertyString],
    _oauthProviderImsServiceToken: Option[ConfigNodePropertyString],
    _imsOrgRef: Option[ConfigNodePropertyString],
    _imsGroupMapping: Option[ConfigNodePropertyArray],
    _oauthProviderImsOnlyLicenseGroup: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteAuthImsImplIMSProviderImplProperties {
    def toStringBody(var_oauthProviderId: Object, var_oauthProviderImsAuthorizationUrl: Object, var_oauthProviderImsTokenUrl: Object, var_oauthProviderImsProfileUrl: Object, var_oauthProviderImsExtendedDetailsUrls: Object, var_oauthProviderImsValidateTokenUrl: Object, var_oauthProviderImsSessionProperty: Object, var_oauthProviderImsServiceTokenClientId: Object, var_oauthProviderImsServiceTokenClientSecret: Object, var_oauthProviderImsServiceToken: Object, var_imsOrgRef: Object, var_imsGroupMapping: Object, var_oauthProviderImsOnlyLicenseGroup: Object) =
        s"""
        | {
        | "oauthProviderId":$var_oauthProviderId,"oauthProviderImsAuthorizationUrl":$var_oauthProviderImsAuthorizationUrl,"oauthProviderImsTokenUrl":$var_oauthProviderImsTokenUrl,"oauthProviderImsProfileUrl":$var_oauthProviderImsProfileUrl,"oauthProviderImsExtendedDetailsUrls":$var_oauthProviderImsExtendedDetailsUrls,"oauthProviderImsValidateTokenUrl":$var_oauthProviderImsValidateTokenUrl,"oauthProviderImsSessionProperty":$var_oauthProviderImsSessionProperty,"oauthProviderImsServiceTokenClientId":$var_oauthProviderImsServiceTokenClientId,"oauthProviderImsServiceTokenClientSecret":$var_oauthProviderImsServiceTokenClientSecret,"oauthProviderImsServiceToken":$var_oauthProviderImsServiceToken,"imsOrgRef":$var_imsOrgRef,"imsGroupMapping":$var_imsGroupMapping,"oauthProviderImsOnlyLicenseGroup":$var_oauthProviderImsOnlyLicenseGroup
        | }
        """.stripMargin
}
