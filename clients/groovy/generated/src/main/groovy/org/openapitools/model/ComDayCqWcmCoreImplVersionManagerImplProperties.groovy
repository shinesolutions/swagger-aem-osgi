package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComDayCqWcmCoreImplVersionManagerImplProperties {
    ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation = null

    ConfigNodePropertyBoolean versionmanagerPurgingEnabled = null

    ConfigNodePropertyArray versionmanagerPurgePaths = null

    ConfigNodePropertyArray versionmanagerIvPaths = null

    ConfigNodePropertyInteger versionmanagerMaxAgeDays = null

    ConfigNodePropertyInteger versionmanagerMaxNumberVersions = null

    ConfigNodePropertyInteger versionmanagerMinNumberVersions = null

}
