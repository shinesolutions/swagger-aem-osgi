#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeFormsCommonServletTempCleanUpTaskProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeFormsCommonServletTempCleanUpTaskProperties::ComAdobeFormsCommonServletTempCleanUpTaskProperties()
{
	//__init();
}

ComAdobeFormsCommonServletTempCleanUpTaskProperties::~ComAdobeFormsCommonServletTempCleanUpTaskProperties()
{
	//__cleanup();
}

void
ComAdobeFormsCommonServletTempCleanUpTaskProperties::__init()
{
	//schedulerexpression = new ConfigNodePropertyString();
	//durationforTemporaryStorage = new ConfigNodePropertyString();
	//durationforAnonymousStorage = new ConfigNodePropertyString();
}

void
ComAdobeFormsCommonServletTempCleanUpTaskProperties::__cleanup()
{
	//if(schedulerexpression != NULL) {
	//
	//delete schedulerexpression;
	//schedulerexpression = NULL;
	//}
	//if(durationforTemporaryStorage != NULL) {
	//
	//delete durationforTemporaryStorage;
	//durationforTemporaryStorage = NULL;
	//}
	//if(durationforAnonymousStorage != NULL) {
	//
	//delete durationforAnonymousStorage;
	//durationforAnonymousStorage = NULL;
	//}
	//
}

void
ComAdobeFormsCommonServletTempCleanUpTaskProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *schedulerexpressionKey = "scheduler.expression";
	node = json_object_get_member(pJsonObject, schedulerexpressionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&schedulerexpression, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&schedulerexpression);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *durationforTemporaryStorageKey = "Duration for Temporary Storage";
	node = json_object_get_member(pJsonObject, durationforTemporaryStorageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&durationforTemporaryStorage, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&durationforTemporaryStorage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *durationforAnonymousStorageKey = "Duration for Anonymous Storage";
	node = json_object_get_member(pJsonObject, durationforAnonymousStorageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&durationforAnonymousStorage, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&durationforAnonymousStorage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeFormsCommonServletTempCleanUpTaskProperties::ComAdobeFormsCommonServletTempCleanUpTaskProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeFormsCommonServletTempCleanUpTaskProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSchedulerexpression();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSchedulerexpression());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerexpressionKey = "scheduler.expression";
	json_object_set_member(pJsonObject, schedulerexpressionKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDurationforTemporaryStorage();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDurationforTemporaryStorage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *durationforTemporaryStorageKey = "Duration for Temporary Storage";
	json_object_set_member(pJsonObject, durationforTemporaryStorageKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDurationforAnonymousStorage();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDurationforAnonymousStorage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *durationforAnonymousStorageKey = "Duration for Anonymous Storage";
	json_object_set_member(pJsonObject, durationforAnonymousStorageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeFormsCommonServletTempCleanUpTaskProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComAdobeFormsCommonServletTempCleanUpTaskProperties::setSchedulerexpression(ConfigNodePropertyString  schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyString
ComAdobeFormsCommonServletTempCleanUpTaskProperties::getDurationforTemporaryStorage()
{
	return durationforTemporaryStorage;
}

void
ComAdobeFormsCommonServletTempCleanUpTaskProperties::setDurationforTemporaryStorage(ConfigNodePropertyString  durationforTemporaryStorage)
{
	this->durationforTemporaryStorage = durationforTemporaryStorage;
}

ConfigNodePropertyString
ComAdobeFormsCommonServletTempCleanUpTaskProperties::getDurationforAnonymousStorage()
{
	return durationforAnonymousStorage;
}

void
ComAdobeFormsCommonServletTempCleanUpTaskProperties::setDurationforAnonymousStorage(ConfigNodePropertyString  durationforAnonymousStorage)
{
	this->durationforAnonymousStorage = durationforAnonymousStorage;
}


