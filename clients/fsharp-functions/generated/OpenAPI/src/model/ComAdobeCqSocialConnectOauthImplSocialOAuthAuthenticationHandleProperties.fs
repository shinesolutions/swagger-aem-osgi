namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties =

  //#region ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties

  [<CLIMutable>]
  type ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties = {
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
  }

  //#endregion
