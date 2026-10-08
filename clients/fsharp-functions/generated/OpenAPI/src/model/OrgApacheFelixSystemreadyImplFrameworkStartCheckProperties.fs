namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties =

  //#region OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties

  [<CLIMutable>]
  type OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties = {
    [<JsonProperty(PropertyName = "timeout")>]
    Timeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "target.start.level")>]
    TargetStartLevel : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "target.start.level.prop.name")>]
    TargetStartLevelPropName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "type")>]
    Type : ConfigNodePropertyDropDown;
  }

  //#endregion
