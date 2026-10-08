package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConfigNodePropertyDropDownType;

@Canonical
class ConfigNodePropertyDropDown {
    /* property name */
    String name
    /* True if optional */
    Boolean optional
    /* True if property is set */
    Boolean isSet
    
    ConfigNodePropertyDropDownType type
    /* Property value */
    Object value = null
    /* Property description */
    String description
}
