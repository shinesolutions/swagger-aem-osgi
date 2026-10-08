namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties =

  //#region OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties


  type orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties = {
    Name : ConfigNodePropertyString;
    Title : ConfigNodePropertyString;
    Details : ConfigNodePropertyString;
    Enabled : ConfigNodePropertyBoolean;
    ServiceName : ConfigNodePropertyString;
    LogLevel : ConfigNodePropertyDropDown;
    AllowedRoots : ConfigNodePropertyArray;
    RequestAuthorizationStrategyTarget : ConfigNodePropertyString;
    QueueProviderFactoryTarget : ConfigNodePropertyString;
    PackageBuilderTarget : ConfigNodePropertyString;
    TriggersTarget : ConfigNodePropertyString;
    PriorityQueues : ConfigNodePropertyArray;
  }
  //#endregion
