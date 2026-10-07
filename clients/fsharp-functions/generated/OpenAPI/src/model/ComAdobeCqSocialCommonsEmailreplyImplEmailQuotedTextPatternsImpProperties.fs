namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties =

  //#region ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties = {
    [<JsonProperty(PropertyName = "pattern.time")>]
    PatternTime : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "pattern.newline")>]
    PatternNewline : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "pattern.dayOfMonth")>]
    PatternDayOfMonth : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "pattern.month")>]
    PatternMonth : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "pattern.year")>]
    PatternYear : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "pattern.date")>]
    PatternDate : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "pattern.dateTime")>]
    PatternDateTime : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "pattern.email")>]
    PatternEmail : ConfigNodePropertyString;
  }

  //#endregion
