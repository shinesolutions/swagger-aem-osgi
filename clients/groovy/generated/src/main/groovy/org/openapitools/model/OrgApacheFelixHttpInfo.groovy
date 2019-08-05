package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrgApacheFelixHttpProperties;

@Canonical
class OrgApacheFelixHttpInfo {
    String pid = null

    String title = null

    String description = null

    OrgApacheFelixHttpProperties properties = null

    String bundleLocation = null

    String serviceLocation = null

}
