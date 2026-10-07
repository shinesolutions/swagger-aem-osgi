package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheFelixJaasConfigurationFactoryProperties {
    
    ConfigNodePropertyDropDown jaasControlFlag
    
    ConfigNodePropertyInteger jaasRanking
    
    ConfigNodePropertyString jaasRealmName
    
    ConfigNodePropertyString jaasClassname
    
    ConfigNodePropertyArray jaasOptions
}
