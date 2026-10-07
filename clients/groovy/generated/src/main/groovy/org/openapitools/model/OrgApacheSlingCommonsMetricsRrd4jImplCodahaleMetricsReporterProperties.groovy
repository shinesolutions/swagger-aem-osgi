package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties {
    
    ConfigNodePropertyArray datasources
    
    ConfigNodePropertyInteger step
    
    ConfigNodePropertyArray archives
    
    ConfigNodePropertyString path
}
