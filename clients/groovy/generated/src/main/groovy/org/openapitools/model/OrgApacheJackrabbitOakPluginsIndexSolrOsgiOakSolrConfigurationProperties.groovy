package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties {
    ConfigNodePropertyString pathDescField = null

    ConfigNodePropertyString pathChildField = null

    ConfigNodePropertyString pathParentField = null

    ConfigNodePropertyString pathExactField = null

    ConfigNodePropertyString catchAllField = null

    ConfigNodePropertyString collapsedPathField = null

    ConfigNodePropertyString pathDepthField = null

    ConfigNodePropertyDropDown commitPolicy = null

    ConfigNodePropertyInteger rows = null

    ConfigNodePropertyBoolean pathRestrictions = null

    ConfigNodePropertyBoolean propertyRestrictions = null

    ConfigNodePropertyBoolean primarytypesRestrictions = null

    ConfigNodePropertyArray ignoredProperties = null

    ConfigNodePropertyArray usedProperties = null

    ConfigNodePropertyArray typeMappings = null

    ConfigNodePropertyArray propertyMappings = null

    ConfigNodePropertyBoolean collapseJcrcontentNodes = null

}
