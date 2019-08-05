#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties()
{
	//__init();
}

ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::~ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::__init()
{
	//everyoneLimit = new ConfigNodePropertyInteger();
	//priority = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::__cleanup()
{
	//if(everyoneLimit != NULL) {
	//
	//delete everyoneLimit;
	//everyoneLimit = NULL;
	//}
	//if(priority != NULL) {
	//
	//delete priority;
	//priority = NULL;
	//}
	//
}

void
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *everyoneLimitKey = "everyoneLimit";
	node = json_object_get_member(pJsonObject, everyoneLimitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&everyoneLimit, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&everyoneLimit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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

ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getEveryoneLimit();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getEveryoneLimit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *everyoneLimitKey = "everyoneLimit";
	json_object_set_member(pJsonObject, everyoneLimitKey, node);
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
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::getEveryoneLimit()
{
	return everyoneLimit;
}

void
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::setEveryoneLimit(ConfigNodePropertyInteger  everyoneLimit)
{
	this->everyoneLimit = everyoneLimit;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::setPriority(ConfigNodePropertyInteger  priority)
{
	this->priority = priority;
}


