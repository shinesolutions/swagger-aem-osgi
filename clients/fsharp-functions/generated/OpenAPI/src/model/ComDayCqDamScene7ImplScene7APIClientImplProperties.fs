namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamScene7ImplScene7APIClientImplProperties =

  //#region ComDayCqDamScene7ImplScene7APIClientImplProperties

  [<CLIMutable>]
  type ComDayCqDamScene7ImplScene7APIClientImplProperties = {
    [<JsonProperty(PropertyName = "cq.dam.scene7.apiclient.recordsperpage.nofilter.name")>]
    CqDamScene7ApiclientRecordsperpageNofilterName : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.scene7.apiclient.recordsperpage.withfilter.name")>]
    CqDamScene7ApiclientRecordsperpageWithfilterName : ConfigNodePropertyInteger;
  }

  //#endregion
