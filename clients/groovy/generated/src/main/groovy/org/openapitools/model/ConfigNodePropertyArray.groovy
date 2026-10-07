package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class ConfigNodePropertyArray {
    /* property name */
    String name
    /* True if optional */
    Boolean optional
    /* True if property is set */
    Boolean isSet
    /* Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String) */
    Integer type
    /* Property value */
    List<String> values = new ArrayList<>()
    /* Property description */
    String description
}
