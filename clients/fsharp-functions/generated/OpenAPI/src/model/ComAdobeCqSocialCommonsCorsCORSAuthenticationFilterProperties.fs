namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties =

  //#region ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties = {
    [<JsonProperty(PropertyName = "cors.enabling")>]
    CorsEnabling : ConfigNodePropertyBoolean;
  }

  //#endregion
