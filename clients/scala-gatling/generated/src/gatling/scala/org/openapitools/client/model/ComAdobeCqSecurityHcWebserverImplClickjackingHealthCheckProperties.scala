
package org.openapitools.client.model


case class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray],
    _webserverAddress: Option[ConfigNodePropertyString]
)
object ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties {
    def toStringBody(var_hcTags: Object, var_webserverAddress: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags,"webserverAddress":$var_webserverAddress
        | }
        """.stripMargin
}
