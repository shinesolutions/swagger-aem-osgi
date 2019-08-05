package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties {
    ConfigNodePropertyString eventTopics = null

    ConfigNodePropertyString eventFilter = null

    ConfigNodePropertyArray translateListenerType = null

    ConfigNodePropertyArray translatePropertyList = null

    ConfigNodePropertyInteger poolSize = null

    ConfigNodePropertyInteger maxPoolSize = null

    ConfigNodePropertyInteger queueSize = null

    ConfigNodePropertyInteger keepAliveTime = null

}
