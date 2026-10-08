
package org.openapitools.client.model


case class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties (
    _osgiHttpWhiteboardContextSelect: Option[ConfigNodePropertyString],
    _osgiHttpWhiteboardListener: Option[ConfigNodePropertyString],
    _authSudoCookie: Option[ConfigNodePropertyString],
    _authSudoParameter: Option[ConfigNodePropertyString],
    _authAnnonymous: Option[ConfigNodePropertyBoolean],
    _slingAuthRequirements: Option[ConfigNodePropertyArray],
    _slingAuthAnonymousUser: Option[ConfigNodePropertyString],
    _slingAuthAnonymousPassword: Option[ConfigNodePropertyString],
    _authHttp: Option[ConfigNodePropertyDropDown],
    _authHttpRealm: Option[ConfigNodePropertyString],
    _authUriSuffix: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties {
    def toStringBody(var_osgiHttpWhiteboardContextSelect: Object, var_osgiHttpWhiteboardListener: Object, var_authSudoCookie: Object, var_authSudoParameter: Object, var_authAnnonymous: Object, var_slingAuthRequirements: Object, var_slingAuthAnonymousUser: Object, var_slingAuthAnonymousPassword: Object, var_authHttp: Object, var_authHttpRealm: Object, var_authUriSuffix: Object) =
        s"""
        | {
        | "osgiHttpWhiteboardContextSelect":$var_osgiHttpWhiteboardContextSelect,"osgiHttpWhiteboardListener":$var_osgiHttpWhiteboardListener,"authSudoCookie":$var_authSudoCookie,"authSudoParameter":$var_authSudoParameter,"authAnnonymous":$var_authAnnonymous,"slingAuthRequirements":$var_slingAuthRequirements,"slingAuthAnonymousUser":$var_slingAuthAnonymousUser,"slingAuthAnonymousPassword":$var_slingAuthAnonymousPassword,"authHttp":$var_authHttp,"authHttpRealm":$var_authHttpRealm,"authUriSuffix":$var_authUriSuffix
        | }
        """.stripMargin
}
