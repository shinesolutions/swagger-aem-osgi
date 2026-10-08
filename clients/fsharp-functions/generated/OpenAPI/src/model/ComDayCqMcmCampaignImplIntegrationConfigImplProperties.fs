namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqMcmCampaignImplIntegrationConfigImplProperties =

  //#region ComDayCqMcmCampaignImplIntegrationConfigImplProperties

  [<CLIMutable>]
  type ComDayCqMcmCampaignImplIntegrationConfigImplProperties = {
    [<JsonProperty(PropertyName = "aem.mcm.campaign.formConstraints")>]
    AemMcmCampaignFormConstraints : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "aem.mcm.campaign.publicUrl")>]
    AemMcmCampaignPublicUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "aem.mcm.campaign.relaxedSSL")>]
    AemMcmCampaignRelaxedSSL : ConfigNodePropertyBoolean;
  }

  //#endregion
