namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties =

  //#region OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties


  type orgApacheFelixSystemreadyImplFrameworkStartCheckProperties = {
    Timeout : ConfigNodePropertyInteger;
    TargetStartLevel : ConfigNodePropertyInteger;
    TargetStartLevelPropName : ConfigNodePropertyString;
    Type : ConfigNodePropertyDropDown;
  }
  //#endregion
