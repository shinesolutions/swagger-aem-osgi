namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties =

  //#region ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties = {
    [<JsonProperty(PropertyName = "supportedPaths")>]
    SupportedPaths : ConfigNodePropertyArray;
  }

  //#endregion
