package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ConfigNodePropertyInteger {
    /* property name */
    String name = null

    /* True if optional */
    Boolean optional = null

    /* True if property is set */
    Boolean isSet = null

    /* Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String) */
    Integer type = null

    /* Property value */
    Integer value = null

    /* Property description */
    String description = null

}
