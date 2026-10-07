package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingDiscoveryOakConfigProperties {
    
    ConfigNodePropertyInteger connectorPingTimeout
    
    ConfigNodePropertyInteger connectorPingInterval
    
    ConfigNodePropertyInteger discoveryLiteCheckInterval
    
    ConfigNodePropertyInteger clusterSyncServiceTimeout
    
    ConfigNodePropertyInteger clusterSyncServiceInterval
    
    ConfigNodePropertyBoolean enableSyncToken
    
    ConfigNodePropertyInteger minEventDelay
    
    ConfigNodePropertyInteger socketConnectTimeout
    
    ConfigNodePropertyInteger soTimeout
    
    ConfigNodePropertyArray topologyConnectorUrls
    
    ConfigNodePropertyArray topologyConnectorWhitelist
    
    ConfigNodePropertyBoolean autoStopLocalLoopEnabled
    
    ConfigNodePropertyBoolean gzipConnectorRequestsEnabled
    
    ConfigNodePropertyBoolean hmacEnabled
    
    ConfigNodePropertyBoolean enableEncryption
    
    ConfigNodePropertyString sharedKey
    
    ConfigNodePropertyInteger hmacSharedKeyTTL
    
    ConfigNodePropertyString backoffStandbyFactor
    
    ConfigNodePropertyString backoffStableFactor
}
