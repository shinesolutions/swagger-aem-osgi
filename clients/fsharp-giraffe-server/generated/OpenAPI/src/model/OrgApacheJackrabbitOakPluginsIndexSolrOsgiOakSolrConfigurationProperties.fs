namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties =

  //#region OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties


  type orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties = {
    PathDescField : ConfigNodePropertyString;
    PathChildField : ConfigNodePropertyString;
    PathParentField : ConfigNodePropertyString;
    PathExactField : ConfigNodePropertyString;
    CatchAllField : ConfigNodePropertyString;
    CollapsedPathField : ConfigNodePropertyString;
    PathDepthField : ConfigNodePropertyString;
    CommitPolicy : ConfigNodePropertyDropDown;
    Rows : ConfigNodePropertyInteger;
    PathRestrictions : ConfigNodePropertyBoolean;
    PropertyRestrictions : ConfigNodePropertyBoolean;
    PrimarytypesRestrictions : ConfigNodePropertyBoolean;
    IgnoredProperties : ConfigNodePropertyArray;
    UsedProperties : ConfigNodePropertyArray;
    TypeMappings : ConfigNodePropertyArray;
    PropertyMappings : ConfigNodePropertyArray;
    CollapseJcrcontentNodes : ConfigNodePropertyBoolean;
  }
  //#endregion
