namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingTracerInternalLogTracerProperties

module OrgApacheSlingTracerInternalLogTracerInfo =

  //#region OrgApacheSlingTracerInternalLogTracerInfo

  [<CLIMutable>]
  type OrgApacheSlingTracerInternalLogTracerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingTracerInternalLogTracerProperties;
  }

  //#endregion
