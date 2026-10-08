
package org.openapitools.client.model


case class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties (
    _facebook: Option[ConfigNodePropertyArray],
    _twitter: Option[ConfigNodePropertyArray],
    _providerConfigUserFolder: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties {
    def toStringBody(var_facebook: Object, var_twitter: Object, var_providerConfigUserFolder: Object) =
        s"""
        | {
        | "facebook":$var_facebook,"twitter":$var_twitter,"providerConfigUserFolder":$var_providerConfigUserFolder
        | }
        """.stripMargin
}
