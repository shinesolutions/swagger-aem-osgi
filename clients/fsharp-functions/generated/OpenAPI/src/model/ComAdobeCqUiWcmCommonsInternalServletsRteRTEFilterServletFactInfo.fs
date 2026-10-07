namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties

module ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo =

  //#region ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo

  [<CLIMutable>]
  type ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties;
  }

  //#endregion
