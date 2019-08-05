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
    ConfigNodePropertyInteger slingMaxCalls = null

    ConfigNodePropertyInteger slingMaxInclusions = null

    ConfigNodePropertyBoolean slingTraceAllow = null

    ConfigNodePropertyInteger slingMaxRecordRequests = null

    ConfigNodePropertyArray slingStorePatternRequests = null

    ConfigNodePropertyString slingServerinfo = null

    ConfigNodePropertyArray slingAdditionalResponseHeaders = null

}
