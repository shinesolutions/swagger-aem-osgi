namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties =

  //#region ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties = {
    [<JsonProperty(PropertyName = "contentReferenceConfig.resourceTypes")>]
    ContentReferenceConfigResourceTypes : ConfigNodePropertyArray;
  }

  //#endregion
