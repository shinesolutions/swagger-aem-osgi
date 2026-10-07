#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties()
{
	//__init();
}

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::~ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::__init()
{
	//eventtopics = new ConfigNodePropertyString();
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::__cleanup()
{
	//if(eventtopics != NULL) {
	//
	//delete eventtopics;
	//eventtopics = NULL;
	//}
	//
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::fromJson(char* jsonStr)
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
}

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::getEventtopics()
{
	return eventtopics;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::setEventtopics(ConfigNodePropertyString  eventtopics)
{
	this->eventtopics = eventtopics;
}


