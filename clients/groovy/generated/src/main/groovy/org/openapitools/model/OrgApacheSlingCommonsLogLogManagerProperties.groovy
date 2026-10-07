package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingCommonsLogLogManagerProperties {
    
    ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel
    
    ConfigNodePropertyString orgApacheSlingCommonsLogFile
    
    ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber
    
    ConfigNodePropertyString orgApacheSlingCommonsLogFileSize
    
    ConfigNodePropertyString orgApacheSlingCommonsLogPattern
    
    ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile
    
    ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled
    
    ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth
    
    ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump
    
    ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines
}
