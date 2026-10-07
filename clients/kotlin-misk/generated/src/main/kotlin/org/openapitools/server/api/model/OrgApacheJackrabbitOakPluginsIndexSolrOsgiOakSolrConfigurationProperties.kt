package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties(
    val pathDescField: ConfigNodePropertyString? = null,
    val pathChildField: ConfigNodePropertyString? = null,
    val pathParentField: ConfigNodePropertyString? = null,
    val pathExactField: ConfigNodePropertyString? = null,
    val catchAllField: ConfigNodePropertyString? = null,
    val collapsedPathField: ConfigNodePropertyString? = null,
    val pathDepthField: ConfigNodePropertyString? = null,
    val commitPolicy: ConfigNodePropertyDropDown? = null,
    val rows: ConfigNodePropertyInteger? = null,
    val pathRestrictions: ConfigNodePropertyBoolean? = null,
    val propertyRestrictions: ConfigNodePropertyBoolean? = null,
    val primarytypesRestrictions: ConfigNodePropertyBoolean? = null,
    val ignoredProperties: ConfigNodePropertyArray? = null,
    val usedProperties: ConfigNodePropertyArray? = null,
    val typeMappings: ConfigNodePropertyArray? = null,
    val propertyMappings: ConfigNodePropertyArray? = null,
    val collapseJcrcontentNodes: ConfigNodePropertyBoolean? = null
)
