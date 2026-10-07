
package org.openapitools.client.model


case class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties (
    _name: Option[ConfigNodePropertyString],
    _title: Option[ConfigNodePropertyString],
    _details: Option[ConfigNodePropertyString],
    _enabled: Option[ConfigNodePropertyBoolean],
    _serviceName: Option[ConfigNodePropertyString],
    _logLevel: Option[ConfigNodePropertyDropDown],
    _allowedRoots: Option[ConfigNodePropertyArray],
    _queueProcessingEnabled: Option[ConfigNodePropertyBoolean],
    _packageImporterEndpoints: Option[ConfigNodePropertyArray],
    _passiveQueues: Option[ConfigNodePropertyArray],
    _priorityQueues: Option[ConfigNodePropertyArray],
    _retryStrategy: Option[ConfigNodePropertyDropDown],
    _retryAttempts: Option[ConfigNodePropertyInteger],
    _requestAuthorizationStrategyTarget: Option[ConfigNodePropertyString],
    _transportSecretProviderTarget: Option[ConfigNodePropertyString],
    _packageBuilderTarget: Option[ConfigNodePropertyString],
    _triggersTarget: Option[ConfigNodePropertyString],
    _queueProvider: Option[ConfigNodePropertyDropDown],
    _asyncDelivery: Option[ConfigNodePropertyBoolean],
    _httpConnTimeout: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties {
    def toStringBody(var_name: Object, var_title: Object, var_details: Object, var_enabled: Object, var_serviceName: Object, var_logLevel: Object, var_allowedRoots: Object, var_queueProcessingEnabled: Object, var_packageImporterEndpoints: Object, var_passiveQueues: Object, var_priorityQueues: Object, var_retryStrategy: Object, var_retryAttempts: Object, var_requestAuthorizationStrategyTarget: Object, var_transportSecretProviderTarget: Object, var_packageBuilderTarget: Object, var_triggersTarget: Object, var_queueProvider: Object, var_asyncDelivery: Object, var_httpConnTimeout: Object) =
        s"""
        | {
        | "name":$var_name,"title":$var_title,"details":$var_details,"enabled":$var_enabled,"serviceName":$var_serviceName,"logLevel":$var_logLevel,"allowedRoots":$var_allowedRoots,"queueProcessingEnabled":$var_queueProcessingEnabled,"packageImporterEndpoints":$var_packageImporterEndpoints,"passiveQueues":$var_passiveQueues,"priorityQueues":$var_priorityQueues,"retryStrategy":$var_retryStrategy,"retryAttempts":$var_retryAttempts,"requestAuthorizationStrategyTarget":$var_requestAuthorizationStrategyTarget,"transportSecretProviderTarget":$var_transportSecretProviderTarget,"packageBuilderTarget":$var_packageBuilderTarget,"triggersTarget":$var_triggersTarget,"queueProvider":$var_queueProvider,"asyncDelivery":$var_asyncDelivery,"httpConnTimeout":$var_httpConnTimeout
        | }
        """.stripMargin
}
