#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties()
{
	//__init();
}

OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::~OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties()
{
	//__cleanup();
}

void
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::__init()
{
	//timeoutInMs = new ConfigNodePropertyInteger();
	//longRunningFutureThresholdForCriticalMs = new ConfigNodePropertyInteger();
	//resultCacheTtlInMs = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::__cleanup()
{
	//if(timeoutInMs != NULL) {
	//
	//delete timeoutInMs;
	//timeoutInMs = NULL;
	//}
	//if(longRunningFutureThresholdForCriticalMs != NULL) {
	//
	//delete longRunningFutureThresholdForCriticalMs;
	//longRunningFutureThresholdForCriticalMs = NULL;
	//}
	//if(resultCacheTtlInMs != NULL) {
	//
	//delete resultCacheTtlInMs;
	//resultCacheTtlInMs = NULL;
	//}
	//
}

void
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *timeoutInMsKey = "timeoutInMs";
	node = json_object_get_member(pJsonObject, timeoutInMsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&timeoutInMs, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&timeoutInMs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *longRunningFutureThresholdForCriticalMsKey = "longRunningFutureThresholdForCriticalMs";
	node = json_object_get_member(pJsonObject, longRunningFutureThresholdForCriticalMsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&longRunningFutureThresholdForCriticalMs, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&longRunningFutureThresholdForCriticalMs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resultCacheTtlInMsKey = "resultCacheTtlInMs";
	node = json_object_get_member(pJsonObject, resultCacheTtlInMsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&resultCacheTtlInMs, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&resultCacheTtlInMs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getTimeoutInMs();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTimeoutInMs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timeoutInMsKey = "timeoutInMs";
	json_object_set_member(pJsonObject, timeoutInMsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getLongRunningFutureThresholdForCriticalMs();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getLongRunningFutureThresholdForCriticalMs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *longRunningFutureThresholdForCriticalMsKey = "longRunningFutureThresholdForCriticalMs";
	json_object_set_member(pJsonObject, longRunningFutureThresholdForCriticalMsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getResultCacheTtlInMs();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getResultCacheTtlInMs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resultCacheTtlInMsKey = "resultCacheTtlInMs";
	json_object_set_member(pJsonObject, resultCacheTtlInMsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::getTimeoutInMs()
{
	return timeoutInMs;
}

void
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::setTimeoutInMs(ConfigNodePropertyInteger  timeoutInMs)
{
	this->timeoutInMs = timeoutInMs;
}

ConfigNodePropertyInteger
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::getLongRunningFutureThresholdForCriticalMs()
{
	return longRunningFutureThresholdForCriticalMs;
}

void
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::setLongRunningFutureThresholdForCriticalMs(ConfigNodePropertyInteger  longRunningFutureThresholdForCriticalMs)
{
	this->longRunningFutureThresholdForCriticalMs = longRunningFutureThresholdForCriticalMs;
}

ConfigNodePropertyInteger
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::getResultCacheTtlInMs()
{
	return resultCacheTtlInMs;
}

void
OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties::setResultCacheTtlInMs(ConfigNodePropertyInteger  resultCacheTtlInMs)
{
	this->resultCacheTtlInMs = resultCacheTtlInMs;
}


