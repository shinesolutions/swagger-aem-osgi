namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties

module ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo =

  //#region ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo

  [<CLIMutable>]
  type ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties;
  }

  //#endregion
