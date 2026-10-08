namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties

module ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo =

  //#region ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo

  [<CLIMutable>]
  type ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
  }

  //#endregion
