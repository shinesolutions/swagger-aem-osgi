namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqReplicationContentStaticContentBuilderProperties =

  //#region ComDayCqReplicationContentStaticContentBuilderProperties

  [<CLIMutable>]
  type ComDayCqReplicationContentStaticContentBuilderProperties = {
    [<JsonProperty(PropertyName = "host")>]
    Host : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "port")>]
    Port : ConfigNodePropertyInteger;
  }

  //#endregion
