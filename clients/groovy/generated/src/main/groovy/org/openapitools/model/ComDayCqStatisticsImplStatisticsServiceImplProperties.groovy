package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqStatisticsImplStatisticsServiceImplProperties {
    ConfigNodePropertyInteger schedulerPeriod = null

    ConfigNodePropertyBoolean schedulerConcurrent = null

    ConfigNodePropertyString path = null

    ConfigNodePropertyString workspace = null

    ConfigNodePropertyString keywordsPath = null

    ConfigNodePropertyBoolean asyncEntries = null

}
