#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties()
{
	//__init();
}

OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::~OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::__init()
{
	//includedPaths = new ConfigNodePropertyArray();
	//enableAsyncObserver = new ConfigNodePropertyBoolean();
	//observerQueueSize = new ConfigNodePropertyInteger();
}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::__cleanup()
{
	//if(includedPaths != NULL) {
	//
	//delete includedPaths;
	//includedPaths = NULL;
	//}
	//if(enableAsyncObserver != NULL) {
	//
	//delete enableAsyncObserver;
	//enableAsyncObserver = NULL;
	//}
	//if(observerQueueSize != NULL) {
	//
	//delete observerQueueSize;
	//observerQueueSize = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *includedPathsKey = "includedPaths";
	node = json_object_get_member(pJsonObject, includedPathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&includedPaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&includedPaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enableAsyncObserverKey = "enableAsyncObserver";
	node = json_object_get_member(pJsonObject, enableAsyncObserverKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enableAsyncObserver, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enableAsyncObserver);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *observerQueueSizeKey = "observerQueueSize";
	node = json_object_get_member(pJsonObject, observerQueueSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&observerQueueSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&observerQueueSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getIncludedPaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getIncludedPaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *includedPathsKey = "includedPaths";
	json_object_set_member(pJsonObject, includedPathsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnableAsyncObserver();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnableAsyncObserver());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableAsyncObserverKey = "enableAsyncObserver";
	json_object_set_member(pJsonObject, enableAsyncObserverKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getObserverQueueSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getObserverQueueSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *observerQueueSizeKey = "observerQueueSize";
	json_object_set_member(pJsonObject, observerQueueSizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::getIncludedPaths()
{
	return includedPaths;
}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::setIncludedPaths(ConfigNodePropertyArray  includedPaths)
{
	this->includedPaths = includedPaths;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::getEnableAsyncObserver()
{
	return enableAsyncObserver;
}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::setEnableAsyncObserver(ConfigNodePropertyBoolean  enableAsyncObserver)
{
	this->enableAsyncObserver = enableAsyncObserver;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::getObserverQueueSize()
{
	return observerQueueSize;
}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::setObserverQueueSize(ConfigNodePropertyInteger  observerQueueSize)
{
	this->observerQueueSize = observerQueueSize;
}


