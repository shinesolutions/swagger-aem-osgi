#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmNotificationImplNotificationManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmNotificationImplNotificationManagerImplProperties::ComDayCqWcmNotificationImplNotificationManagerImplProperties()
{
	//__init();
}

ComDayCqWcmNotificationImplNotificationManagerImplProperties::~ComDayCqWcmNotificationImplNotificationManagerImplProperties()
{
	//__cleanup();
}

void
ComDayCqWcmNotificationImplNotificationManagerImplProperties::__init()
{
	//eventtopics = new ConfigNodePropertyArray();
}

void
ComDayCqWcmNotificationImplNotificationManagerImplProperties::__cleanup()
{
	//if(eventtopics != NULL) {
	//
	//delete eventtopics;
	//eventtopics = NULL;
	//}
	//
}

void
ComDayCqWcmNotificationImplNotificationManagerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *eventtopicsKey = "event.topics";
	node = json_object_get_member(pJsonObject, eventtopicsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&eventtopics, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&eventtopics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmNotificationImplNotificationManagerImplProperties::ComDayCqWcmNotificationImplNotificationManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmNotificationImplNotificationManagerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getEventtopics();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getEventtopics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eventtopicsKey = "event.topics";
	json_object_set_member(pJsonObject, eventtopicsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmNotificationImplNotificationManagerImplProperties::getEventtopics()
{
	return eventtopics;
}

void
ComDayCqWcmNotificationImplNotificationManagerImplProperties::setEventtopics(ConfigNodePropertyArray  eventtopics)
{
	this->eventtopics = eventtopics;
}


