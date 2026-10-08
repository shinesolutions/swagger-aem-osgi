namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties =

  //#region ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties

  [<CLIMutable>]
  type ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties = {
    [<JsonProperty(PropertyName = "cq.wcm.qrcode.servlet.whitelist")>]
    CqWcmQrcodeServletWhitelist : ConfigNodePropertyArray;
  }

  //#endregion
