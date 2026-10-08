namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties

module ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo =

  //#region ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo

  [<CLIMutable>]
  type ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties;
  }

  //#endregion
