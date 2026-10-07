#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties()
{
	//__init();
}

ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::~ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::__init()
{
	//priority = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::__cleanup()
{
	//if(priority != NULL) {
	//
	//delete priority;
	//priority = NULL;
	//}
	//
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::fromJson(char* jsonStr)
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

ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::toJson()
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
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties::setPriority(ConfigNodePropertyInteger  priority)
{
	this->priority = priority;
}


