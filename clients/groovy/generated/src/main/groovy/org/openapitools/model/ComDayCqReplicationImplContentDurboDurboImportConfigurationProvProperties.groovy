package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties {
    
    ConfigNodePropertyBoolean preserveHierarchyNodes
    
    ConfigNodePropertyBoolean ignoreVersioning
    
    ConfigNodePropertyBoolean importAcl
    
    ConfigNodePropertyInteger saveThreshold
    
    ConfigNodePropertyBoolean preserveUserPaths
    
    ConfigNodePropertyBoolean preserveUuid
    
    ConfigNodePropertyArray preserveUuidNodetypes
    
    ConfigNodePropertyArray preserveUuidSubtrees
    
    ConfigNodePropertyBoolean autoCommit
}
