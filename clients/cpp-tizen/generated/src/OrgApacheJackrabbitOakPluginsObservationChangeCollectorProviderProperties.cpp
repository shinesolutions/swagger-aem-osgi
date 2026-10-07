#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties()
{
	//__init();
}

OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::~OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::__init()
{
	//maxItems = new ConfigNodePropertyInteger();
	//maxPathDepth = new ConfigNodePropertyInteger();
	//enabled = new ConfigNodePropertyBoolean();
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::__cleanup()
{
	//if(maxItems != NULL) {
	//
	//delete maxItems;
	//maxItems = NULL;
	//}
	//if(maxPathDepth != NULL) {
	//
	//delete maxPathDepth;
	//maxPathDepth = NULL;
	//}
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maxItemsKey = "maxItems";
	node = json_object_get_member(pJsonObject, maxItemsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxItems, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxItems);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxPathDepthKey = "maxPathDepth";
	node = json_object_get_member(pJsonObject, maxPathDepthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxPathDepth, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxPathDepth);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enabledKey = "enabled";
	node = json_object_get_member(pJsonObject, enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxItems();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxItems());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxItemsKey = "maxItems";
	json_object_set_member(pJsonObject, maxItemsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxPathDepth();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxPathDepth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxPathDepthKey = "maxPathDepth";
	json_object_set_member(pJsonObject, maxPathDepthKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enabledKey = "enabled";
	json_object_set_member(pJsonObject, enabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::getMaxItems()
{
	return maxItems;
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::setMaxItems(ConfigNodePropertyInteger  maxItems)
{
	this->maxItems = maxItems;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::getMaxPathDepth()
{
	return maxPathDepth;
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::setMaxPathDepth(ConfigNodePropertyInteger  maxPathDepth)
{
	this->maxPathDepth = maxPathDepth;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::getEnabled()
{
	return enabled;
}

void
OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}


