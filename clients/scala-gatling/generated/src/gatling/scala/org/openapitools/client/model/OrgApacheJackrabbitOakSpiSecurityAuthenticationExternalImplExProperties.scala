
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties (
    _jaasRanking: Option[ConfigNodePropertyInteger],
    _jaasControlFlag: Option[ConfigNodePropertyString],
    _jaasRealmName: Option[ConfigNodePropertyString],
    _idpName: Option[ConfigNodePropertyString],
    _syncHandlerName: Option[ConfigNodePropertyString]
)
object OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties {
    def toStringBody(var_jaasRanking: Object, var_jaasControlFlag: Object, var_jaasRealmName: Object, var_idpName: Object, var_syncHandlerName: Object) =
        s"""
        | {
        | "jaasRanking":$var_jaasRanking,"jaasControlFlag":$var_jaasControlFlag,"jaasRealmName":$var_jaasRealmName,"idpName":$var_idpName,"syncHandlerName":$var_syncHandlerName
        | }
        """.stripMargin
}
