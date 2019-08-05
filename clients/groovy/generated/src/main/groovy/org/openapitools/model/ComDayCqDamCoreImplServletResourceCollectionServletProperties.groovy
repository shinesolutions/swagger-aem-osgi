package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqDamCoreImplServletResourceCollectionServletProperties {
    ConfigNodePropertyArray slingServletResourceTypes = null

    ConfigNodePropertyString slingServletMethods = null

    ConfigNodePropertyString slingServletSelectors = null

    ConfigNodePropertyString downloadConfig = null

    ConfigNodePropertyString viewSelector = null

    ConfigNodePropertyBoolean sendEmail = null

}
