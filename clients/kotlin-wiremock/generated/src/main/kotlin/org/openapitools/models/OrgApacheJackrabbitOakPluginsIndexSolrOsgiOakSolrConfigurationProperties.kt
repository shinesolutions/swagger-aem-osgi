@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties(
    @field:JsonProperty("path.desc.field")
    val pathDescField: ConfigNodePropertyString? = null,

    @field:JsonProperty("path.child.field")
    val pathChildField: ConfigNodePropertyString? = null,

    @field:JsonProperty("path.parent.field")
    val pathParentField: ConfigNodePropertyString? = null,

    @field:JsonProperty("path.exact.field")
    val pathExactField: ConfigNodePropertyString? = null,

    @field:JsonProperty("catch.all.field")
    val catchAllField: ConfigNodePropertyString? = null,

    @field:JsonProperty("collapsed.path.field")
    val collapsedPathField: ConfigNodePropertyString? = null,

    @field:JsonProperty("path.depth.field")
    val pathDepthField: ConfigNodePropertyString? = null,

    @field:JsonProperty("commit.policy")
    val commitPolicy: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("rows")
    val rows: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("path.restrictions")
    val pathRestrictions: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("property.restrictions")
    val propertyRestrictions: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("primarytypes.restrictions")
    val primarytypesRestrictions: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("ignored.properties")
    val ignoredProperties: ConfigNodePropertyArray? = null,

    @field:JsonProperty("used.properties")
    val usedProperties: ConfigNodePropertyArray? = null,

    @field:JsonProperty("type.mappings")
    val typeMappings: ConfigNodePropertyArray? = null,

    @field:JsonProperty("property.mappings")
    val propertyMappings: ConfigNodePropertyArray? = null,

    @field:JsonProperty("collapse.jcrcontent.nodes")
    val collapseJcrcontentNodes: ConfigNodePropertyBoolean? = null,

)
