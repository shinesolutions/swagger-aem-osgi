package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties {
    ConfigNodePropertyString name = null

    ConfigNodePropertyInteger minPoolSize = null

    ConfigNodePropertyInteger maxPoolSize = null

    ConfigNodePropertyInteger queueSize = null

    ConfigNodePropertyInteger maxThreadAge = null

    ConfigNodePropertyInteger keepAliveTime = null

    ConfigNodePropertyDropDown blockPolicy = null

    ConfigNodePropertyBoolean shutdownGraceful = null

    ConfigNodePropertyBoolean daemon = null

    ConfigNodePropertyInteger shutdownWaitTime = null

    ConfigNodePropertyDropDown priority = null

}
