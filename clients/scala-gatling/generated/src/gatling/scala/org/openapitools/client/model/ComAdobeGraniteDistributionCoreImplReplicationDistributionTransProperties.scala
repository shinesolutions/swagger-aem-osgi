
package org.openapitools.client.model


case class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties (
    _forwardRequests: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties {
    def toStringBody(var_forwardRequests: Object) =
        s"""
        | {
        | "forwardRequests":$var_forwardRequests
        | }
        """.stripMargin
}
