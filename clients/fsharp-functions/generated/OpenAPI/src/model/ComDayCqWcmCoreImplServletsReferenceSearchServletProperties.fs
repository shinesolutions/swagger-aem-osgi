namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqWcmCoreImplServletsReferenceSearchServletProperties =

  //#region ComDayCqWcmCoreImplServletsReferenceSearchServletProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplServletsReferenceSearchServletProperties = {
    [<JsonProperty(PropertyName = "referencesearchservlet.maxReferencesPerPage")>]
    ReferencesearchservletMaxReferencesPerPage : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "referencesearchservlet.maxPages")>]
    ReferencesearchservletMaxPages : ConfigNodePropertyInteger;
  }

  //#endregion
