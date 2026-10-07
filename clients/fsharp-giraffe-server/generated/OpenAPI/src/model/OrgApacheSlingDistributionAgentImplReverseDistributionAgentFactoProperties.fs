namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties =

  //#region OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties


  type orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties = {
    Name : ConfigNodePropertyString;
    Title : ConfigNodePropertyString;
    Details : ConfigNodePropertyString;
    Enabled : ConfigNodePropertyBoolean;
    ServiceName : ConfigNodePropertyString;
    LogLevel : ConfigNodePropertyDropDown;
    QueueProcessingEnabled : ConfigNodePropertyBoolean;
    PackageExporterEndpoints : ConfigNodePropertyArray;
    PullItems : ConfigNodePropertyInteger;
    HttpConnTimeout : ConfigNodePropertyInteger;
    RequestAuthorizationStrategyTarget : ConfigNodePropertyString;
    TransportSecretProviderTarget : ConfigNodePropertyString;
    PackageBuilderTarget : ConfigNodePropertyString;
    TriggersTarget : ConfigNodePropertyString;
  }
  //#endregion
