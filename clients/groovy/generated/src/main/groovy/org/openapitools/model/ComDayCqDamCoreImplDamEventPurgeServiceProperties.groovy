package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqDamCoreImplDamEventPurgeServiceProperties {
    ConfigNodePropertyString schedulerExpression = null

    ConfigNodePropertyInteger maxSavedActivities = null

    ConfigNodePropertyInteger saveInterval = null

    ConfigNodePropertyBoolean enableActivityPurge = null

    ConfigNodePropertyDropDown eventTypes = null

}
