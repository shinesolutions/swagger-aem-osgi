#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo()
{
	//__init();
}

OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::~OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo()
{
	//__cleanup();
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties();
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::__cleanup()
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
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties")) {
			jsonToValue(&properties, node, "OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties", "OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties");
		} else {
			
			OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties* obj = static_cast<OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::toJson()
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
	if (isprimitive("OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties")) {
		OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties obj = getProperties();
		node = converttoJson(&obj, "OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties", "");
	}
	else {
		
		OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties obj = static_cast<OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties> (getProperties());
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
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::setDescription(std::string  description)
{
	this->description = description;
}

OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::setProperties(OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties  properties)
{
	this->properties = properties;
}


