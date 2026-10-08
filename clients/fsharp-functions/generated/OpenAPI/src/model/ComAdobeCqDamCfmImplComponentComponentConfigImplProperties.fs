namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqDamCfmImplComponentComponentConfigImplProperties =

  //#region ComAdobeCqDamCfmImplComponentComponentConfigImplProperties

  [<CLIMutable>]
  type ComAdobeCqDamCfmImplComponentComponentConfigImplProperties = {
    [<JsonProperty(PropertyName = "dam.cfm.component.resourceType")>]
    DamCfmComponentResourceType : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "dam.cfm.component.fileReferenceProp")>]
    DamCfmComponentFileReferenceProp : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "dam.cfm.component.elementsProp")>]
    DamCfmComponentElementsProp : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "dam.cfm.component.variationProp")>]
    DamCfmComponentVariationProp : ConfigNodePropertyString;
  }

  //#endregion
