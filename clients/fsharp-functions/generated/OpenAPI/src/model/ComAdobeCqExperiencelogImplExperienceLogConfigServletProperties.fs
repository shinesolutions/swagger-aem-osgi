namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties =

  //#region ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties

  [<CLIMutable>]
  type ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "disabledForGroups")>]
    DisabledForGroups : ConfigNodePropertyArray;
  }

  //#endregion
