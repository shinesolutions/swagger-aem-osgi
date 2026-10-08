namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties

module ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo =

  //#region ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo

  [<CLIMutable>]
  type ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties;
  }

  //#endregion
