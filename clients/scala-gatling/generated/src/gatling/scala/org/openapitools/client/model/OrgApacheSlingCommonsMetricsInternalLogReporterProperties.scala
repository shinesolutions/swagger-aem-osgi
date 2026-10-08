
package org.openapitools.client.model


case class OrgApacheSlingCommonsMetricsInternalLogReporterProperties (
    _period: Option[ConfigNodePropertyInteger],
    _timeUnit: Option[ConfigNodePropertyDropDown],
    _level: Option[ConfigNodePropertyDropDown],
    _loggerName: Option[ConfigNodePropertyString],
    _prefix: Option[ConfigNodePropertyString],
    _pattern: Option[ConfigNodePropertyString],
    _registryName: Option[ConfigNodePropertyString]
)
object OrgApacheSlingCommonsMetricsInternalLogReporterProperties {
    def toStringBody(var_period: Object, var_timeUnit: Object, var_level: Object, var_loggerName: Object, var_prefix: Object, var_pattern: Object, var_registryName: Object) =
        s"""
        | {
        | "period":$var_period,"timeUnit":$var_timeUnit,"level":$var_level,"loggerName":$var_loggerName,"prefix":$var_prefix,"pattern":$var_pattern,"registryName":$var_registryName
        | }
        """.stripMargin
}
