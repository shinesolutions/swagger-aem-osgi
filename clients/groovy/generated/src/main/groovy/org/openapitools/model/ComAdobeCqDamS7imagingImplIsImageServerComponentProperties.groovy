package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties {
    ConfigNodePropertyString tcpPort = null

    ConfigNodePropertyBoolean allowRemoteAccess = null

    ConfigNodePropertyString maxRenderRgnPixels = null

    ConfigNodePropertyString maxMessageSize = null

    ConfigNodePropertyInteger randomAccessUrlTimeout = null

    ConfigNodePropertyInteger workerThreads = null

}
