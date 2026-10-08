namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties =

  //#region ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties

  [<CLIMutable>]
  type ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties = {
    [<JsonProperty(PropertyName = "isMemberCheck")>]
    IsMemberCheck : ConfigNodePropertyBoolean;
  }

  //#endregion
