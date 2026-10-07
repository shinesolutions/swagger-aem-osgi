namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqProjectsImplServletProjectImageServletProperties =

  //#region ComAdobeCqProjectsImplServletProjectImageServletProperties

  [<CLIMutable>]
  type ComAdobeCqProjectsImplServletProjectImageServletProperties = {
    [<JsonProperty(PropertyName = "image.quality")>]
    ImageQuality : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "image.supported.resolutions")>]
    ImageSupportedResolutions : ConfigNodePropertyString;
  }

  //#endregion
