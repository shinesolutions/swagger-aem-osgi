#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo()
{
	//__init();
}

ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::~ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties();
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::__cleanup()
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
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties")) {
			jsonToValue(&properties, node, "ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties", "ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties");
		} else {
			
			ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties* obj = static_cast<ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::toJson()
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
	if (isprimitive("ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties")) {
		ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties obj = getProperties();
		node = converttoJson(&obj, "ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties", "");
	}
	else {
		
		ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties obj = static_cast<ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties> (getProperties());
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
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::setDescription(std::string  description)
{
	this->description = description;
}

ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo::setProperties(ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties  properties)
{
	this->properties = properties;
}


