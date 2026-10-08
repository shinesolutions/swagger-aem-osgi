
package org.openapitools.client.model


case class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties (
    _importerName: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties {
    def toStringBody(var_importerName: Object) =
        s"""
        | {
        | "importerName":$var_importerName
        | }
        """.stripMargin
}
