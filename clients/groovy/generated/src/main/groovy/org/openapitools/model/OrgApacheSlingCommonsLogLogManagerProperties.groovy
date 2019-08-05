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
    ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel = null

    ConfigNodePropertyString orgApacheSlingCommonsLogFile = null

    ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber = null

    ConfigNodePropertyString orgApacheSlingCommonsLogFileSize = null

    ConfigNodePropertyString orgApacheSlingCommonsLogPattern = null

    ConfigNodePropertyString orgApacheSlingCommonsLogConfigurationFile = null

    ConfigNodePropertyBoolean orgApacheSlingCommonsLogPackagingDataEnabled = null

    ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxCallerDataDepth = null

    ConfigNodePropertyInteger orgApacheSlingCommonsLogMaxOldFileCountInDump = null

    ConfigNodePropertyInteger orgApacheSlingCommonsLogNumOfLines = null

}
