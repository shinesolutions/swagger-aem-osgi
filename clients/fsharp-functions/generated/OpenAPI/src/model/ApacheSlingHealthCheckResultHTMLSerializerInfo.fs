namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ApacheSlingHealthCheckResultHTMLSerializerProperties

module ApacheSlingHealthCheckResultHTMLSerializerInfo =

  //#region ApacheSlingHealthCheckResultHTMLSerializerInfo

  [<CLIMutable>]
  type ApacheSlingHealthCheckResultHTMLSerializerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ApacheSlingHealthCheckResultHTMLSerializerProperties;
  }

  //#endregion
