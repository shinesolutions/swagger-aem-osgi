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
    
    ConfigNodePropertyString pathDescField
    
    ConfigNodePropertyString pathChildField
    
    ConfigNodePropertyString pathParentField
    
    ConfigNodePropertyString pathExactField
    
    ConfigNodePropertyString catchAllField
    
    ConfigNodePropertyString collapsedPathField
    
    ConfigNodePropertyString pathDepthField
    
    ConfigNodePropertyDropDown commitPolicy
    
    ConfigNodePropertyInteger rows
    
    ConfigNodePropertyBoolean pathRestrictions
    
    ConfigNodePropertyBoolean propertyRestrictions
    
    ConfigNodePropertyBoolean primarytypesRestrictions
    
    ConfigNodePropertyArray ignoredProperties
    
    ConfigNodePropertyArray usedProperties
    
    ConfigNodePropertyArray typeMappings
    
    ConfigNodePropertyArray propertyMappings
    
    ConfigNodePropertyBoolean collapseJcrcontentNodes
}
