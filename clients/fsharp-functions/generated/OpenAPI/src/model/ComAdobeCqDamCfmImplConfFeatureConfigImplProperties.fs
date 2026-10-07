namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqDamCfmImplConfFeatureConfigImplProperties =

  //#region ComAdobeCqDamCfmImplConfFeatureConfigImplProperties

  [<CLIMutable>]
  type ComAdobeCqDamCfmImplConfFeatureConfigImplProperties = {
    [<JsonProperty(PropertyName = "dam.cfm.resourceTypes")>]
    DamCfmResourceTypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "dam.cfm.referenceProperties")>]
    DamCfmReferenceProperties : ConfigNodePropertyArray;
  }

  //#endregion
