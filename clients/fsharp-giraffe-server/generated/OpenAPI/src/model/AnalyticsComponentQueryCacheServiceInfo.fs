namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnalyticsComponentQueryCacheServiceProperties

module AnalyticsComponentQueryCacheServiceInfo =

  //#region AnalyticsComponentQueryCacheServiceInfo


  type analyticsComponentQueryCacheServiceInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : AnalyticsComponentQueryCacheServiceProperties;
  }
  //#endregion
