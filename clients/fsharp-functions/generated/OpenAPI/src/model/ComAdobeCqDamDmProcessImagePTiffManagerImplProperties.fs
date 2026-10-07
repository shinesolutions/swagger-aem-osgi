namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqDamDmProcessImagePTiffManagerImplProperties =

  //#region ComAdobeCqDamDmProcessImagePTiffManagerImplProperties

  [<CLIMutable>]
  type ComAdobeCqDamDmProcessImagePTiffManagerImplProperties = {
    [<JsonProperty(PropertyName = "maxMemory")>]
    MaxMemory : ConfigNodePropertyInteger;
  }

  //#endregion
