package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqReportingImplConfigServiceImplProperties {
    
    ConfigNodePropertyString repconfTimezone
    
    ConfigNodePropertyString repconfLocale
    
    ConfigNodePropertyString repconfSnapshots
    
    ConfigNodePropertyString repconfRepdir
    
    ConfigNodePropertyInteger repconfHourofday
    
    ConfigNodePropertyInteger repconfMinofhour
    
    ConfigNodePropertyInteger repconfMaxrows
    
    ConfigNodePropertyBoolean repconfFakedata
    
    ConfigNodePropertyString repconfSnapshotuser
    
    ConfigNodePropertyBoolean repconfEnforcesnapshotuser
}
