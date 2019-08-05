#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteWorkflowCorePayloadMapCacheInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::ComAdobeGraniteWorkflowCorePayloadMapCacheInfo()
{
	//__init();
}

ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::~ComAdobeGraniteWorkflowCorePayloadMapCacheInfo()
{
	//__cleanup();
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new ComAdobeGraniteWorkflowCorePayloadMapCacheProperties();
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::__cleanup()
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
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("ComAdobeGraniteWorkflowCorePayloadMapCacheProperties")) {
			jsonToValue(&properties, node, "ComAdobeGraniteWorkflowCorePayloadMapCacheProperties", "ComAdobeGraniteWorkflowCorePayloadMapCacheProperties");
		} else {
			
			ComAdobeGraniteWorkflowCorePayloadMapCacheProperties* obj = static_cast<ComAdobeGraniteWorkflowCorePayloadMapCacheProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::ComAdobeGraniteWorkflowCorePayloadMapCacheInfo(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::toJson()
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
	if (isprimitive("ComAdobeGraniteWorkflowCorePayloadMapCacheProperties")) {
		ComAdobeGraniteWorkflowCorePayloadMapCacheProperties obj = getProperties();
		node = converttoJson(&obj, "ComAdobeGraniteWorkflowCorePayloadMapCacheProperties", "");
	}
	else {
		
		ComAdobeGraniteWorkflowCorePayloadMapCacheProperties obj = static_cast<ComAdobeGraniteWorkflowCorePayloadMapCacheProperties> (getProperties());
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
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::setDescription(std::string  description)
{
	this->description = description;
}

ComAdobeGraniteWorkflowCorePayloadMapCacheProperties
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteWorkflowCorePayloadMapCacheInfo::setProperties(ComAdobeGraniteWorkflowCorePayloadMapCacheProperties  properties)
{
	this->properties = properties;
}


