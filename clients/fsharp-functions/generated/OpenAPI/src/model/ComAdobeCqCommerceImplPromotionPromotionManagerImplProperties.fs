namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties =

  //#region ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties

  [<CLIMutable>]
  type ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties = {
    [<JsonProperty(PropertyName = "cq.commerce.promotion.root")>]
    CqCommercePromotionRoot : ConfigNodePropertyString;
  }

  //#endregion
