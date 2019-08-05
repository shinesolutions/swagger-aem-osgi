#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo()
{
	//__init();
}

OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::~OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo()
{
	//__cleanup();
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties();
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::__cleanup()
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
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties")) {
			jsonToValue(&properties, node, "OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties", "OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties");
		} else {
			
			OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties* obj = static_cast<OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::toJson()
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
	if (isprimitive("OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties")) {
		OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties obj = getProperties();
		node = converttoJson(&obj, "OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties", "");
	}
	else {
		
		OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties obj = static_cast<OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties> (getProperties());
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
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::getPid()
{
	return pid;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::getTitle()
{
	return title;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::getDescription()
{
	return description;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::setDescription(std::string  description)
{
	this->description = description;
}

OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::getProperties()
{
	return properties;
}

void
OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo::setProperties(OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties  properties)
{
	this->properties = properties;
}


