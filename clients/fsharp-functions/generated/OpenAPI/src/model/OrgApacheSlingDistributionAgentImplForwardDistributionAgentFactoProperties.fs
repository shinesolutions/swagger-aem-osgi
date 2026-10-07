namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties =

  //#region OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "title")>]
    Title : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "details")>]
    Details : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "serviceName")>]
    ServiceName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "log.level")>]
    LogLevel : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "allowed.roots")>]
    AllowedRoots : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "queue.processing.enabled")>]
    QueueProcessingEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "packageImporter.endpoints")>]
    PackageImporterEndpoints : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "passiveQueues")>]
    PassiveQueues : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "priorityQueues")>]
    PriorityQueues : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "retry.strategy")>]
    RetryStrategy : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "retry.attempts")>]
    RetryAttempts : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "requestAuthorizationStrategy.target")>]
    RequestAuthorizationStrategyTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "transportSecretProvider.target")>]
    TransportSecretProviderTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "packageBuilder.target")>]
    PackageBuilderTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "triggers.target")>]
    TriggersTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "queue.provider")>]
    QueueProvider : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "async.delivery")>]
    AsyncDelivery : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "http.conn.timeout")>]
    HttpConnTimeout : ConfigNodePropertyInteger;
  }

  //#endregion
