namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties =

  //#region OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties


  type orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties = {
    Name : ConfigNodePropertyString;
    Title : ConfigNodePropertyString;
    Details : ConfigNodePropertyString;
    Enabled : ConfigNodePropertyBoolean;
    ServiceName : ConfigNodePropertyString;
    LogLevel : ConfigNodePropertyDropDown;
    QueueProcessingEnabled : ConfigNodePropertyBoolean;
    PassiveQueues : ConfigNodePropertyArray;
    PackageExporterEndpoints : ConfigNodePropertyArray;
    PackageImporterEndpoints : ConfigNodePropertyArray;
    RetryStrategy : ConfigNodePropertyDropDown;
    RetryAttempts : ConfigNodePropertyInteger;
    PullItems : ConfigNodePropertyInteger;
    HttpConnTimeout : ConfigNodePropertyInteger;
    RequestAuthorizationStrategyTarget : ConfigNodePropertyString;
    TransportSecretProviderTarget : ConfigNodePropertyString;
    PackageBuilderTarget : ConfigNodePropertyString;
    TriggersTarget : ConfigNodePropertyString;
  }
  //#endregion
