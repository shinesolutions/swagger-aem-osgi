#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties()
{
	//__init();
}

ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::~ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::__init()
{
	//enableScheduledPostsSearch = new ConfigNodePropertyBoolean();
	//numberOfMinutes = new ConfigNodePropertyInteger();
	//maxSearchLimit = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::__cleanup()
{
	//if(enableScheduledPostsSearch != NULL) {
	//
	//delete enableScheduledPostsSearch;
	//enableScheduledPostsSearch = NULL;
	//}
	//if(numberOfMinutes != NULL) {
	//
	//delete numberOfMinutes;
	//numberOfMinutes = NULL;
	//}
	//if(maxSearchLimit != NULL) {
	//
	//delete maxSearchLimit;
	//maxSearchLimit = NULL;
	//}
	//
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *enableScheduledPostsSearchKey = "enableScheduledPostsSearch";
	node = json_object_get_member(pJsonObject, enableScheduledPostsSearchKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enableScheduledPostsSearch, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enableScheduledPostsSearch);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *numberOfMinutesKey = "numberOfMinutes";
	node = json_object_get_member(pJsonObject, numberOfMinutesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&numberOfMinutes, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&numberOfMinutes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxSearchLimitKey = "maxSearchLimit";
	node = json_object_get_member(pJsonObject, maxSearchLimitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxSearchLimit, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxSearchLimit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnableScheduledPostsSearch();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnableScheduledPostsSearch());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableScheduledPostsSearchKey = "enableScheduledPostsSearch";
	json_object_set_member(pJsonObject, enableScheduledPostsSearchKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getNumberOfMinutes();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getNumberOfMinutes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *numberOfMinutesKey = "numberOfMinutes";
	json_object_set_member(pJsonObject, numberOfMinutesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxSearchLimit();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxSearchLimit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxSearchLimitKey = "maxSearchLimit";
	json_object_set_member(pJsonObject, maxSearchLimitKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::getEnableScheduledPostsSearch()
{
	return enableScheduledPostsSearch;
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::setEnableScheduledPostsSearch(ConfigNodePropertyBoolean  enableScheduledPostsSearch)
{
	this->enableScheduledPostsSearch = enableScheduledPostsSearch;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::getNumberOfMinutes()
{
	return numberOfMinutes;
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::setNumberOfMinutes(ConfigNodePropertyInteger  numberOfMinutes)
{
	this->numberOfMinutes = numberOfMinutes;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::getMaxSearchLimit()
{
	return maxSearchLimit;
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::setMaxSearchLimit(ConfigNodePropertyInteger  maxSearchLimit)
{
	this->maxSearchLimit = maxSearchLimit;
}


