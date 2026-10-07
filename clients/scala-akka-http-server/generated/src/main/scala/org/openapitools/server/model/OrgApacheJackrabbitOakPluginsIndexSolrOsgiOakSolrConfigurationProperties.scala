package org.openapitools.server.model


/**
 * @param pathDescField  for example: ''null''
 * @param pathChildField  for example: ''null''
 * @param pathParentField  for example: ''null''
 * @param pathExactField  for example: ''null''
 * @param catchAllField  for example: ''null''
 * @param collapsedPathField  for example: ''null''
 * @param pathDepthField  for example: ''null''
 * @param commitPolicy  for example: ''null''
 * @param rows  for example: ''null''
 * @param pathRestrictions  for example: ''null''
 * @param propertyRestrictions  for example: ''null''
 * @param primarytypesRestrictions  for example: ''null''
 * @param ignoredProperties  for example: ''null''
 * @param usedProperties  for example: ''null''
 * @param typeMappings  for example: ''null''
 * @param propertyMappings  for example: ''null''
 * @param collapseJcrcontentNodes  for example: ''null''
*/
final case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties (
  pathDescField: Option[ConfigNodePropertyString] = None,
  pathChildField: Option[ConfigNodePropertyString] = None,
  pathParentField: Option[ConfigNodePropertyString] = None,
  pathExactField: Option[ConfigNodePropertyString] = None,
  catchAllField: Option[ConfigNodePropertyString] = None,
  collapsedPathField: Option[ConfigNodePropertyString] = None,
  pathDepthField: Option[ConfigNodePropertyString] = None,
  commitPolicy: Option[ConfigNodePropertyDropDown] = None,
  rows: Option[ConfigNodePropertyInteger] = None,
  pathRestrictions: Option[ConfigNodePropertyBoolean] = None,
  propertyRestrictions: Option[ConfigNodePropertyBoolean] = None,
  primarytypesRestrictions: Option[ConfigNodePropertyBoolean] = None,
  ignoredProperties: Option[ConfigNodePropertyArray] = None,
  usedProperties: Option[ConfigNodePropertyArray] = None,
  typeMappings: Option[ConfigNodePropertyArray] = None,
  propertyMappings: Option[ConfigNodePropertyArray] = None,
  collapseJcrcontentNodes: Option[ConfigNodePropertyBoolean] = None
)

