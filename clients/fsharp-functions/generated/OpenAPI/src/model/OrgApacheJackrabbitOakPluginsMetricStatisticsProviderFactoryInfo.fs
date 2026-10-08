namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties

module OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo =

  //#region OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties;
  }

  //#endregion
