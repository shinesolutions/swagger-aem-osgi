package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComDayCqWcmCoreImplVersionPurgeTaskProperties {
    ConfigNodePropertyArray versionpurgePaths = null

    ConfigNodePropertyBoolean versionpurgeRecursive = null

    ConfigNodePropertyInteger versionpurgeMaxVersions = null

    ConfigNodePropertyInteger versionpurgeMinVersions = null

    ConfigNodePropertyInteger versionpurgeMaxAgeDays = null

}
