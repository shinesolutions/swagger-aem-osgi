package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqPollingImporterImplManagedPollConfigImplProperties {
    ConfigNodePropertyString id = null

    ConfigNodePropertyBoolean enabled = null

    ConfigNodePropertyBoolean reference = null

    ConfigNodePropertyInteger interval = null

    ConfigNodePropertyString expression = null

    ConfigNodePropertyString source = null

    ConfigNodePropertyString target = null

    ConfigNodePropertyString login = null

    ConfigNodePropertyString password = null

}
