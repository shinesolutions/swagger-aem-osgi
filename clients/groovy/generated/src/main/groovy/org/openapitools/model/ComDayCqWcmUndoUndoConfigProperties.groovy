package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqWcmUndoUndoConfigProperties {
    ConfigNodePropertyBoolean cqWcmUndoEnabled = null

    ConfigNodePropertyString cqWcmUndoPath = null

    ConfigNodePropertyInteger cqWcmUndoValidity = null

    ConfigNodePropertyInteger cqWcmUndoSteps = null

    ConfigNodePropertyString cqWcmUndoPersistence = null

    ConfigNodePropertyBoolean cqWcmUndoPersistenceMode = null

    ConfigNodePropertyString cqWcmUndoMarkermode = null

    ConfigNodePropertyArray cqWcmUndoWhitelist = null

    ConfigNodePropertyArray cqWcmUndoBlacklist = null

}
