namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmFoundationImplPageRedirectServletProperties =

  //#region ComDayCqWcmFoundationImplPageRedirectServletProperties

  [<CLIMutable>]
  type ComDayCqWcmFoundationImplPageRedirectServletProperties = {
    [<JsonProperty(PropertyName = "excluded.resource.types")>]
    ExcludedResourceTypes : ConfigNodePropertyArray;
  }

  //#endregion
