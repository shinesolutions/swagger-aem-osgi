package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class OrgApacheSlingEventImplJobsDefaultJobManagerProperties {
    ConfigNodePropertyDropDown queuePriority = null

    ConfigNodePropertyInteger queueRetries = null

    ConfigNodePropertyInteger queueRetrydelay = null

    ConfigNodePropertyInteger queueMaxparallel = null

}
