
package org.openapitools.client.model


case class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties (
    _jobConsumermanagerDisableDistribution: Option[ConfigNodePropertyBoolean],
    _startupDelay: Option[ConfigNodePropertyInteger],
    _cleanupPeriod: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties {
    def toStringBody(var_jobConsumermanagerDisableDistribution: Object, var_startupDelay: Object, var_cleanupPeriod: Object) =
        s"""
        | {
        | "jobConsumermanagerDisableDistribution":$var_jobConsumermanagerDisableDistribution,"startupDelay":$var_startupDelay,"cleanupPeriod":$var_cleanupPeriod
        | }
        """.stripMargin
}
