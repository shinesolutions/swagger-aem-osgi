
package org.openapitools.client.model


case class OrgApacheHttpProxyconfiguratorProperties (
    _proxyEnabled: Option[ConfigNodePropertyBoolean],
    _proxyHost: Option[ConfigNodePropertyString],
    _proxyPort: Option[ConfigNodePropertyInteger],
    _proxyUser: Option[ConfigNodePropertyString],
    _proxyPassword: Option[ConfigNodePropertyString],
    _proxyExceptions: Option[ConfigNodePropertyArray]
)
object OrgApacheHttpProxyconfiguratorProperties {
    def toStringBody(var_proxyEnabled: Object, var_proxyHost: Object, var_proxyPort: Object, var_proxyUser: Object, var_proxyPassword: Object, var_proxyExceptions: Object) =
        s"""
        | {
        | "proxyEnabled":$var_proxyEnabled,"proxyHost":$var_proxyHost,"proxyPort":$var_proxyPort,"proxyUser":$var_proxyUser,"proxyPassword":$var_proxyPassword,"proxyExceptions":$var_proxyExceptions
        | }
        """.stripMargin
}
