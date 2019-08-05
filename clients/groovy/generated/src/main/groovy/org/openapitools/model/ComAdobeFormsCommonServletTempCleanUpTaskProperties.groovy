package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeFormsCommonServletTempCleanUpTaskProperties {
    ConfigNodePropertyString schedulerExpression = null

    ConfigNodePropertyString durationForTemporaryStorage = null

    ConfigNodePropertyString durationForAnonymousStorage = null

}
