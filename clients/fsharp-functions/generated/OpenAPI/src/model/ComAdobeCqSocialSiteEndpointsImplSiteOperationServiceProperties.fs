namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties =

  //#region ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties

  [<CLIMutable>]
  type ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties = {
    [<JsonProperty(PropertyName = "fieldWhitelist")>]
    FieldWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "sitePathFilters")>]
    SitePathFilters : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "sitePackageGroup")>]
    SitePackageGroup : ConfigNodePropertyString;
  }

  //#endregion
