namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqAuditPurgePagesProperties =

  //#region ComAdobeCqAuditPurgePagesProperties


  type comAdobeCqAuditPurgePagesProperties = {
    AuditlogRuleName : ConfigNodePropertyString;
    AuditlogRuleContentpath : ConfigNodePropertyString;
    AuditlogRuleMinimumage : ConfigNodePropertyInteger;
    AuditlogRuleTypes : ConfigNodePropertyDropDown;
  }
  //#endregion
