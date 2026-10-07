#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo()
{
	//__init();
}

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::~ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo()
{
	//__cleanup();
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties();
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::__cleanup()
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
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties")) {
			jsonToValue(&properties, node, "ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties", "ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties");
		} else {
			
			ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties* obj = static_cast<ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::toJson()
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
	if (isprimitive("ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties")) {
		ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties obj = getProperties();
		node = converttoJson(&obj, "ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties", "");
	}
	else {
		
		ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties obj = static_cast<ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties> (getProperties());
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
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::setDescription(std::string  description)
{
	this->description = description;
}

ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo::setProperties(ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties  properties)
{
	this->properties = properties;
}


