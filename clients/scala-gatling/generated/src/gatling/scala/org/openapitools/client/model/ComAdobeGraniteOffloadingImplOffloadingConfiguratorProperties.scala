
package org.openapitools.client.model


case class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties (
    _offloadingTransporter: Option[ConfigNodePropertyString],
    _offloadingCleanupPayload: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties {
    def toStringBody(var_offloadingTransporter: Object, var_offloadingCleanupPayload: Object) =
        s"""
        | {
        | "offloadingTransporter":$var_offloadingTransporter,"offloadingCleanupPayload":$var_offloadingCleanupPayload
        | }
        """.stripMargin
}
