namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqMailerImplCqMailingServiceProperties =

  //#region ComDayCqMailerImplCqMailingServiceProperties

  [<CLIMutable>]
  type ComDayCqMailerImplCqMailingServiceProperties = {
    [<JsonProperty(PropertyName = "max.recipient.count")>]
    MaxRecipientCount : ConfigNodePropertyString;
  }

  //#endregion
