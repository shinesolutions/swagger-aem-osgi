package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties {
    ConfigNodePropertyString managerRoot = null

    ConfigNodePropertyString httpServiceFilter = null

    ConfigNodePropertyString defaultRender = null

    ConfigNodePropertyString realm = null

    ConfigNodePropertyString username = null

    ConfigNodePropertyString password = null

    ConfigNodePropertyString category = null

    ConfigNodePropertyString locale = null

    ConfigNodePropertyDropDown loglevel = null

    ConfigNodePropertyDropDown plugins = null

}
