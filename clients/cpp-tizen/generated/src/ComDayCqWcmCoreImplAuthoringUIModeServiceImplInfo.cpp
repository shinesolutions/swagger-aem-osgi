#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo()
{
	//__init();
}

ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::~ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties();
	//additionalProperties = std::string();
	//bundle_location = std::string();
	//service_location = std::string();
}

void
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::__cleanup()
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
	//if(additionalProperties != NULL) {
	//
	//delete additionalProperties;
	//additionalProperties = NULL;
	//}
	//if(bundle_location != NULL) {
	//
	//delete bundle_location;
	//bundle_location = NULL;
	//}
	//if(service_location != NULL) {
	//
	//delete service_location;
	//service_location = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties")) {
			jsonToValue(&properties, node, "ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties", "ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties");
		} else {
			
			ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties* obj = static_cast<ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *additionalPropertiesKey = "additionalProperties";
	node = json_object_get_member(pJsonObject, additionalPropertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&additionalProperties, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *bundle_locationKey = "bundle_location";
	node = json_object_get_member(pJsonObject, bundle_locationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&bundle_location, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *service_locationKey = "service_location";
	node = json_object_get_member(pJsonObject, service_locationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&service_location, node, "std::string", "");
		} else {
			
		}
	}
}

ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::toJson()
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
	if (isprimitive("ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties")) {
		ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties obj = getProperties();
		node = converttoJson(&obj, "ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties", "");
	}
	else {
		
		ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties obj = static_cast<ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties> (getProperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *propertiesKey = "properties";
	json_object_set_member(pJsonObject, propertiesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdditionalProperties();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *additionalPropertiesKey = "additionalProperties";
	json_object_set_member(pJsonObject, additionalPropertiesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBundleLocation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *bundle_locationKey = "bundle_location";
	json_object_set_member(pJsonObject, bundle_locationKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getServiceLocation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *service_locationKey = "service_location";
	json_object_set_member(pJsonObject, service_locationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::setDescription(std::string  description)
{
	this->description = description;
}

ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::setProperties(ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties  properties)
{
	this->properties = properties;
}

std::string
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::getAdditionalProperties()
{
	return additionalProperties;
}

void
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::setAdditionalProperties(std::string  additionalProperties)
{
	this->additionalProperties = additionalProperties;
}

std::string
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::getBundleLocation()
{
	return bundle_location;
}

void
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::setBundleLocation(std::string  bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::getServiceLocation()
{
	return service_location;
}

void
ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo::setServiceLocation(std::string  service_location)
{
	this->service_location = service_location;
}


