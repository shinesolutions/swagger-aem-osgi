#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties()
{
	//__init();
}

ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::~ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::__init()
{
	//eventtopics = new ConfigNodePropertyString();
	//eventfilter = new ConfigNodePropertyString();
}

void
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::__cleanup()
{
	//if(eventtopics != NULL) {
	//
	//delete eventtopics;
	//eventtopics = NULL;
	//}
	//if(eventfilter != NULL) {
	//
	//delete eventfilter;
	//eventfilter = NULL;
	//}
	//
}

void
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *eventtopicsKey = "event.topics";
	node = json_object_get_member(pJsonObject, eventtopicsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&eventtopics, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&eventtopics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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

ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEventtopics();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEventtopics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eventtopicsKey = "event.topics";
	json_object_set_member(pJsonObject, eventtopicsKey, node);
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
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::getEventtopics()
{
	return eventtopics;
}

void
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::setEventtopics(ConfigNodePropertyString  eventtopics)
{
	this->eventtopics = eventtopics;
}

ConfigNodePropertyString
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::getEventfilter()
{
	return eventfilter;
}

void
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::setEventfilter(ConfigNodePropertyString  eventfilter)
{
	this->eventfilter = eventfilter;
}


