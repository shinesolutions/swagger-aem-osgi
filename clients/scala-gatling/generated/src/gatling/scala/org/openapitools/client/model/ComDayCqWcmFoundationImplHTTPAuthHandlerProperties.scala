
package org.openapitools.client.model


case class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties (
    _path: Option[ConfigNodePropertyString],
    _authHttpNologin: Option[ConfigNodePropertyBoolean],
    _authHttpRealm: Option[ConfigNodePropertyString],
    _authDefaultLoginpage: Option[ConfigNodePropertyString],
    _authCredForm: Option[ConfigNodePropertyArray],
    _authCredUtf8: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmFoundationImplHTTPAuthHandlerProperties {
    def toStringBody(var_path: Object, var_authHttpNologin: Object, var_authHttpRealm: Object, var_authDefaultLoginpage: Object, var_authCredForm: Object, var_authCredUtf8: Object) =
        s"""
        | {
        | "path":$var_path,"authHttpNologin":$var_authHttpNologin,"authHttpRealm":$var_authHttpRealm,"authDefaultLoginpage":$var_authDefaultLoginpage,"authCredForm":$var_authCredForm,"authCredUtf8":$var_authCredUtf8
        | }
        """.stripMargin
}
