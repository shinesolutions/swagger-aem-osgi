
package org.openapitools.client.model


case class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties (
    _maxQuartzJobDurationAcceptable: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties {
    def toStringBody(var_maxQuartzJobDurationAcceptable: Object) =
        s"""
        | {
        | "maxQuartzJobDurationAcceptable":$var_maxQuartzJobDurationAcceptable
        | }
        """.stripMargin
}
