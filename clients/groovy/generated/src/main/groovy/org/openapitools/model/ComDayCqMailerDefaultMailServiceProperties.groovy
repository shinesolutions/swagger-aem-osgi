package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqMailerDefaultMailServiceProperties {
    ConfigNodePropertyString smtpHost = null

    ConfigNodePropertyInteger smtpPort = null

    ConfigNodePropertyString smtpUser = null

    ConfigNodePropertyString smtpPassword = null

    ConfigNodePropertyString fromAddress = null

    ConfigNodePropertyBoolean smtpSsl = null

    ConfigNodePropertyBoolean smtpStarttls = null

    ConfigNodePropertyBoolean debugEmail = null

}
