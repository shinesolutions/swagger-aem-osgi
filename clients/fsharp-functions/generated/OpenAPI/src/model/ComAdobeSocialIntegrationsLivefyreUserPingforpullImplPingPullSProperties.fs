namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties =

  //#region ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties

  [<CLIMutable>]
  type ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties = {
    [<JsonProperty(PropertyName = "communities.integration.livefyre.sling.event.filter")>]
    CommunitiesIntegrationLivefyreSlingEventFilter : ConfigNodePropertyString;
  }

  //#endregion
