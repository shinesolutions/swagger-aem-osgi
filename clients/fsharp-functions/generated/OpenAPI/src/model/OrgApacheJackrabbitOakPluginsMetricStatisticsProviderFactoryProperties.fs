namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyDropDown

module OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties =

  //#region OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties = {
    [<JsonProperty(PropertyName = "providerType")>]
    ProviderType : ConfigNodePropertyDropDown;
  }

  //#endregion
