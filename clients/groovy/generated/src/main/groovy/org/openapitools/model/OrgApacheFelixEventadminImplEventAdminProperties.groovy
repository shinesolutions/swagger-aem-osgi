package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class OrgApacheFelixEventadminImplEventAdminProperties {
    
    ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize
    
    ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio
    
    ConfigNodePropertyInteger orgApacheFelixEventadminTimeout
    
    ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic
    
    ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout
    
    ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic
}
