namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties =

  //#region OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties = {
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
    [<JsonProperty(PropertyName = "requestAuthorizationStrategy.target")>]
    RequestAuthorizationStrategyTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "queueProviderFactory.target")>]
    QueueProviderFactoryTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "packageBuilder.target")>]
    PackageBuilderTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "triggers.target")>]
    TriggersTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "priorityQueues")>]
    PriorityQueues : ConfigNodePropertyArray;
  }

  //#endregion
