
package org.openapitools.client.model


case class ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
