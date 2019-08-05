#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties()
{
	//__init();
}

OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::~OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::__init()
{
	//asyncConfigs = new ConfigNodePropertyArray();
	//leaseTimeOutMinutes = new ConfigNodePropertyInteger();
	//failingIndexTimeoutSeconds = new ConfigNodePropertyInteger();
	//errorWarnIntervalSeconds = new ConfigNodePropertyInteger();
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::__cleanup()
{
	//if(asyncConfigs != NULL) {
	//
	//delete asyncConfigs;
	//asyncConfigs = NULL;
	//}
	//if(leaseTimeOutMinutes != NULL) {
	//
	//delete leaseTimeOutMinutes;
	//leaseTimeOutMinutes = NULL;
	//}
	//if(failingIndexTimeoutSeconds != NULL) {
	//
	//delete failingIndexTimeoutSeconds;
	//failingIndexTimeoutSeconds = NULL;
	//}
	//if(errorWarnIntervalSeconds != NULL) {
	//
	//delete errorWarnIntervalSeconds;
	//errorWarnIntervalSeconds = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *asyncConfigsKey = "asyncConfigs";
	node = json_object_get_member(pJsonObject, asyncConfigsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&asyncConfigs, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&asyncConfigs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *leaseTimeOutMinutesKey = "leaseTimeOutMinutes";
	node = json_object_get_member(pJsonObject, leaseTimeOutMinutesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&leaseTimeOutMinutes, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&leaseTimeOutMinutes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *failingIndexTimeoutSecondsKey = "failingIndexTimeoutSeconds";
	node = json_object_get_member(pJsonObject, failingIndexTimeoutSecondsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&failingIndexTimeoutSeconds, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&failingIndexTimeoutSeconds);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *errorWarnIntervalSecondsKey = "errorWarnIntervalSeconds";
	node = json_object_get_member(pJsonObject, errorWarnIntervalSecondsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&errorWarnIntervalSeconds, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&errorWarnIntervalSeconds);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAsyncConfigs();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAsyncConfigs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *asyncConfigsKey = "asyncConfigs";
	json_object_set_member(pJsonObject, asyncConfigsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getLeaseTimeOutMinutes();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getLeaseTimeOutMinutes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *leaseTimeOutMinutesKey = "leaseTimeOutMinutes";
	json_object_set_member(pJsonObject, leaseTimeOutMinutesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getFailingIndexTimeoutSeconds();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getFailingIndexTimeoutSeconds());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *failingIndexTimeoutSecondsKey = "failingIndexTimeoutSeconds";
	json_object_set_member(pJsonObject, failingIndexTimeoutSecondsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getErrorWarnIntervalSeconds();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getErrorWarnIntervalSeconds());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *errorWarnIntervalSecondsKey = "errorWarnIntervalSeconds";
	json_object_set_member(pJsonObject, errorWarnIntervalSecondsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::getAsyncConfigs()
{
	return asyncConfigs;
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::setAsyncConfigs(ConfigNodePropertyArray  asyncConfigs)
{
	this->asyncConfigs = asyncConfigs;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::getLeaseTimeOutMinutes()
{
	return leaseTimeOutMinutes;
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::setLeaseTimeOutMinutes(ConfigNodePropertyInteger  leaseTimeOutMinutes)
{
	this->leaseTimeOutMinutes = leaseTimeOutMinutes;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::getFailingIndexTimeoutSeconds()
{
	return failingIndexTimeoutSeconds;
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::setFailingIndexTimeoutSeconds(ConfigNodePropertyInteger  failingIndexTimeoutSeconds)
{
	this->failingIndexTimeoutSeconds = failingIndexTimeoutSeconds;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::getErrorWarnIntervalSeconds()
{
	return errorWarnIntervalSeconds;
}

void
OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties::setErrorWarnIntervalSeconds(ConfigNodePropertyInteger  errorWarnIntervalSeconds)
{
	this->errorWarnIntervalSeconds = errorWarnIntervalSeconds;
}


