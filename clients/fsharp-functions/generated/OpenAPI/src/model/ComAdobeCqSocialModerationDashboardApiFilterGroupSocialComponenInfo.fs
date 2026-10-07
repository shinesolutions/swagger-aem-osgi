namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties

module ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo =

  //#region ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo

  [<CLIMutable>]
  type ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties;
  }

  //#endregion
