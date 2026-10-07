namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties

module ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo =

  //#region ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo

  [<CLIMutable>]
  type ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties;
  }

  //#endregion
