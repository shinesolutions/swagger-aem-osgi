package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingEngineImplSlingMainServletProperties {
    
    ConfigNodePropertyInteger slingMaxCalls
    
    ConfigNodePropertyInteger slingMaxInclusions
    
    ConfigNodePropertyBoolean slingTraceAllow
    
    ConfigNodePropertyInteger slingMaxRecordRequests
    
    ConfigNodePropertyArray slingStorePatternRequests
    
    ConfigNodePropertyString slingServerinfo
    
    ConfigNodePropertyArray slingAdditionalResponseHeaders
}
