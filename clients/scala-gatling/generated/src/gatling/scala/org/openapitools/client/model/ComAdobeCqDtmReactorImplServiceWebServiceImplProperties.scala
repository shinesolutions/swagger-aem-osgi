
package org.openapitools.client.model


case class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties (
    _endpointUri: Option[ConfigNodePropertyString],
    _connectionTimeout: Option[ConfigNodePropertyInteger],
    _socketTimeout: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqDtmReactorImplServiceWebServiceImplProperties {
    def toStringBody(var_endpointUri: Object, var_connectionTimeout: Object, var_socketTimeout: Object) =
        s"""
        | {
        | "endpointUri":$var_endpointUri,"connectionTimeout":$var_connectionTimeout,"socketTimeout":$var_socketTimeout
        | }
        """.stripMargin
}
