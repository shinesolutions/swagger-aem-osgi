package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties {
    ConfigNodePropertyString linkExpiredPrefix = null

    ConfigNodePropertyBoolean linkExpiredRemove = null

    ConfigNodePropertyString linkExpiredSuffix = null

    ConfigNodePropertyString linkInvalidPrefix = null

    ConfigNodePropertyBoolean linkInvalidRemove = null

    ConfigNodePropertyString linkInvalidSuffix = null

    ConfigNodePropertyString linkPredatedPrefix = null

    ConfigNodePropertyBoolean linkPredatedRemove = null

    ConfigNodePropertyString linkPredatedSuffix = null

    ConfigNodePropertyArray linkWcmmodes = null

}
