package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDownType;

@Canonical
class ConfigNodePropertyDropDown {
    /* property name */
    String name = null

    /* True if optional */
    Boolean optional = null

    /* True if property is set */
    Boolean isSet = null

    ConfigNodePropertyDropDownType type = null

    /* Property value */
    Object value = null

    /* Property description */
    String description = null

}
