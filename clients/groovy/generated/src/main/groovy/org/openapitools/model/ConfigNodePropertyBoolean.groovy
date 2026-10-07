package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ConfigNodePropertyBoolean {
    /* property name */
    String name
    /* True if optional */
    Boolean optional
    /* True if property is set */
    Boolean isSet
    /* Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String) */
    Integer type
    /* Property value */
    Boolean value
    /* Property description */
    String description
}
