#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties()
{
	//__init();
}

ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::~ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::__init()
{
	//accepted = new ConfigNodePropertyBoolean();
	//ranked = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::__cleanup()
{
	//if(accepted != NULL) {
	//
	//delete accepted;
	//accepted = NULL;
	//}
	//if(ranked != NULL) {
	//
	//delete ranked;
	//ranked = NULL;
	//}
	//
}

void
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *acceptedKey = "accepted";
	node = json_object_get_member(pJsonObject, acceptedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&accepted, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&accepted);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rankedKey = "ranked";
	node = json_object_get_member(pJsonObject, rankedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&ranked, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&ranked);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAccepted();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAccepted());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *acceptedKey = "accepted";
	json_object_set_member(pJsonObject, acceptedKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRanked();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRanked());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rankedKey = "ranked";
	json_object_set_member(pJsonObject, rankedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::getAccepted()
{
	return accepted;
}

void
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::setAccepted(ConfigNodePropertyBoolean  accepted)
{
	this->accepted = accepted;
}

ConfigNodePropertyInteger
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::getRanked()
{
	return ranked;
}

void
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::setRanked(ConfigNodePropertyInteger  ranked)
{
	this->ranked = ranked;
}


