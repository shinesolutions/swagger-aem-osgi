
package org.openapitools.client.model


case class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties (
    _providerName: Option[ConfigNodePropertyString],
    _forwardRequests: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties {
    def toStringBody(var_providerName: Object, var_forwardRequests: Object) =
        s"""
        | {
        | "providerName":$var_providerName,"forwardRequests":$var_forwardRequests
        | }
        """.stripMargin
}
