namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties =

  //#region ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties

  [<CLIMutable>]
  type ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties = {
    [<JsonProperty(PropertyName = "group.listing.pagination.enable")>]
    GroupListingPaginationEnable : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "group.listing.lazyloading.enable")>]
    GroupListingLazyloadingEnable : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "page.size")>]
    PageSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "priority")>]
    Priority : ConfigNodePropertyInteger;
  }

  //#endregion
