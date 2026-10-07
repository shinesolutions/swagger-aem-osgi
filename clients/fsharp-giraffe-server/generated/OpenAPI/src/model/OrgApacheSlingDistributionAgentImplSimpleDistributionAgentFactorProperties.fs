namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties =

  //#region OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties


  type orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties = {
    Name : ConfigNodePropertyString;
    Title : ConfigNodePropertyString;
    Details : ConfigNodePropertyString;
    Enabled : ConfigNodePropertyBoolean;
    ServiceName : ConfigNodePropertyString;
    LogLevel : ConfigNodePropertyDropDown;
    QueueProcessingEnabled : ConfigNodePropertyBoolean;
    PackageExporterTarget : ConfigNodePropertyString;
    PackageImporterTarget : ConfigNodePropertyString;
    RequestAuthorizationStrategyTarget : ConfigNodePropertyString;
    TriggersTarget : ConfigNodePropertyString;
  }
  //#endregion
