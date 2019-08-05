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
class ComDayCqDamCoreImplDamEventRecorderImplProperties {
    ConfigNodePropertyString eventFilter = null

    ConfigNodePropertyInteger eventQueueLength = null

    ConfigNodePropertyBoolean eventrecorderEnabled = null

    ConfigNodePropertyArray eventrecorderBlacklist = null

    ConfigNodePropertyDropDown eventrecorderEventtypes = null

}
