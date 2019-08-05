package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingServletsPostImplSlingPostServletProperties {
    ConfigNodePropertyArray servletPostDateFormats = null

    ConfigNodePropertyArray servletPostNodeNameHints = null

    ConfigNodePropertyInteger servletPostNodeNameMaxLength = null

    ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes = null

    ConfigNodePropertyBoolean servletPostAutoCheckout = null

    ConfigNodePropertyBoolean servletPostAutoCheckin = null

    ConfigNodePropertyString servletPostIgnorePattern = null

}
