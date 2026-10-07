namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties =

  //#region ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties

  [<CLIMutable>]
  type ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties = {
    [<JsonProperty(PropertyName = "enable")>]
    Enable : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "ttl1")>]
    Ttl1 : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "ttl2")>]
    Ttl2 : ConfigNodePropertyInteger;
  }

  //#endregion
