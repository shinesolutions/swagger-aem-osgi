
package org.openapitools.client.model


case class ComDayCqAuthImplLoginSelectorHandlerProperties (
    _path: Option[ConfigNodePropertyString],
    _serviceRanking: Option[ConfigNodePropertyInteger],
    _authLoginselectorMappings: Option[ConfigNodePropertyArray],
    _authLoginselectorChangepwMappings: Option[ConfigNodePropertyArray],
    _authLoginselectorDefaultloginpage: Option[ConfigNodePropertyString],
    _authLoginselectorDefaultchangepwpage: Option[ConfigNodePropertyString],
    _authLoginselectorHandle: Option[ConfigNodePropertyArray],
    _authLoginselectorHandleAllExtensions: Option[ConfigNodePropertyBoolean]
)
object ComDayCqAuthImplLoginSelectorHandlerProperties {
    def toStringBody(var_path: Object, var_serviceRanking: Object, var_authLoginselectorMappings: Object, var_authLoginselectorChangepwMappings: Object, var_authLoginselectorDefaultloginpage: Object, var_authLoginselectorDefaultchangepwpage: Object, var_authLoginselectorHandle: Object, var_authLoginselectorHandleAllExtensions: Object) =
        s"""
        | {
        | "path":$var_path,"serviceRanking":$var_serviceRanking,"authLoginselectorMappings":$var_authLoginselectorMappings,"authLoginselectorChangepwMappings":$var_authLoginselectorChangepwMappings,"authLoginselectorDefaultloginpage":$var_authLoginselectorDefaultloginpage,"authLoginselectorDefaultchangepwpage":$var_authLoginselectorDefaultchangepwpage,"authLoginselectorHandle":$var_authLoginselectorHandle,"authLoginselectorHandleAllExtensions":$var_authLoginselectorHandleAllExtensions
        | }
        """.stripMargin
}
