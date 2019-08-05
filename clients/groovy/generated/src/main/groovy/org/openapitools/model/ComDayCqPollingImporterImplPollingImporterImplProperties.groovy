package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqPollingImporterImplPollingImporterImplProperties {
    ConfigNodePropertyInteger importerMinInterval = null

    ConfigNodePropertyString importerUser = null

    ConfigNodePropertyArray excludePaths = null

    ConfigNodePropertyArray includePaths = null

}
