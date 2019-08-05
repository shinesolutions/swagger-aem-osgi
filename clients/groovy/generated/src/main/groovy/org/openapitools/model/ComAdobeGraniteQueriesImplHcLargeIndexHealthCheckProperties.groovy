package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties {
    ConfigNodePropertyInteger largeIndexCriticalThreshold = null

    ConfigNodePropertyInteger largeIndexWarnThreshold = null

    ConfigNodePropertyArray hcTags = null

}
