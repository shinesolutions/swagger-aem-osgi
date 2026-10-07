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
class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties {
    
    ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist
    
    ConfigNodePropertyDropDown mode
    
    ConfigNodePropertyInteger port
    
    ConfigNodePropertyString primaryHost
    
    ConfigNodePropertyInteger interval
    
    ConfigNodePropertyArray primaryAllowedClientIpRanges
    
    ConfigNodePropertyBoolean secure
    
    ConfigNodePropertyInteger standbyReadtimeout
    
    ConfigNodePropertyBoolean standbyAutoclean
}
