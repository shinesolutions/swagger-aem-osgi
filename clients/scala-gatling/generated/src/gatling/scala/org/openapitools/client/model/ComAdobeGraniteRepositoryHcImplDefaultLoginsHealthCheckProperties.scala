
package org.openapitools.client.model


case class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray],
    _accountLogins: Option[ConfigNodePropertyArray],
    _consoleLogins: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties {
    def toStringBody(var_hcTags: Object, var_accountLogins: Object, var_consoleLogins: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags,"accountLogins":$var_accountLogins,"consoleLogins":$var_consoleLogins
        | }
        """.stripMargin
}
