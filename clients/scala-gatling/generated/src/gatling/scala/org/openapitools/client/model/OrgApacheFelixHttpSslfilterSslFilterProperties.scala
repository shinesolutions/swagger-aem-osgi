
package org.openapitools.client.model


case class OrgApacheFelixHttpSslfilterSslFilterProperties (
    _sslForwardHeader: Option[ConfigNodePropertyString],
    _sslForwardValue: Option[ConfigNodePropertyString],
    _sslForwardCertHeader: Option[ConfigNodePropertyString],
    _rewriteAbsoluteUrls: Option[ConfigNodePropertyBoolean]
)
object OrgApacheFelixHttpSslfilterSslFilterProperties {
    def toStringBody(var_sslForwardHeader: Object, var_sslForwardValue: Object, var_sslForwardCertHeader: Object, var_rewriteAbsoluteUrls: Object) =
        s"""
        | {
        | "sslForwardHeader":$var_sslForwardHeader,"sslForwardValue":$var_sslForwardValue,"sslForwardCertHeader":$var_sslForwardCertHeader,"rewriteAbsoluteUrls":$var_rewriteAbsoluteUrls
        | }
        """.stripMargin
}
