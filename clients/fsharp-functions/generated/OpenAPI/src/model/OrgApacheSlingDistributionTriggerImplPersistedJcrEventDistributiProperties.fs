namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties =

  //#region OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "serviceName")>]
    ServiceName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "nuggetsPath")>]
    NuggetsPath : ConfigNodePropertyString;
  }

  //#endregion
