#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties()
{
	//__init();
}

ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::~ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::__init()
{
	//priority = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::__cleanup()
{
	//if(priority != NULL) {
	//
	//delete priority;
	//priority = NULL;
	//}
	//
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::fromJson(char* jsonStr)
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

ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::toJson()
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
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties::setPriority(ConfigNodePropertyInteger  priority)
{
	this->priority = priority;
}


