namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties =

  //#region ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties

  [<CLIMutable>]
  type ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties = {
    [<JsonProperty(PropertyName = "scheduler.expression")>]
    SchedulerExpression : ConfigNodePropertyString;
  }

  //#endregion
