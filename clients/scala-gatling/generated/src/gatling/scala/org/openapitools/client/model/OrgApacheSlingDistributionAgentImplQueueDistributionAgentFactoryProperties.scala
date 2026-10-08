
package org.openapitools.client.model


case class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties (
    _name: Option[ConfigNodePropertyString],
    _title: Option[ConfigNodePropertyString],
    _details: Option[ConfigNodePropertyString],
    _enabled: Option[ConfigNodePropertyBoolean],
    _serviceName: Option[ConfigNodePropertyString],
    _logLevel: Option[ConfigNodePropertyDropDown],
    _allowedRoots: Option[ConfigNodePropertyArray],
    _requestAuthorizationStrategyTarget: Option[ConfigNodePropertyString],
    _queueProviderFactoryTarget: Option[ConfigNodePropertyString],
    _packageBuilderTarget: Option[ConfigNodePropertyString],
    _triggersTarget: Option[ConfigNodePropertyString],
    _priorityQueues: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties {
    def toStringBody(var_name: Object, var_title: Object, var_details: Object, var_enabled: Object, var_serviceName: Object, var_logLevel: Object, var_allowedRoots: Object, var_requestAuthorizationStrategyTarget: Object, var_queueProviderFactoryTarget: Object, var_packageBuilderTarget: Object, var_triggersTarget: Object, var_priorityQueues: Object) =
        s"""
        | {
        | "name":$var_name,"title":$var_title,"details":$var_details,"enabled":$var_enabled,"serviceName":$var_serviceName,"logLevel":$var_logLevel,"allowedRoots":$var_allowedRoots,"requestAuthorizationStrategyTarget":$var_requestAuthorizationStrategyTarget,"queueProviderFactoryTarget":$var_queueProviderFactoryTarget,"packageBuilderTarget":$var_packageBuilderTarget,"triggersTarget":$var_triggersTarget,"priorityQueues":$var_priorityQueues
        | }
        """.stripMargin
}
