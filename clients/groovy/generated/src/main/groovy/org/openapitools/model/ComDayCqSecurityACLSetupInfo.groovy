package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComDayCqSecurityACLSetupProperties;

@Canonical
class ComDayCqSecurityACLSetupInfo {
    String pid = null

    String title = null

    String description = null

    ComDayCqSecurityACLSetupProperties properties = null

    String bundleLocation = null

    String serviceLocation = null

}
