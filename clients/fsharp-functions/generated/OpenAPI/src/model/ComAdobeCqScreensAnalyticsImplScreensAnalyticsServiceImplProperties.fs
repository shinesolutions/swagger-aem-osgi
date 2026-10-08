namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties =

  //#region ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties

  [<CLIMutable>]
  type ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties = {
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.analytics.impl.url")>]
    ComAdobeCqScreensAnalyticsImplUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.analytics.impl.apikey")>]
    ComAdobeCqScreensAnalyticsImplApikey : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.analytics.impl.project")>]
    ComAdobeCqScreensAnalyticsImplProject : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.analytics.impl.environment")>]
    ComAdobeCqScreensAnalyticsImplEnvironment : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.analytics.impl.sendFrequency")>]
    ComAdobeCqScreensAnalyticsImplSendFrequency : ConfigNodePropertyInteger;
  }

  //#endregion
