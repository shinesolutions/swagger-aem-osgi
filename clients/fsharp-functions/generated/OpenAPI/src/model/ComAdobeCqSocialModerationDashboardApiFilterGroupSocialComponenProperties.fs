namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties =

  //#region ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties

  [<CLIMutable>]
  type ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties = {
    [<JsonProperty(PropertyName = "resourceType.filters")>]
    ResourceTypeFilters : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "priority")>]
    Priority : ConfigNodePropertyInteger;
  }

  //#endregion
