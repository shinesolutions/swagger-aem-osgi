namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties =

  //#region ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties

  [<CLIMutable>]
  type ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties = {
    [<JsonProperty(PropertyName = "resourceType.filters")>]
    ResourceTypeFilters : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "priority")>]
    Priority : ConfigNodePropertyInteger;
  }

  //#endregion
