package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqMailerDefaultMailServiceProperties {
    
    ConfigNodePropertyString smtpHost
    
    ConfigNodePropertyInteger smtpPort
    
    ConfigNodePropertyString smtpUser
    
    ConfigNodePropertyString smtpPassword
    
    ConfigNodePropertyString fromAddress
    
    ConfigNodePropertyBoolean smtpSsl
    
    ConfigNodePropertyBoolean smtpStarttls
    
    ConfigNodePropertyBoolean debugEmail
}
