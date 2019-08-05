package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties {
    ConfigNodePropertyInteger indexingCriticalThreshold = null

    ConfigNodePropertyInteger indexingWarnThreshold = null

    ConfigNodePropertyArray hcTags = null

}
