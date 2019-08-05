package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties {
    ConfigNodePropertyString jmxObjectname = null

    ConfigNodePropertyBoolean propertyMeasureEnabled = null

    ConfigNodePropertyString propertyName = null

    ConfigNodePropertyInteger propertyMaxWaitMs = null

    ConfigNodePropertyFloat propertyMaxRate = null

    ConfigNodePropertyBoolean fulltextMeasureEnabled = null

    ConfigNodePropertyString fulltextName = null

    ConfigNodePropertyInteger fulltextMaxWaitMs = null

    ConfigNodePropertyFloat fulltextMaxRate = null

}
