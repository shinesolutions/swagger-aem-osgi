namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties =

  //#region ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "max.queued.jobs")>]
    MaxQueuedJobs : ConfigNodePropertyInteger;
  }

  //#endregion
