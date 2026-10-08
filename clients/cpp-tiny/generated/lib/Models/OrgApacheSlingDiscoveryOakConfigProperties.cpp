

#include "OrgApacheSlingDiscoveryOakConfigProperties.h"

using namespace Tiny;

OrgApacheSlingDiscoveryOakConfigProperties::OrgApacheSlingDiscoveryOakConfigProperties()
{
	connectorPingTimeout = ConfigNodePropertyInteger();
	connectorPingInterval = ConfigNodePropertyInteger();
	discoveryLiteCheckInterval = ConfigNodePropertyInteger();
	clusterSyncServiceTimeout = ConfigNodePropertyInteger();
	clusterSyncServiceInterval = ConfigNodePropertyInteger();
	enableSyncToken = ConfigNodePropertyBoolean();
	minEventDelay = ConfigNodePropertyInteger();
	socketConnectTimeout = ConfigNodePropertyInteger();
	soTimeout = ConfigNodePropertyInteger();
	topologyConnectorUrls = ConfigNodePropertyArray();
	topologyConnectorWhitelist = ConfigNodePropertyArray();
	autoStopLocalLoopEnabled = ConfigNodePropertyBoolean();
	gzipConnectorRequestsEnabled = ConfigNodePropertyBoolean();
	hmacEnabled = ConfigNodePropertyBoolean();
	enableEncryption = ConfigNodePropertyBoolean();
	sharedKey = ConfigNodePropertyString();
	hmacSharedKeyTTL = ConfigNodePropertyInteger();
	backoffStandbyFactor = ConfigNodePropertyString();
	backoffStableFactor = ConfigNodePropertyString();
}

OrgApacheSlingDiscoveryOakConfigProperties::OrgApacheSlingDiscoveryOakConfigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDiscoveryOakConfigProperties::~OrgApacheSlingDiscoveryOakConfigProperties()
{

}

