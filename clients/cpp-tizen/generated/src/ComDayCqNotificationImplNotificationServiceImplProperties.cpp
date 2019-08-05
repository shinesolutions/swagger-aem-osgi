#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqNotificationImplNotificationServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqNotificationImplNotificationServiceImplProperties::ComDayCqNotificationImplNotificationServiceImplProperties()
{
	//__init();
}

ComDayCqNotificationImplNotificationServiceImplProperties::~ComDayCqNotificationImplNotificationServiceImplProperties()
{
	//__cleanup();
}

void
ComDayCqNotificationImplNotificationServiceImplProperties::__init()
{
	//eventfilter = new ConfigNodePropertyString();
}

void
ComDayCqNotificationImplNotificationServiceImplProperties::__cleanup()
{
	//if(eventfilter != NULL) {
	//
	//delete eventfilter;
	//eventfilter = NULL;
	//}
	//
}

void
ComDayCqNotificationImplNotificationServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *eventfilterKey = "event.filter";
	node = json_object_get_member(pJsonObject, eventfilterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&eventfilter, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&eventfilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqNotificationImplNotificationServiceImplProperties::ComDayCqNotificationImplNotificationServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqNotificationImplNotificationServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEventfilter();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEventfilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eventfilterKey = "event.filter";
	json_object_set_member(pJsonObject, eventfilterKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqNotificationImplNotificationServiceImplProperties::getEventfilter()
{
	return eventfilter;
}

void
ComDayCqNotificationImplNotificationServiceImplProperties::setEventfilter(ConfigNodePropertyString  eventfilter)
{
	this->eventfilter = eventfilter;
}


