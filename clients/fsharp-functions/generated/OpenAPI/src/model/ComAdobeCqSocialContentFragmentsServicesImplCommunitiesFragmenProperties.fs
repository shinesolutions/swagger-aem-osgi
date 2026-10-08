namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties =

  //#region ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties

  [<CLIMutable>]
  type ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties = {
    [<JsonProperty(PropertyName = "cq.social.content.fragments.services.enabled")>]
    CqSocialContentFragmentsServicesEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cq.social.content.fragments.services.waitTimeSeconds")>]
    CqSocialContentFragmentsServicesWaitTimeSeconds : ConfigNodePropertyInteger;
  }

  //#endregion
