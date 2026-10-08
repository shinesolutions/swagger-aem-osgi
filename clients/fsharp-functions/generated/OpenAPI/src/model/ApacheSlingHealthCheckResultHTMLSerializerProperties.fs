namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ApacheSlingHealthCheckResultHTMLSerializerProperties =

  //#region ApacheSlingHealthCheckResultHTMLSerializerProperties

  [<CLIMutable>]
  type ApacheSlingHealthCheckResultHTMLSerializerProperties = {
    [<JsonProperty(PropertyName = "styleString")>]
    StyleString : ConfigNodePropertyString;
  }

  //#endregion
