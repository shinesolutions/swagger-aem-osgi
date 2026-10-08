namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingStartupfilterImplStartupFilterImplProperties =

  //#region OrgApacheSlingStartupfilterImplStartupFilterImplProperties

  [<CLIMutable>]
  type OrgApacheSlingStartupfilterImplStartupFilterImplProperties = {
    [<JsonProperty(PropertyName = "active.by.default")>]
    ActiveByDefault : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "default.message")>]
    DefaultMessage : ConfigNodePropertyString;
  }

  //#endregion
