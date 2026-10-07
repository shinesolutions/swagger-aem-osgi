namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties =

  //#region OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties = {
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
    [<JsonProperty(PropertyName = "packageExporter.endpoints")>]
    PackageExporterEndpoints : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "pull.items")>]
    PullItems : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "http.conn.timeout")>]
    HttpConnTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "requestAuthorizationStrategy.target")>]
    RequestAuthorizationStrategyTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "transportSecretProvider.target")>]
    TransportSecretProviderTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "packageBuilder.target")>]
    PackageBuilderTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "triggers.target")>]
    TriggersTarget : ConfigNodePropertyString;
  }

  //#endregion
