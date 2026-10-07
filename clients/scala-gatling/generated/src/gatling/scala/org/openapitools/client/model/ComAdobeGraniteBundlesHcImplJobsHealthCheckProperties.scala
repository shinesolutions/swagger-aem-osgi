
package org.openapitools.client.model


case class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray],
    _maxQueuedJobs: Option[ConfigNodePropertyInteger]
)
object ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties {
    def toStringBody(var_hcTags: Object, var_maxQueuedJobs: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags,"maxQueuedJobs":$var_maxQueuedJobs
        | }
        """.stripMargin
}
