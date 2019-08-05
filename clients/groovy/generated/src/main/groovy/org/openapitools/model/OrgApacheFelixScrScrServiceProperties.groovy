package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class OrgApacheFelixScrScrServiceProperties {
    ConfigNodePropertyDropDown dsLoglevel = null

    ConfigNodePropertyBoolean dsFactoryEnabled = null

    ConfigNodePropertyBoolean dsDelayedKeepInstances = null

    ConfigNodePropertyInteger dsLockTimeoutMilliseconds = null

    ConfigNodePropertyInteger dsStopTimeoutMilliseconds = null

    ConfigNodePropertyBoolean dsGlobalExtender = null

}
