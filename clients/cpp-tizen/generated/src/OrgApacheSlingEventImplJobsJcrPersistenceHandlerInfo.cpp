#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo()
{
	//__init();
}

OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::~OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo()
{
	//__cleanup();
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties();
	//bundle_location = std::string();
	//service_location = std::string();
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::__cleanup()
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
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties")) {
			jsonToValue(&properties, node, "OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties", "OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties");
		} else {
			
			OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties* obj = static_cast<OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties*> (&properties);
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

OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::toJson()
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
	if (isprimitive("OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties")) {
		OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties obj = getProperties();
		node = converttoJson(&obj, "OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties", "");
	}
	else {
		
		OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties obj = static_cast<OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties> (getProperties());
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
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::setDescription(std::string  description)
{
	this->description = description;
}

OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::setProperties(OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties  properties)
{
	this->properties = properties;
}

std::string
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::setBundleLocation(std::string  bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo::setServiceLocation(std::string  service_location)
{
	this->service_location = service_location;
}


