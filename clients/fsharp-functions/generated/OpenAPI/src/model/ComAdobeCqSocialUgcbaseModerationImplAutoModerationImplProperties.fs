namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties =

  //#region ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties

  [<CLIMutable>]
  type ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties = {
    [<JsonProperty(PropertyName = "automoderation.sequence")>]
    AutomoderationSequence : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "automoderation.onfailurestop")>]
    AutomoderationOnfailurestop : ConfigNodePropertyBoolean;
  }

  //#endregion
