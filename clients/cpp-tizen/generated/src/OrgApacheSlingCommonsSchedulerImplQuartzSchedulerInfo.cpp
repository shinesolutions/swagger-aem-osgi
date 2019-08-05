#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo()
{
	//__init();
}

OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::~OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo()
{
	//__cleanup();
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties();
	//bundle_location = std::string();
	//service_location = std::string();
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::__cleanup()
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
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties")) {
			jsonToValue(&properties, node, "OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties", "OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties");
		} else {
			
			OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties* obj = static_cast<OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
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

OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::toJson()
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
	if (isprimitive("OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties")) {
		OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties obj = getProperties();
		node = converttoJson(&obj, "OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties", "");
	}
	else {
		
		OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties obj = static_cast<OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties> (getProperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *propertiesKey = "properties";
	json_object_set_member(pJsonObject, propertiesKey, node);
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
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::setDescription(std::string  description)
{
	this->description = description;
}

OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::setProperties(OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties  properties)
{
	this->properties = properties;
}

std::string
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::setBundleLocation(std::string  bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo::setServiceLocation(std::string  service_location)
{
	this->service_location = service_location;
}


