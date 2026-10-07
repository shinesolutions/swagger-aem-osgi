
package org.openapitools.client.model


case class OrgApacheSlingSecurityImplReferrerFilterProperties (
    _allowEmpty: Option[ConfigNodePropertyBoolean],
    _allowHosts: Option[ConfigNodePropertyArray],
    _allowHostsRegexp: Option[ConfigNodePropertyArray],
    _filterMethods: Option[ConfigNodePropertyArray],
    _excludeAgentsRegexp: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingSecurityImplReferrerFilterProperties {
    def toStringBody(var_allowEmpty: Object, var_allowHosts: Object, var_allowHostsRegexp: Object, var_filterMethods: Object, var_excludeAgentsRegexp: Object) =
        s"""
        | {
        | "allowEmpty":$var_allowEmpty,"allowHosts":$var_allowHosts,"allowHostsRegexp":$var_allowHostsRegexp,"filterMethods":$var_filterMethods,"excludeAgentsRegexp":$var_excludeAgentsRegexp
        | }
        """.stripMargin
}
