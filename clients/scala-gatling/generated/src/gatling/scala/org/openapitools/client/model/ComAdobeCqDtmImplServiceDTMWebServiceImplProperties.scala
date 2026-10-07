
package org.openapitools.client.model


case class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties (
    _connectionTimeout: Option[ConfigNodePropertyInteger],
    _socketTimeout: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqDtmImplServiceDTMWebServiceImplProperties {
    def toStringBody(var_connectionTimeout: Object, var_socketTimeout: Object) =
        s"""
        | {
        | "connectionTimeout":$var_connectionTimeout,"socketTimeout":$var_socketTimeout
        | }
        """.stripMargin
}
