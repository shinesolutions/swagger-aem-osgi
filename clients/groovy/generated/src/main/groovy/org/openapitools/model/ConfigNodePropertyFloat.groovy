package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class ConfigNodePropertyFloat {
    /* property name */
    String name = null

    /* True if optional */
    Boolean optional = null

    /* True if property is set */
    Boolean isSet = null

    /* Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String) */
    Integer type = null

    /* Property value */
    BigDecimal value = null

    /* Property description */
    String description = null

}