void
OrgApacheSlingDiscoveryOakConfigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *connectorPingTimeoutKey = "connectorPingTimeout";

    if(object.has_key(connectorPingTimeoutKey))
    {
        bourne::json value = object[connectorPingTimeoutKey];




        ConfigNodePropertyInteger* obj = &connectorPingTimeout;
		obj->fromJson(value.dump());

    }

    const char *connectorPingIntervalKey = "connectorPingInterval";

    if(object.has_key(connectorPingIntervalKey))
    {
        bourne::json value = object[connectorPingIntervalKey];




        ConfigNodePropertyInteger* obj = &connectorPingInterval;
		obj->fromJson(value.dump());

    }

    const char *discoveryLiteCheckIntervalKey = "discoveryLiteCheckInterval";

    if(object.has_key(discoveryLiteCheckIntervalKey))
    {
        bourne::json value = object[discoveryLiteCheckIntervalKey];




        ConfigNodePropertyInteger* obj = &discoveryLiteCheckInterval;
		obj->fromJson(value.dump());

    }

    const char *clusterSyncServiceTimeoutKey = "clusterSyncServiceTimeout";

    if(object.has_key(clusterSyncServiceTimeoutKey))
    {
        bourne::json value = object[clusterSyncServiceTimeoutKey];




        ConfigNodePropertyInteger* obj = &clusterSyncServiceTimeout;
		obj->fromJson(value.dump());

    }

    const char *clusterSyncServiceIntervalKey = "clusterSyncServiceInterval";

    if(object.has_key(clusterSyncServiceIntervalKey))
    {
        bourne::json value = object[clusterSyncServiceIntervalKey];




        ConfigNodePropertyInteger* obj = &clusterSyncServiceInterval;
		obj->fromJson(value.dump());

    }

    const char *enableSyncTokenKey = "enableSyncToken";

    if(object.has_key(enableSyncTokenKey))
    {
        bourne::json value = object[enableSyncTokenKey];




        ConfigNodePropertyBoolean* obj = &enableSyncToken;
		obj->fromJson(value.dump());

    }

    const char *minEventDelayKey = "minEventDelay";

    if(object.has_key(minEventDelayKey))
    {
        bourne::json value = object[minEventDelayKey];




        ConfigNodePropertyInteger* obj = &minEventDelay;
		obj->fromJson(value.dump());

    }

    const char *socketConnectTimeoutKey = "socketConnectTimeout";

    if(object.has_key(socketConnectTimeoutKey))
    {
        bourne::json value = object[socketConnectTimeoutKey];




        ConfigNodePropertyInteger* obj = &socketConnectTimeout;
		obj->fromJson(value.dump());

    }

    const char *soTimeoutKey = "soTimeout";

    if(object.has_key(soTimeoutKey))
    {
        bourne::json value = object[soTimeoutKey];




        ConfigNodePropertyInteger* obj = &soTimeout;
		obj->fromJson(value.dump());

    }

    const char *topologyConnectorUrlsKey = "topologyConnectorUrls";

    if(object.has_key(topologyConnectorUrlsKey))
    {
        bourne::json value = object[topologyConnectorUrlsKey];




        ConfigNodePropertyArray* obj = &topologyConnectorUrls;
		obj->fromJson(value.dump());

    }

    const char *topologyConnectorWhitelistKey = "topologyConnectorWhitelist";

    if(object.has_key(topologyConnectorWhitelistKey))
    {
        bourne::json value = object[topologyConnectorWhitelistKey];




        ConfigNodePropertyArray* obj = &topologyConnectorWhitelist;
		obj->fromJson(value.dump());

    }

    const char *autoStopLocalLoopEnabledKey = "autoStopLocalLoopEnabled";

    if(object.has_key(autoStopLocalLoopEnabledKey))
    {
        bourne::json value = object[autoStopLocalLoopEnabledKey];




        ConfigNodePropertyBoolean* obj = &autoStopLocalLoopEnabled;
		obj->fromJson(value.dump());

    }

    const char *gzipConnectorRequestsEnabledKey = "gzipConnectorRequestsEnabled";

    if(object.has_key(gzipConnectorRequestsEnabledKey))
    {
        bourne::json value = object[gzipConnectorRequestsEnabledKey];




        ConfigNodePropertyBoolean* obj = &gzipConnectorRequestsEnabled;
		obj->fromJson(value.dump());

    }

    const char *hmacEnabledKey = "hmacEnabled";

    if(object.has_key(hmacEnabledKey))
    {
        bourne::json value = object[hmacEnabledKey];




        ConfigNodePropertyBoolean* obj = &hmacEnabled;
		obj->fromJson(value.dump());

    }

    const char *enableEncryptionKey = "enableEncryption";

    if(object.has_key(enableEncryptionKey))
    {
        bourne::json value = object[enableEncryptionKey];




        ConfigNodePropertyBoolean* obj = &enableEncryption;
		obj->fromJson(value.dump());

    }

    const char *sharedKeyKey = "sharedKey";

    if(object.has_key(sharedKeyKey))
    {
        bourne::json value = object[sharedKeyKey];




        ConfigNodePropertyString* obj = &sharedKey;
		obj->fromJson(value.dump());

    }

    const char *hmacSharedKeyTTLKey = "hmacSharedKeyTTL";

    if(object.has_key(hmacSharedKeyTTLKey))
    {
        bourne::json value = object[hmacSharedKeyTTLKey];




        ConfigNodePropertyInteger* obj = &hmacSharedKeyTTL;
		obj->fromJson(value.dump());

    }

    const char *backoffStandbyFactorKey = "backoffStandbyFactor";

    if(object.has_key(backoffStandbyFactorKey))
    {
        bourne::json value = object[backoffStandbyFactorKey];




        ConfigNodePropertyString* obj = &backoffStandbyFactor;
		obj->fromJson(value.dump());

    }

    const char *backoffStableFactorKey = "backoffStableFactor";

    if(object.has_key(backoffStableFactorKey))
    {
        bourne::json value = object[backoffStableFactorKey];




        ConfigNodePropertyString* obj = &backoffStableFactor;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDiscoveryOakConfigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["connectorPingTimeout"] = getConnectorPingTimeout().toJson();






	object["connectorPingInterval"] = getConnectorPingInterval().toJson();






	object["discoveryLiteCheckInterval"] = getDiscoveryLiteCheckInterval().toJson();






	object["clusterSyncServiceTimeout"] = getClusterSyncServiceTimeout().toJson();






	object["clusterSyncServiceInterval"] = getClusterSyncServiceInterval().toJson();






	object["enableSyncToken"] = getEnableSyncToken().toJson();






	object["minEventDelay"] = getMinEventDelay().toJson();






	object["socketConnectTimeout"] = getSocketConnectTimeout().toJson();






	object["soTimeout"] = getSoTimeout().toJson();






	object["topologyConnectorUrls"] = getTopologyConnectorUrls().toJson();






	object["topologyConnectorWhitelist"] = getTopologyConnectorWhitelist().toJson();






	object["autoStopLocalLoopEnabled"] = getAutoStopLocalLoopEnabled().toJson();






	object["gzipConnectorRequestsEnabled"] = getGzipConnectorRequestsEnabled().toJson();






	object["hmacEnabled"] = getHmacEnabled().toJson();






	object["enableEncryption"] = getEnableEncryption().toJson();






	object["sharedKey"] = getSharedKey().toJson();






	object["hmacSharedKeyTTL"] = getHmacSharedKeyTTL().toJson();






	object["backoffStandbyFactor"] = getBackoffStandbyFactor().toJson();






	object["backoffStableFactor"] = getBackoffStableFactor().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getConnectorPingTimeout()
{
	return connectorPingTimeout;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setConnectorPingTimeout(ConfigNodePropertyInteger connectorPingTimeout)
{
	this->connectorPingTimeout = connectorPingTimeout;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getConnectorPingInterval()
{
	return connectorPingInterval;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setConnectorPingInterval(ConfigNodePropertyInteger connectorPingInterval)
{
	this->connectorPingInterval = connectorPingInterval;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getDiscoveryLiteCheckInterval()
{
	return discoveryLiteCheckInterval;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setDiscoveryLiteCheckInterval(ConfigNodePropertyInteger discoveryLiteCheckInterval)
{
	this->discoveryLiteCheckInterval = discoveryLiteCheckInterval;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getClusterSyncServiceTimeout()
{
	return clusterSyncServiceTimeout;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setClusterSyncServiceTimeout(ConfigNodePropertyInteger clusterSyncServiceTimeout)
{
	this->clusterSyncServiceTimeout = clusterSyncServiceTimeout;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getClusterSyncServiceInterval()
{
	return clusterSyncServiceInterval;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setClusterSyncServiceInterval(ConfigNodePropertyInteger clusterSyncServiceInterval)
{
	this->clusterSyncServiceInterval = clusterSyncServiceInterval;
}

ConfigNodePropertyBoolean
OrgApacheSlingDiscoveryOakConfigProperties::getEnableSyncToken()
{
	return enableSyncToken;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setEnableSyncToken(ConfigNodePropertyBoolean enableSyncToken)
{
	this->enableSyncToken = enableSyncToken;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getMinEventDelay()
{
	return minEventDelay;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setMinEventDelay(ConfigNodePropertyInteger minEventDelay)
{
	this->minEventDelay = minEventDelay;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getSocketConnectTimeout()
{
	return socketConnectTimeout;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setSocketConnectTimeout(ConfigNodePropertyInteger socketConnectTimeout)
{
	this->socketConnectTimeout = socketConnectTimeout;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getSoTimeout()
{
	return soTimeout;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setSoTimeout(ConfigNodePropertyInteger soTimeout)
{
	this->soTimeout = soTimeout;
}

ConfigNodePropertyArray
OrgApacheSlingDiscoveryOakConfigProperties::getTopologyConnectorUrls()
{
	return topologyConnectorUrls;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setTopologyConnectorUrls(ConfigNodePropertyArray topologyConnectorUrls)
{
	this->topologyConnectorUrls = topologyConnectorUrls;
}

ConfigNodePropertyArray
OrgApacheSlingDiscoveryOakConfigProperties::getTopologyConnectorWhitelist()
{
	return topologyConnectorWhitelist;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setTopologyConnectorWhitelist(ConfigNodePropertyArray topologyConnectorWhitelist)
{
	this->topologyConnectorWhitelist = topologyConnectorWhitelist;
}

ConfigNodePropertyBoolean
OrgApacheSlingDiscoveryOakConfigProperties::getAutoStopLocalLoopEnabled()
{
	return autoStopLocalLoopEnabled;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setAutoStopLocalLoopEnabled(ConfigNodePropertyBoolean autoStopLocalLoopEnabled)
{
	this->autoStopLocalLoopEnabled = autoStopLocalLoopEnabled;
}

ConfigNodePropertyBoolean
OrgApacheSlingDiscoveryOakConfigProperties::getGzipConnectorRequestsEnabled()
{
	return gzipConnectorRequestsEnabled;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setGzipConnectorRequestsEnabled(ConfigNodePropertyBoolean gzipConnectorRequestsEnabled)
{
	this->gzipConnectorRequestsEnabled = gzipConnectorRequestsEnabled;
}

ConfigNodePropertyBoolean
OrgApacheSlingDiscoveryOakConfigProperties::getHmacEnabled()
{
	return hmacEnabled;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setHmacEnabled(ConfigNodePropertyBoolean hmacEnabled)
{
	this->hmacEnabled = hmacEnabled;
}

ConfigNodePropertyBoolean
OrgApacheSlingDiscoveryOakConfigProperties::getEnableEncryption()
{
	return enableEncryption;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setEnableEncryption(ConfigNodePropertyBoolean enableEncryption)
{
	this->enableEncryption = enableEncryption;
}

ConfigNodePropertyString
OrgApacheSlingDiscoveryOakConfigProperties::getSharedKey()
{
	return sharedKey;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setSharedKey(ConfigNodePropertyString sharedKey)
{
	this->sharedKey = sharedKey;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getHmacSharedKeyTTL()
{
	return hmacSharedKeyTTL;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setHmacSharedKeyTTL(ConfigNodePropertyInteger hmacSharedKeyTTL)
{
	this->hmacSharedKeyTTL = hmacSharedKeyTTL;
}

ConfigNodePropertyString
OrgApacheSlingDiscoveryOakConfigProperties::getBackoffStandbyFactor()
{
	return backoffStandbyFactor;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setBackoffStandbyFactor(ConfigNodePropertyString backoffStandbyFactor)
{
	this->backoffStandbyFactor = backoffStandbyFactor;
}

ConfigNodePropertyString
OrgApacheSlingDiscoveryOakConfigProperties::getBackoffStableFactor()
{
	return backoffStableFactor;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setBackoffStableFactor(ConfigNodePropertyString backoffStableFactor)
{
	this->backoffStableFactor = backoffStableFactor;
}



