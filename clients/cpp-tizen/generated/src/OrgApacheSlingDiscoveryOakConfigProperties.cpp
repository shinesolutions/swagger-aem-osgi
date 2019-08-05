#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDiscoveryOakConfigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDiscoveryOakConfigProperties::OrgApacheSlingDiscoveryOakConfigProperties()
{
	//__init();
}

OrgApacheSlingDiscoveryOakConfigProperties::~OrgApacheSlingDiscoveryOakConfigProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDiscoveryOakConfigProperties::__init()
{
	//connectorPingTimeout = new ConfigNodePropertyInteger();
	//connectorPingInterval = new ConfigNodePropertyInteger();
	//discoveryLiteCheckInterval = new ConfigNodePropertyInteger();
	//clusterSyncServiceTimeout = new ConfigNodePropertyInteger();
	//clusterSyncServiceInterval = new ConfigNodePropertyInteger();
	//enableSyncToken = new ConfigNodePropertyBoolean();
	//minEventDelay = new ConfigNodePropertyInteger();
	//socketConnectTimeout = new ConfigNodePropertyInteger();
	//soTimeout = new ConfigNodePropertyInteger();
	//topologyConnectorUrls = new ConfigNodePropertyArray();
	//topologyConnectorWhitelist = new ConfigNodePropertyArray();
	//autoStopLocalLoopEnabled = new ConfigNodePropertyBoolean();
	//gzipConnectorRequestsEnabled = new ConfigNodePropertyBoolean();
	//hmacEnabled = new ConfigNodePropertyBoolean();
	//enableEncryption = new ConfigNodePropertyBoolean();
	//sharedKey = new ConfigNodePropertyString();
	//hmacSharedKeyTTL = new ConfigNodePropertyInteger();
	//backoffStandbyFactor = new ConfigNodePropertyString();
	//backoffStableFactor = new ConfigNodePropertyString();
}

void
OrgApacheSlingDiscoveryOakConfigProperties::__cleanup()
{
	//if(connectorPingTimeout != NULL) {
	//
	//delete connectorPingTimeout;
	//connectorPingTimeout = NULL;
	//}
	//if(connectorPingInterval != NULL) {
	//
	//delete connectorPingInterval;
	//connectorPingInterval = NULL;
	//}
	//if(discoveryLiteCheckInterval != NULL) {
	//
	//delete discoveryLiteCheckInterval;
	//discoveryLiteCheckInterval = NULL;
	//}
	//if(clusterSyncServiceTimeout != NULL) {
	//
	//delete clusterSyncServiceTimeout;
	//clusterSyncServiceTimeout = NULL;
	//}
	//if(clusterSyncServiceInterval != NULL) {
	//
	//delete clusterSyncServiceInterval;
	//clusterSyncServiceInterval = NULL;
	//}
	//if(enableSyncToken != NULL) {
	//
	//delete enableSyncToken;
	//enableSyncToken = NULL;
	//}
	//if(minEventDelay != NULL) {
	//
	//delete minEventDelay;
	//minEventDelay = NULL;
	//}
	//if(socketConnectTimeout != NULL) {
	//
	//delete socketConnectTimeout;
	//socketConnectTimeout = NULL;
	//}
	//if(soTimeout != NULL) {
	//
	//delete soTimeout;
	//soTimeout = NULL;
	//}
	//if(topologyConnectorUrls != NULL) {
	//
	//delete topologyConnectorUrls;
	//topologyConnectorUrls = NULL;
	//}
	//if(topologyConnectorWhitelist != NULL) {
	//
	//delete topologyConnectorWhitelist;
	//topologyConnectorWhitelist = NULL;
	//}
	//if(autoStopLocalLoopEnabled != NULL) {
	//
	//delete autoStopLocalLoopEnabled;
	//autoStopLocalLoopEnabled = NULL;
	//}
	//if(gzipConnectorRequestsEnabled != NULL) {
	//
	//delete gzipConnectorRequestsEnabled;
	//gzipConnectorRequestsEnabled = NULL;
	//}
	//if(hmacEnabled != NULL) {
	//
	//delete hmacEnabled;
	//hmacEnabled = NULL;
	//}
	//if(enableEncryption != NULL) {
	//
	//delete enableEncryption;
	//enableEncryption = NULL;
	//}
	//if(sharedKey != NULL) {
	//
	//delete sharedKey;
	//sharedKey = NULL;
	//}
	//if(hmacSharedKeyTTL != NULL) {
	//
	//delete hmacSharedKeyTTL;
	//hmacSharedKeyTTL = NULL;
	//}
	//if(backoffStandbyFactor != NULL) {
	//
	//delete backoffStandbyFactor;
	//backoffStandbyFactor = NULL;
	//}
	//if(backoffStableFactor != NULL) {
	//
	//delete backoffStableFactor;
	//backoffStableFactor = NULL;
	//}
	//
}

