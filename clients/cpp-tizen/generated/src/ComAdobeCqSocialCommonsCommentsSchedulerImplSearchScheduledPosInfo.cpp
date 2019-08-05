#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo()
{
	//__init();
}

ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::~ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo()
{
	//__cleanup();
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties();
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::__cleanup()
{
	//if(pid != NULL) {
	//
	//delete pid;
	//pid = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(properties != NULL) {
	//
	//delete properties;
	//properties = NULL;
	//}
	//
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pidKey = "pid";
	node = json_object_get_member(pJsonObject, pidKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pid, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *propertiesKey = "properties";
	node = json_object_get_member(pJsonObject, propertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties")) {
			jsonToValue(&properties, node, "ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties", "ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties");
		} else {
			
			ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties* obj = static_cast<ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getPid();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pidKey = "pid";
	json_object_set_member(pJsonObject, pidKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties")) {
		ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties obj = getProperties();
		node = converttoJson(&obj, "ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties", "");
	}
	else {
		
		ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties obj = static_cast<ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties> (getProperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *propertiesKey = "properties";
	json_object_set_member(pJsonObject, propertiesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::setDescription(std::string  description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo::setProperties(ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties  properties)
{
	this->properties = properties;
}


