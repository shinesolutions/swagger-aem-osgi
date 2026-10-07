namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties =

  //#region OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties


  type orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties = {
    Name : ConfigNodePropertyString;
    Title : ConfigNodePropertyString;
    Details : ConfigNodePropertyString;
    Enabled : ConfigNodePropertyBoolean;
    ServiceName : ConfigNodePropertyString;
    LogLevel : ConfigNodePropertyDropDown;
    AllowedRoots : ConfigNodePropertyArray;
    QueueProcessingEnabled : ConfigNodePropertyBoolean;
    PackageImporterEndpoints : ConfigNodePropertyArray;
    PassiveQueues : ConfigNodePropertyArray;
    PriorityQueues : ConfigNodePropertyArray;
    RetryStrategy : ConfigNodePropertyDropDown;
    RetryAttempts : ConfigNodePropertyInteger;
    RequestAuthorizationStrategyTarget : ConfigNodePropertyString;
    TransportSecretProviderTarget : ConfigNodePropertyString;
    PackageBuilderTarget : ConfigNodePropertyString;
    TriggersTarget : ConfigNodePropertyString;
    QueueProvider : ConfigNodePropertyDropDown;
    AsyncDelivery : ConfigNodePropertyBoolean;
    HttpConnTimeout : ConfigNodePropertyInteger;
  }
  //#endregion
