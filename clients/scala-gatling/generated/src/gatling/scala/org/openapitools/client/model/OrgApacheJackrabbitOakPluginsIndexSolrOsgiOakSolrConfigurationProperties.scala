
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties (
    _pathDescField: Option[ConfigNodePropertyString],
    _pathChildField: Option[ConfigNodePropertyString],
    _pathParentField: Option[ConfigNodePropertyString],
    _pathExactField: Option[ConfigNodePropertyString],
    _catchAllField: Option[ConfigNodePropertyString],
    _collapsedPathField: Option[ConfigNodePropertyString],
    _pathDepthField: Option[ConfigNodePropertyString],
    _commitPolicy: Option[ConfigNodePropertyDropDown],
    _rows: Option[ConfigNodePropertyInteger],
    _pathRestrictions: Option[ConfigNodePropertyBoolean],
    _propertyRestrictions: Option[ConfigNodePropertyBoolean],
    _primarytypesRestrictions: Option[ConfigNodePropertyBoolean],
    _ignoredProperties: Option[ConfigNodePropertyArray],
    _usedProperties: Option[ConfigNodePropertyArray],
    _typeMappings: Option[ConfigNodePropertyArray],
    _propertyMappings: Option[ConfigNodePropertyArray],
    _collapseJcrcontentNodes: Option[ConfigNodePropertyBoolean]
)
object OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties {
    def toStringBody(var_pathDescField: Object, var_pathChildField: Object, var_pathParentField: Object, var_pathExactField: Object, var_catchAllField: Object, var_collapsedPathField: Object, var_pathDepthField: Object, var_commitPolicy: Object, var_rows: Object, var_pathRestrictions: Object, var_propertyRestrictions: Object, var_primarytypesRestrictions: Object, var_ignoredProperties: Object, var_usedProperties: Object, var_typeMappings: Object, var_propertyMappings: Object, var_collapseJcrcontentNodes: Object) =
        s"""
        | {
        | "pathDescField":$var_pathDescField,"pathChildField":$var_pathChildField,"pathParentField":$var_pathParentField,"pathExactField":$var_pathExactField,"catchAllField":$var_catchAllField,"collapsedPathField":$var_collapsedPathField,"pathDepthField":$var_pathDepthField,"commitPolicy":$var_commitPolicy,"rows":$var_rows,"pathRestrictions":$var_pathRestrictions,"propertyRestrictions":$var_propertyRestrictions,"primarytypesRestrictions":$var_primarytypesRestrictions,"ignoredProperties":$var_ignoredProperties,"usedProperties":$var_usedProperties,"typeMappings":$var_typeMappings,"propertyMappings":$var_propertyMappings,"collapseJcrcontentNodes":$var_collapseJcrcontentNodes
        | }
        """.stripMargin
}
