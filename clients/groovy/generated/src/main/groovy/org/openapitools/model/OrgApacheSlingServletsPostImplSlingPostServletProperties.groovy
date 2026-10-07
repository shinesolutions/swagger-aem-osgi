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
    
    ConfigNodePropertyArray servletPostDateFormats
    
    ConfigNodePropertyArray servletPostNodeNameHints
    
    ConfigNodePropertyInteger servletPostNodeNameMaxLength
    
    ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes
    
    ConfigNodePropertyBoolean servletPostAutoCheckout
    
    ConfigNodePropertyBoolean servletPostAutoCheckin
    
    ConfigNodePropertyString servletPostIgnorePattern
}
