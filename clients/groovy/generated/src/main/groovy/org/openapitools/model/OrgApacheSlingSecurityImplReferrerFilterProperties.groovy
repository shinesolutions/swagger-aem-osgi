package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

@Canonical
class OrgApacheSlingSecurityImplReferrerFilterProperties {
    ConfigNodePropertyBoolean allowEmpty = null

    ConfigNodePropertyArray allowHosts = null

    ConfigNodePropertyArray allowHostsRegexp = null

    ConfigNodePropertyArray filterMethods = null

    ConfigNodePropertyArray excludeAgentsRegexp = null

}
