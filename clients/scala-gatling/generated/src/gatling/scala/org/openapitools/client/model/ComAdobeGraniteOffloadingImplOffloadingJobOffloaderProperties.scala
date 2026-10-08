
package org.openapitools.client.model


case class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties (
    _offloadingOffloaderEnabled: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties {
    def toStringBody(var_offloadingOffloaderEnabled: Object) =
        s"""
        | {
        | "offloadingOffloaderEnabled":$var_offloadingOffloaderEnabled
        | }
        """.stripMargin
}
