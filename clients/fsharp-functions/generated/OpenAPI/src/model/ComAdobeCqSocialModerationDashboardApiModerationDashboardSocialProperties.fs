namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties =

  //#region ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties

  [<CLIMutable>]
  type ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties = {
    [<JsonProperty(PropertyName = "priority")>]
    Priority : ConfigNodePropertyInteger;
  }

  //#endregion
