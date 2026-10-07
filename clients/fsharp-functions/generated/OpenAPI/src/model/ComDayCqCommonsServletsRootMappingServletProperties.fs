namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqCommonsServletsRootMappingServletProperties =

  //#region ComDayCqCommonsServletsRootMappingServletProperties

  [<CLIMutable>]
  type ComDayCqCommonsServletsRootMappingServletProperties = {
    [<JsonProperty(PropertyName = "rootmapping.target")>]
    RootmappingTarget : ConfigNodePropertyString;
  }

  //#endregion
