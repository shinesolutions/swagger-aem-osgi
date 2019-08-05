package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties {
    ConfigNodePropertyBoolean preserveHierarchyNodes = null

    ConfigNodePropertyBoolean ignoreVersioning = null

    ConfigNodePropertyBoolean importAcl = null

    ConfigNodePropertyInteger saveThreshold = null

    ConfigNodePropertyBoolean preserveUserPaths = null

    ConfigNodePropertyBoolean preserveUuid = null

    ConfigNodePropertyArray preserveUuidNodetypes = null

    ConfigNodePropertyArray preserveUuidSubtrees = null

    ConfigNodePropertyBoolean autoCommit = null

}
