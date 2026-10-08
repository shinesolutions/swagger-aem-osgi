package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComDayCqWcmCoreImplVersionManagerImplProperties {
    
    ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation
    
    ConfigNodePropertyBoolean versionmanagerPurgingEnabled
    
    ConfigNodePropertyArray versionmanagerPurgePaths
    
    ConfigNodePropertyArray versionmanagerIvPaths
    
    ConfigNodePropertyInteger versionmanagerMaxAgeDays
    
    ConfigNodePropertyInteger versionmanagerMaxNumberVersions
    
    ConfigNodePropertyInteger versionmanagerMinNumberVersions
}
