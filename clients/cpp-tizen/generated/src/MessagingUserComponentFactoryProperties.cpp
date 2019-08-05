#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessagingUserComponentFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessagingUserComponentFactoryProperties::MessagingUserComponentFactoryProperties()
{
	//__init();
}

MessagingUserComponentFactoryProperties::~MessagingUserComponentFactoryProperties()
{
	//__cleanup();
}

void
MessagingUserComponentFactoryProperties::__init()
{
	//priority = new ConfigNodePropertyInteger();
}

void
MessagingUserComponentFactoryProperties::__cleanup()
{
	//if(priority != NULL) {
	//
	//delete priority;
	//priority = NULL;
	//}
	//
}

void
MessagingUserComponentFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *priorityKey = "priority";
	node = json_object_get_member(pJsonObject, priorityKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&priority, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&priority);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MessagingUserComponentFactoryProperties::MessagingUserComponentFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
MessagingUserComponentFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPriority();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPriority());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priorityKey = "priority";
	json_object_set_member(pJsonObject, priorityKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
MessagingUserComponentFactoryProperties::getPriority()
{
	return priority;
}

void
MessagingUserComponentFactoryProperties::setPriority(ConfigNodePropertyInteger  priority)
{
	this->priority = priority;
}


