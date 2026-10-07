namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties =

  //#region ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties

  [<CLIMutable>]
  type ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties = {
    [<JsonProperty(PropertyName = "sling.servlet.extensions")>]
    SlingServletExtensions : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.paths")>]
    SlingServletPaths : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.methods")>]
    SlingServletMethods : ConfigNodePropertyString;
  }

  //#endregion
