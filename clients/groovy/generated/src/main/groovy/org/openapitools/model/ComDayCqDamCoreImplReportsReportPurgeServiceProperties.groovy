package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqDamCoreImplReportsReportPurgeServiceProperties {
    ConfigNodePropertyString schedulerExpression = null

    ConfigNodePropertyInteger maxSavedReports = null

    ConfigNodePropertyInteger timeDuration = null

    ConfigNodePropertyBoolean enableReportPurge = null

}
