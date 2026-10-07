
package org.openapitools.client.model


case class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties (
    _name: Option[ConfigNodePropertyString],
    _title: Option[ConfigNodePropertyString],
    _details: Option[ConfigNodePropertyString],
    _enabled: Option[ConfigNodePropertyBoolean],
    _serviceName: Option[ConfigNodePropertyString],
    _logLevel: Option[ConfigNodePropertyDropDown],
    _queueProcessingEnabled: Option[ConfigNodePropertyBoolean],
    _passiveQueues: Option[ConfigNodePropertyArray],
    _packageExporterEndpoints: Option[ConfigNodePropertyArray],
    _packageImporterEndpoints: Option[ConfigNodePropertyArray],
    _retryStrategy: Option[ConfigNodePropertyDropDown],
    _retryAttempts: Option[ConfigNodePropertyInteger],
    _pullItems: Option[ConfigNodePropertyInteger],
    _httpConnTimeout: Option[ConfigNodePropertyInteger],
    _requestAuthorizationStrategyTarget: Option[ConfigNodePropertyString],
    _transportSecretProviderTarget: Option[ConfigNodePropertyString],
    _packageBuilderTarget: Option[ConfigNodePropertyString],
    _triggersTarget: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties {
    def toStringBody(var_name: Object, var_title: Object, var_details: Object, var_enabled: Object, var_serviceName: Object, var_logLevel: Object, var_queueProcessingEnabled: Object, var_passiveQueues: Object, var_packageExporterEndpoints: Object, var_packageImporterEndpoints: Object, var_retryStrategy: Object, var_retryAttempts: Object, var_pullItems: Object, var_httpConnTimeout: Object, var_requestAuthorizationStrategyTarget: Object, var_transportSecretProviderTarget: Object, var_packageBuilderTarget: Object, var_triggersTarget: Object) =
        s"""
        | {
        | "name":$var_name,"title":$var_title,"details":$var_details,"enabled":$var_enabled,"serviceName":$var_serviceName,"logLevel":$var_logLevel,"queueProcessingEnabled":$var_queueProcessingEnabled,"passiveQueues":$var_passiveQueues,"packageExporterEndpoints":$var_packageExporterEndpoints,"packageImporterEndpoints":$var_packageImporterEndpoints,"retryStrategy":$var_retryStrategy,"retryAttempts":$var_retryAttempts,"pullItems":$var_pullItems,"httpConnTimeout":$var_httpConnTimeout,"requestAuthorizationStrategyTarget":$var_requestAuthorizationStrategyTarget,"transportSecretProviderTarget":$var_transportSecretProviderTarget,"packageBuilderTarget":$var_packageBuilderTarget,"triggersTarget":$var_triggersTarget
        | }
        """.stripMargin
}
