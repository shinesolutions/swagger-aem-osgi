namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties =

  //#region ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties

  [<CLIMutable>]
  type ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties = {
    [<JsonProperty(PropertyName = "from.address")>]
    FromAddress : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sender.host")>]
    SenderHost : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "max.bounce.count")>]
    MaxBounceCount : ConfigNodePropertyString;
  }

  //#endregion
