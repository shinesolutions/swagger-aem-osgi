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
    
    ConfigNodePropertyString jmxObjectname
    
    ConfigNodePropertyBoolean propertyMeasureEnabled
    
    ConfigNodePropertyString propertyName
    
    ConfigNodePropertyInteger propertyMaxWaitMs
    
    ConfigNodePropertyFloat propertyMaxRate
    
    ConfigNodePropertyBoolean fulltextMeasureEnabled
    
    ConfigNodePropertyString fulltextName
    
    ConfigNodePropertyInteger fulltextMaxWaitMs
    
    ConfigNodePropertyFloat fulltextMaxRate
}
