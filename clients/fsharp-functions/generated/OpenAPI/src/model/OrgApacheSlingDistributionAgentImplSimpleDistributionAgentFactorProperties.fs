namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties =

  //#region OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties = {
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
    [<JsonProperty(PropertyName = "queue.processing.enabled")>]
    QueueProcessingEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "packageExporter.target")>]
    PackageExporterTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "packageImporter.target")>]
    PackageImporterTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "requestAuthorizationStrategy.target")>]
    RequestAuthorizationStrategyTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "triggers.target")>]
    TriggersTarget : ConfigNodePropertyString;
  }

  //#endregion
