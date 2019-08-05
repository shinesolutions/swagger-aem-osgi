package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties {
    ConfigNodePropertyString fromAddress = null

    ConfigNodePropertyString hostPrefix = null

    ConfigNodePropertyBoolean notifyOnabort = null

    ConfigNodePropertyBoolean notifyOncomplete = null

    ConfigNodePropertyBoolean notifyOncontainercomplete = null

    ConfigNodePropertyBoolean notifyUseronly = null

}
