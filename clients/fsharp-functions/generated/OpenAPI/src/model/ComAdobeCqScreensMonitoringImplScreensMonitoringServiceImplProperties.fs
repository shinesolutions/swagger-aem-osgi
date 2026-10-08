namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties =

  //#region ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties

  [<CLIMutable>]
  type ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties = {
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath")>]
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency")>]
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout")>]
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients")>]
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver")>]
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport")>]
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls")>]
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username")>]
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password")>]
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword : ConfigNodePropertyString;
  }

  //#endregion
