
package org.openapitools.client.model


case class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray],
    _dispatcherAddress: Option[ConfigNodePropertyString],
    _dispatcherFilterAllowed: Option[ConfigNodePropertyArray],
    _dispatcherFilterBlocked: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties {
    def toStringBody(var_hcTags: Object, var_dispatcherAddress: Object, var_dispatcherFilterAllowed: Object, var_dispatcherFilterBlocked: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags,"dispatcherAddress":$var_dispatcherAddress,"dispatcherFilterAllowed":$var_dispatcherFilterAllowed,"dispatcherFilterBlocked":$var_dispatcherFilterBlocked
        | }
        """.stripMargin
}
