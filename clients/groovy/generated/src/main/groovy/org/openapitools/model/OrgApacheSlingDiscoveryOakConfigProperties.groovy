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
    ConfigNodePropertyInteger connectorPingTimeout = null

    ConfigNodePropertyInteger connectorPingInterval = null

    ConfigNodePropertyInteger discoveryLiteCheckInterval = null

    ConfigNodePropertyInteger clusterSyncServiceTimeout = null

    ConfigNodePropertyInteger clusterSyncServiceInterval = null

    ConfigNodePropertyBoolean enableSyncToken = null

    ConfigNodePropertyInteger minEventDelay = null

    ConfigNodePropertyInteger socketConnectTimeout = null

    ConfigNodePropertyInteger soTimeout = null

    ConfigNodePropertyArray topologyConnectorUrls = null

    ConfigNodePropertyArray topologyConnectorWhitelist = null

    ConfigNodePropertyBoolean autoStopLocalLoopEnabled = null

    ConfigNodePropertyBoolean gzipConnectorRequestsEnabled = null

    ConfigNodePropertyBoolean hmacEnabled = null

    ConfigNodePropertyBoolean enableEncryption = null

    ConfigNodePropertyString sharedKey = null

    ConfigNodePropertyInteger hmacSharedKeyTTL = null

    ConfigNodePropertyString backoffStandbyFactor = null

    ConfigNodePropertyString backoffStableFactor = null

}
