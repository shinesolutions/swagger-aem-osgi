#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo()
{
	//__init();
}

ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::~ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo()
{
	//__cleanup();
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties();
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::__cleanup()
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
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties")) {
			jsonToValue(&properties, node, "ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties", "ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties");
		} else {
			
			ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties* obj = static_cast<ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::toJson()
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
	if (isprimitive("ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties")) {
		ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties obj = getProperties();
		node = converttoJson(&obj, "ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties", "");
	}
	else {
		
		ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties obj = static_cast<ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties> (getProperties());
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
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::setDescription(std::string  description)
{
	this->description = description;
}

ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo::setProperties(ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties  properties)
{
	this->properties = properties;
}


