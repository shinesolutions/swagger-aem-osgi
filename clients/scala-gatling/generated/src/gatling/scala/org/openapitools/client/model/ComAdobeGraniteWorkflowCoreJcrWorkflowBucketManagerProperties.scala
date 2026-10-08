
package org.openapitools.client.model


case class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties (
    _bucketSize: Option[ConfigNodePropertyInteger]
)
object ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties {
    def toStringBody(var_bucketSize: Object) =
        s"""
        | {
        | "bucketSize":$var_bucketSize
        | }
        """.stripMargin
}
