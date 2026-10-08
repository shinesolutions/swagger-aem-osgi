namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module MessagingUserComponentFactoryProperties =

  //#region MessagingUserComponentFactoryProperties

  [<CLIMutable>]
  type MessagingUserComponentFactoryProperties = {
    [<JsonProperty(PropertyName = "priority")>]
    Priority : ConfigNodePropertyInteger;
  }

  //#endregion
