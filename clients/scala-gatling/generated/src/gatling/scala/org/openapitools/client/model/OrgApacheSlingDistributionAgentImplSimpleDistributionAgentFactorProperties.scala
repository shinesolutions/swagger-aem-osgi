
package org.openapitools.client.model


case class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties (
    _name: Option[ConfigNodePropertyString],
    _title: Option[ConfigNodePropertyString],
    _details: Option[ConfigNodePropertyString],
    _enabled: Option[ConfigNodePropertyBoolean],
    _serviceName: Option[ConfigNodePropertyString],
    _logLevel: Option[ConfigNodePropertyDropDown],
    _queueProcessingEnabled: Option[ConfigNodePropertyBoolean],
    _packageExporterTarget: Option[ConfigNodePropertyString],
    _packageImporterTarget: Option[ConfigNodePropertyString],
    _requestAuthorizationStrategyTarget: Option[ConfigNodePropertyString],
    _triggersTarget: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties {
    def toStringBody(var_name: Object, var_title: Object, var_details: Object, var_enabled: Object, var_serviceName: Object, var_logLevel: Object, var_queueProcessingEnabled: Object, var_packageExporterTarget: Object, var_packageImporterTarget: Object, var_requestAuthorizationStrategyTarget: Object, var_triggersTarget: Object) =
        s"""
        | {
        | "name":$var_name,"title":$var_title,"details":$var_details,"enabled":$var_enabled,"serviceName":$var_serviceName,"logLevel":$var_logLevel,"queueProcessingEnabled":$var_queueProcessingEnabled,"packageExporterTarget":$var_packageExporterTarget,"packageImporterTarget":$var_packageImporterTarget,"requestAuthorizationStrategyTarget":$var_requestAuthorizationStrategyTarget,"triggersTarget":$var_triggersTarget
        | }
        """.stripMargin
}
