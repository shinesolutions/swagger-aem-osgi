#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo()
{
	//__init();
}

ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::~ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo()
{
	//__cleanup();
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties();
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::__cleanup()
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
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties")) {
			jsonToValue(&properties, node, "ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties", "ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties");
		} else {
			
			ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties* obj = static_cast<ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::toJson()
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
	if (isprimitive("ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties")) {
		ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties obj = getProperties();
		node = converttoJson(&obj, "ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties", "");
	}
	else {
		
		ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties obj = static_cast<ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties> (getProperties());
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
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::setDescription(std::string  description)
{
	this->description = description;
}

ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::setProperties(ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties  properties)
{
	this->properties = properties;
}