void
OrgApacheSlingDiscoveryOakConfigProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *connectorPingTimeoutKey = "connectorPingTimeout";
	node = json_object_get_member(pJsonObject, connectorPingTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&connectorPingTimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&connectorPingTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *connectorPingIntervalKey = "connectorPingInterval";
	node = json_object_get_member(pJsonObject, connectorPingIntervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&connectorPingInterval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&connectorPingInterval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *discoveryLiteCheckIntervalKey = "discoveryLiteCheckInterval";
	node = json_object_get_member(pJsonObject, discoveryLiteCheckIntervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&discoveryLiteCheckInterval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&discoveryLiteCheckInterval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *clusterSyncServiceTimeoutKey = "clusterSyncServiceTimeout";
	node = json_object_get_member(pJsonObject, clusterSyncServiceTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&clusterSyncServiceTimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&clusterSyncServiceTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *clusterSyncServiceIntervalKey = "clusterSyncServiceInterval";
	node = json_object_get_member(pJsonObject, clusterSyncServiceIntervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&clusterSyncServiceInterval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&clusterSyncServiceInterval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enableSyncTokenKey = "enableSyncToken";
	node = json_object_get_member(pJsonObject, enableSyncTokenKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enableSyncToken, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enableSyncToken);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *minEventDelayKey = "minEventDelay";
	node = json_object_get_member(pJsonObject, minEventDelayKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&minEventDelay, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&minEventDelay);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *socketConnectTimeoutKey = "socketConnectTimeout";
	node = json_object_get_member(pJsonObject, socketConnectTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&socketConnectTimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&socketConnectTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *soTimeoutKey = "soTimeout";
	node = json_object_get_member(pJsonObject, soTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&soTimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&soTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *topologyConnectorUrlsKey = "topologyConnectorUrls";
	node = json_object_get_member(pJsonObject, topologyConnectorUrlsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&topologyConnectorUrls, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&topologyConnectorUrls);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *topologyConnectorWhitelistKey = "topologyConnectorWhitelist";
	node = json_object_get_member(pJsonObject, topologyConnectorWhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&topologyConnectorWhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&topologyConnectorWhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *autoStopLocalLoopEnabledKey = "autoStopLocalLoopEnabled";
	node = json_object_get_member(pJsonObject, autoStopLocalLoopEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&autoStopLocalLoopEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&autoStopLocalLoopEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *gzipConnectorRequestsEnabledKey = "gzipConnectorRequestsEnabled";
	node = json_object_get_member(pJsonObject, gzipConnectorRequestsEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&gzipConnectorRequestsEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&gzipConnectorRequestsEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hmacEnabledKey = "hmacEnabled";
	node = json_object_get_member(pJsonObject, hmacEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&hmacEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&hmacEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enableEncryptionKey = "enableEncryption";
	node = json_object_get_member(pJsonObject, enableEncryptionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enableEncryption, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enableEncryption);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sharedKeyKey = "sharedKey";
	node = json_object_get_member(pJsonObject, sharedKeyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&sharedKey, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&sharedKey);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hmacSharedKeyTTLKey = "hmacSharedKeyTTL";
	node = json_object_get_member(pJsonObject, hmacSharedKeyTTLKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&hmacSharedKeyTTL, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&hmacSharedKeyTTL);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *backoffStandbyFactorKey = "backoffStandbyFactor";
	node = json_object_get_member(pJsonObject, backoffStandbyFactorKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&backoffStandbyFactor, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&backoffStandbyFactor);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *backoffStableFactorKey = "backoffStableFactor";
	node = json_object_get_member(pJsonObject, backoffStableFactorKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&backoffStableFactor, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&backoffStableFactor);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDiscoveryOakConfigProperties::OrgApacheSlingDiscoveryOakConfigProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDiscoveryOakConfigProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getConnectorPingTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getConnectorPingTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *connectorPingTimeoutKey = "connectorPingTimeout";
	json_object_set_member(pJsonObject, connectorPingTimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getConnectorPingInterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getConnectorPingInterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *connectorPingIntervalKey = "connectorPingInterval";
	json_object_set_member(pJsonObject, connectorPingIntervalKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getDiscoveryLiteCheckInterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getDiscoveryLiteCheckInterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *discoveryLiteCheckIntervalKey = "discoveryLiteCheckInterval";
	json_object_set_member(pJsonObject, discoveryLiteCheckIntervalKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getClusterSyncServiceTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getClusterSyncServiceTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *clusterSyncServiceTimeoutKey = "clusterSyncServiceTimeout";
	json_object_set_member(pJsonObject, clusterSyncServiceTimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getClusterSyncServiceInterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getClusterSyncServiceInterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *clusterSyncServiceIntervalKey = "clusterSyncServiceInterval";
	json_object_set_member(pJsonObject, clusterSyncServiceIntervalKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnableSyncToken();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnableSyncToken());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableSyncTokenKey = "enableSyncToken";
	json_object_set_member(pJsonObject, enableSyncTokenKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMinEventDelay();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMinEventDelay());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *minEventDelayKey = "minEventDelay";
	json_object_set_member(pJsonObject, minEventDelayKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSocketConnectTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSocketConnectTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *socketConnectTimeoutKey = "socketConnectTimeout";
	json_object_set_member(pJsonObject, socketConnectTimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSoTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSoTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *soTimeoutKey = "soTimeout";
	json_object_set_member(pJsonObject, soTimeoutKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getTopologyConnectorUrls();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getTopologyConnectorUrls());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *topologyConnectorUrlsKey = "topologyConnectorUrls";
	json_object_set_member(pJsonObject, topologyConnectorUrlsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getTopologyConnectorWhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getTopologyConnectorWhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *topologyConnectorWhitelistKey = "topologyConnectorWhitelist";
	json_object_set_member(pJsonObject, topologyConnectorWhitelistKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAutoStopLocalLoopEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAutoStopLocalLoopEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *autoStopLocalLoopEnabledKey = "autoStopLocalLoopEnabled";
	json_object_set_member(pJsonObject, autoStopLocalLoopEnabledKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGzipConnectorRequestsEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGzipConnectorRequestsEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gzipConnectorRequestsEnabledKey = "gzipConnectorRequestsEnabled";
	json_object_set_member(pJsonObject, gzipConnectorRequestsEnabledKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getHmacEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getHmacEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hmacEnabledKey = "hmacEnabled";
	json_object_set_member(pJsonObject, hmacEnabledKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnableEncryption();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnableEncryption());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableEncryptionKey = "enableEncryption";
	json_object_set_member(pJsonObject, enableEncryptionKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSharedKey();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSharedKey());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sharedKeyKey = "sharedKey";
	json_object_set_member(pJsonObject, sharedKeyKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getHmacSharedKeyTTL();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getHmacSharedKeyTTL());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hmacSharedKeyTTLKey = "hmacSharedKeyTTL";
	json_object_set_member(pJsonObject, hmacSharedKeyTTLKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getBackoffStandbyFactor();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getBackoffStandbyFactor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *backoffStandbyFactorKey = "backoffStandbyFactor";
	json_object_set_member(pJsonObject, backoffStandbyFactorKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getBackoffStableFactor();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getBackoffStableFactor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *backoffStableFactorKey = "backoffStableFactor";
	json_object_set_member(pJsonObject, backoffStableFactorKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getConnectorPingTimeout()
{
	return connectorPingTimeout;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setConnectorPingTimeout(ConfigNodePropertyInteger  connectorPingTimeout)
{
	this->connectorPingTimeout = connectorPingTimeout;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getConnectorPingInterval()
{
	return connectorPingInterval;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setConnectorPingInterval(ConfigNodePropertyInteger  connectorPingInterval)
{
	this->connectorPingInterval = connectorPingInterval;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getDiscoveryLiteCheckInterval()
{
	return discoveryLiteCheckInterval;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setDiscoveryLiteCheckInterval(ConfigNodePropertyInteger  discoveryLiteCheckInterval)
{
	this->discoveryLiteCheckInterval = discoveryLiteCheckInterval;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getClusterSyncServiceTimeout()
{
	return clusterSyncServiceTimeout;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setClusterSyncServiceTimeout(ConfigNodePropertyInteger  clusterSyncServiceTimeout)
{
	this->clusterSyncServiceTimeout = clusterSyncServiceTimeout;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getClusterSyncServiceInterval()
{
	return clusterSyncServiceInterval;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setClusterSyncServiceInterval(ConfigNodePropertyInteger  clusterSyncServiceInterval)
{
	this->clusterSyncServiceInterval = clusterSyncServiceInterval;
}

ConfigNodePropertyBoolean
OrgApacheSlingDiscoveryOakConfigProperties::getEnableSyncToken()
{
	return enableSyncToken;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setEnableSyncToken(ConfigNodePropertyBoolean  enableSyncToken)
{
	this->enableSyncToken = enableSyncToken;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getMinEventDelay()
{
	return minEventDelay;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setMinEventDelay(ConfigNodePropertyInteger  minEventDelay)
{
	this->minEventDelay = minEventDelay;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getSocketConnectTimeout()
{
	return socketConnectTimeout;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setSocketConnectTimeout(ConfigNodePropertyInteger  socketConnectTimeout)
{
	this->socketConnectTimeout = socketConnectTimeout;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getSoTimeout()
{
	return soTimeout;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setSoTimeout(ConfigNodePropertyInteger  soTimeout)
{
	this->soTimeout = soTimeout;
}

ConfigNodePropertyArray
OrgApacheSlingDiscoveryOakConfigProperties::getTopologyConnectorUrls()
{
	return topologyConnectorUrls;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setTopologyConnectorUrls(ConfigNodePropertyArray  topologyConnectorUrls)
{
	this->topologyConnectorUrls = topologyConnectorUrls;
}

ConfigNodePropertyArray
OrgApacheSlingDiscoveryOakConfigProperties::getTopologyConnectorWhitelist()
{
	return topologyConnectorWhitelist;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setTopologyConnectorWhitelist(ConfigNodePropertyArray  topologyConnectorWhitelist)
{
	this->topologyConnectorWhitelist = topologyConnectorWhitelist;
}

ConfigNodePropertyBoolean
OrgApacheSlingDiscoveryOakConfigProperties::getAutoStopLocalLoopEnabled()
{
	return autoStopLocalLoopEnabled;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setAutoStopLocalLoopEnabled(ConfigNodePropertyBoolean  autoStopLocalLoopEnabled)
{
	this->autoStopLocalLoopEnabled = autoStopLocalLoopEnabled;
}

ConfigNodePropertyBoolean
OrgApacheSlingDiscoveryOakConfigProperties::getGzipConnectorRequestsEnabled()
{
	return gzipConnectorRequestsEnabled;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setGzipConnectorRequestsEnabled(ConfigNodePropertyBoolean  gzipConnectorRequestsEnabled)
{
	this->gzipConnectorRequestsEnabled = gzipConnectorRequestsEnabled;
}

ConfigNodePropertyBoolean
OrgApacheSlingDiscoveryOakConfigProperties::getHmacEnabled()
{
	return hmacEnabled;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setHmacEnabled(ConfigNodePropertyBoolean  hmacEnabled)
{
	this->hmacEnabled = hmacEnabled;
}

ConfigNodePropertyBoolean
OrgApacheSlingDiscoveryOakConfigProperties::getEnableEncryption()
{
	return enableEncryption;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setEnableEncryption(ConfigNodePropertyBoolean  enableEncryption)
{
	this->enableEncryption = enableEncryption;
}

ConfigNodePropertyString
OrgApacheSlingDiscoveryOakConfigProperties::getSharedKey()
{
	return sharedKey;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setSharedKey(ConfigNodePropertyString  sharedKey)
{
	this->sharedKey = sharedKey;
}

ConfigNodePropertyInteger
OrgApacheSlingDiscoveryOakConfigProperties::getHmacSharedKeyTTL()
{
	return hmacSharedKeyTTL;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setHmacSharedKeyTTL(ConfigNodePropertyInteger  hmacSharedKeyTTL)
{
	this->hmacSharedKeyTTL = hmacSharedKeyTTL;
}

ConfigNodePropertyString
OrgApacheSlingDiscoveryOakConfigProperties::getBackoffStandbyFactor()
{
	return backoffStandbyFactor;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setBackoffStandbyFactor(ConfigNodePropertyString  backoffStandbyFactor)
{
	this->backoffStandbyFactor = backoffStandbyFactor;
}

ConfigNodePropertyString
OrgApacheSlingDiscoveryOakConfigProperties::getBackoffStableFactor()
{
	return backoffStableFactor;
}

void
OrgApacheSlingDiscoveryOakConfigProperties::setBackoffStableFactor(ConfigNodePropertyString  backoffStableFactor)
{
	this->backoffStableFactor = backoffStableFactor;
}


