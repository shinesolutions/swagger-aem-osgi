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
    ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist = null

    ConfigNodePropertyDropDown mode = null

    ConfigNodePropertyInteger port = null

    ConfigNodePropertyString primaryHost = null

    ConfigNodePropertyInteger interval = null

    ConfigNodePropertyArray primaryAllowedClientIpRanges = null

    ConfigNodePropertyBoolean secure = null

    ConfigNodePropertyInteger standbyReadtimeout = null

    ConfigNodePropertyBoolean standbyAutoclean = null

}
