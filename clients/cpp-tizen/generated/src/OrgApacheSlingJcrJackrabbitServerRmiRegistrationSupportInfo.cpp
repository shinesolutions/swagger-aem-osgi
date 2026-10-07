#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo()
{
	//__init();
}

OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::~OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo()
{
	//__cleanup();
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties();
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::__cleanup()
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
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties")) {
			jsonToValue(&properties, node, "OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties", "OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties");
		} else {
			
			OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties* obj = static_cast<OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::toJson()
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
	if (isprimitive("OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties")) {
		OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties obj = getProperties();
		node = converttoJson(&obj, "OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties", "");
	}
	else {
		
		OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties obj = static_cast<OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties> (getProperties());
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
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::setDescription(std::string  description)
{
	this->description = description;
}

OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo::setProperties(OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties  properties)
{
	this->properties = properties;
}


