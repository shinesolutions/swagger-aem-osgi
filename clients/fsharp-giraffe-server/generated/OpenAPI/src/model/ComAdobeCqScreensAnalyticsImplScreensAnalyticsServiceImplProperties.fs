namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties =

  //#region ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties


  type comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties = {
    ComAdobeCqScreensAnalyticsImplUrl : ConfigNodePropertyString;
    ComAdobeCqScreensAnalyticsImplApikey : ConfigNodePropertyString;
    ComAdobeCqScreensAnalyticsImplProject : ConfigNodePropertyString;
    ComAdobeCqScreensAnalyticsImplEnvironment : ConfigNodePropertyDropDown;
    ComAdobeCqScreensAnalyticsImplSendFrequency : ConfigNodePropertyInteger;
  }
  //#endregion
