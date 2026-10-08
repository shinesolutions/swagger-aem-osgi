package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

@Canonical
class OrgApacheSlingSecurityImplReferrerFilterProperties {
    
    ConfigNodePropertyBoolean allowEmpty
    
    ConfigNodePropertyArray allowHosts
    
    ConfigNodePropertyArray allowHostsRegexp
    
    ConfigNodePropertyArray filterMethods
    
    ConfigNodePropertyArray excludeAgentsRegexp
}
