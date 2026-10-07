namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteLicenseImplLicenseCheckFilterProperties =

  //#region ComAdobeGraniteLicenseImplLicenseCheckFilterProperties


  type comAdobeGraniteLicenseImplLicenseCheckFilterProperties = {
    CheckInternval : ConfigNodePropertyInteger;
    ExcludeIds : ConfigNodePropertyArray;
    EncryptPing : ConfigNodePropertyBoolean;
  }
  //#endregion
