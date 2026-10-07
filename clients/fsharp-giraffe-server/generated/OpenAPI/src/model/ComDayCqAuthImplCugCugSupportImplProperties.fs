namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqAuthImplCugCugSupportImplProperties =

  //#region ComDayCqAuthImplCugCugSupportImplProperties


  type comDayCqAuthImplCugCugSupportImplProperties = {
    CugExemptedPrincipals : ConfigNodePropertyArray;
    CugEnabled : ConfigNodePropertyBoolean;
    CugPrincipalsRegex : ConfigNodePropertyString;
    CugPrincipalsReplacement : ConfigNodePropertyString;
  }
  //#endregion
