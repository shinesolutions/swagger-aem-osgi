namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties =

  //#region ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties = {
    [<JsonProperty(PropertyName = "numberOfDays")>]
    NumberOfDays : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "ageOfFile")>]
    AgeOfFile : ConfigNodePropertyInteger;
  }

  //#endregion
