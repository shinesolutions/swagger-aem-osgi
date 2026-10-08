namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialGroupImplGroupServiceImplProperties =

  //#region ComAdobeCqSocialGroupImplGroupServiceImplProperties

  [<CLIMutable>]
  type ComAdobeCqSocialGroupImplGroupServiceImplProperties = {
    [<JsonProperty(PropertyName = "maxWaitTime")>]
    MaxWaitTime : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "minWaitBetweenRetries")>]
    MinWaitBetweenRetries : ConfigNodePropertyInteger;
  }

  //#endregion
