namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties =

  //#region ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties = {
    [<JsonProperty(PropertyName = "illegalCharMapping")>]
    IllegalCharMapping : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "pageSubTreeActivationCheck")>]
    PageSubTreeActivationCheck : ConfigNodePropertyBoolean;
  }

  //#endregion
