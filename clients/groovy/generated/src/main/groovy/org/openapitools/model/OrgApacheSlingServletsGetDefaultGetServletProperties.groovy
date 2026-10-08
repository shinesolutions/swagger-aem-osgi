package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class OrgApacheSlingServletsGetDefaultGetServletProperties {
    
    ConfigNodePropertyArray aliases
    
    ConfigNodePropertyBoolean index
    
    ConfigNodePropertyArray indexFiles
    
    ConfigNodePropertyBoolean enableHtml
    
    ConfigNodePropertyBoolean enableJson
    
    ConfigNodePropertyBoolean enableTxt
    
    ConfigNodePropertyBoolean enableXml
    
    ConfigNodePropertyInteger jsonMaximumresults
    
    ConfigNodePropertyBoolean ecmaSuport
}
