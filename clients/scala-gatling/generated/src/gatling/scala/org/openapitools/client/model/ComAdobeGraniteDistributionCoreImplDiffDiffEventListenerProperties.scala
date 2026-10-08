
package org.openapitools.client.model


case class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties (
    _diffPath: Option[ConfigNodePropertyString],
    _serviceName: Option[ConfigNodePropertyString],
    _serviceUserTarget: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties {
    def toStringBody(var_diffPath: Object, var_serviceName: Object, var_serviceUserTarget: Object) =
        s"""
        | {
        | "diffPath":$var_diffPath,"serviceName":$var_serviceName,"serviceUserTarget":$var_serviceUserTarget
        | }
        """.stripMargin
}
