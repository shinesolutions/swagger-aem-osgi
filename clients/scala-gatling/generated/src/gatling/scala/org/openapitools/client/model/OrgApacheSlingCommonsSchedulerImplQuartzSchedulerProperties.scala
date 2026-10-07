
package org.openapitools.client.model


case class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties (
    _poolName: Option[ConfigNodePropertyString],
    _allowedPoolNames: Option[ConfigNodePropertyArray],
    _schedulerUseleaderforsingle: Option[ConfigNodePropertyBoolean],
    _metricsFilters: Option[ConfigNodePropertyArray],
    _slowThresholdMillis: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties {
    def toStringBody(var_poolName: Object, var_allowedPoolNames: Object, var_schedulerUseleaderforsingle: Object, var_metricsFilters: Object, var_slowThresholdMillis: Object) =
        s"""
        | {
        | "poolName":$var_poolName,"allowedPoolNames":$var_allowedPoolNames,"schedulerUseleaderforsingle":$var_schedulerUseleaderforsingle,"metricsFilters":$var_metricsFilters,"slowThresholdMillis":$var_slowThresholdMillis
        | }
        """.stripMargin
}
