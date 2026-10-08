namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteLicenseImplLicenseCheckFilterProperties =

  //#region ComAdobeGraniteLicenseImplLicenseCheckFilterProperties

  [<CLIMutable>]
  type ComAdobeGraniteLicenseImplLicenseCheckFilterProperties = {
    [<JsonProperty(PropertyName = "checkInternval")>]
    CheckInternval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "excludeIds")>]
    ExcludeIds : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "encryptPing")>]
    EncryptPing : ConfigNodePropertyBoolean;
  }

  //#endregion
