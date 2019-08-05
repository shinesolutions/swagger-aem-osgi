package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties {
    ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased = null

    ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule = null

    ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule = null

    ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient = null

}
