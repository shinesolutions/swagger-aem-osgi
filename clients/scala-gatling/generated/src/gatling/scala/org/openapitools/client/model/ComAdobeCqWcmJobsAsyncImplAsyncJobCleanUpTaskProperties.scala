
package org.openapitools.client.model


case class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties (
    _schedulerExpression: Option[ConfigNodePropertyString],
    _jobPurgeThreshold: Option[ConfigNodePropertyInteger],
    _jobPurgeMaxJobs: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties {
    def toStringBody(var_schedulerExpression: Object, var_jobPurgeThreshold: Object, var_jobPurgeMaxJobs: Object) =
        s"""
        | {
        | "schedulerExpression":$var_schedulerExpression,"jobPurgeThreshold":$var_jobPurgeThreshold,"jobPurgeMaxJobs":$var_jobPurgeMaxJobs
        | }
        """.stripMargin
}
