namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialCalendarServletsTimeZoneServletProperties

module ComAdobeCqSocialCalendarServletsTimeZoneServletInfo =

  //#region ComAdobeCqSocialCalendarServletsTimeZoneServletInfo

  [<CLIMutable>]
  type ComAdobeCqSocialCalendarServletsTimeZoneServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialCalendarServletsTimeZoneServletProperties;
  }

  //#endregion
