package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties {
    
    ConfigNodePropertyString providerName
    
    ConfigNodePropertyString hostName
    
    ConfigNodePropertyInteger hostPort
    
    ConfigNodePropertyBoolean hostSsl
    
    ConfigNodePropertyBoolean hostTls
    
    ConfigNodePropertyBoolean hostNoCertCheck
    
    ConfigNodePropertyString bindDn
    
    ConfigNodePropertyString bindPassword
    
    ConfigNodePropertyString searchTimeout
    
    ConfigNodePropertyInteger adminPoolMaxActive
    
    ConfigNodePropertyBoolean adminPoolLookupOnValidate
    
    ConfigNodePropertyInteger userPoolMaxActive
    
    ConfigNodePropertyBoolean userPoolLookupOnValidate
    
    ConfigNodePropertyString userBaseDN
    
    ConfigNodePropertyArray userObjectclass
    
    ConfigNodePropertyString userIdAttribute
    
    ConfigNodePropertyString userExtraFilter
    
    ConfigNodePropertyBoolean userMakeDnPath
    
    ConfigNodePropertyString groupBaseDN
    
    ConfigNodePropertyArray groupObjectclass
    
    ConfigNodePropertyString groupNameAttribute
    
    ConfigNodePropertyString groupExtraFilter
    
    ConfigNodePropertyBoolean groupMakeDnPath
    
    ConfigNodePropertyString groupMemberAttribute
    
    ConfigNodePropertyBoolean useUidForExtId
    
    ConfigNodePropertyArray customattributes
}
