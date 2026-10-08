
package org.openapitools.client.model


case class ComDayCommonsHttpclientProperties (
    _proxyEnabled: Option[ConfigNodePropertyBoolean],
    _proxyHost: Option[ConfigNodePropertyString],
    _proxyUser: Option[ConfigNodePropertyString],
    _proxyPassword: Option[ConfigNodePropertyString],
    _proxyNtlmHost: Option[ConfigNodePropertyString],
    _proxyNtlmDomain: Option[ConfigNodePropertyString],
    _proxyExceptions: Option[ConfigNodePropertyArray]
)
object ComDayCommonsHttpclientProperties {
    def toStringBody(var_proxyEnabled: Object, var_proxyHost: Object, var_proxyUser: Object, var_proxyPassword: Object, var_proxyNtlmHost: Object, var_proxyNtlmDomain: Object, var_proxyExceptions: Object) =
        s"""
        | {
        | "proxyEnabled":$var_proxyEnabled,"proxyHost":$var_proxyHost,"proxyUser":$var_proxyUser,"proxyPassword":$var_proxyPassword,"proxyNtlmHost":$var_proxyNtlmHost,"proxyNtlmDomain":$var_proxyNtlmDomain,"proxyExceptions":$var_proxyExceptions
        | }
        """.stripMargin
}
