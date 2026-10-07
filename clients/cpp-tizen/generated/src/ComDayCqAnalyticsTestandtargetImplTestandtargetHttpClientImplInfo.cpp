#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo()
{
	//__init();
}

ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::~ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo()
{
	//__cleanup();
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties();
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::__cleanup()
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
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties")) {
			jsonToValue(&properties, node, "ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties", "ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties");
		} else {
			
			ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties* obj = static_cast<ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::toJson()
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
	if (isprimitive("ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties")) {
		ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties obj = getProperties();
		node = converttoJson(&obj, "ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties", "");
	}
	else {
		
		ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties obj = static_cast<ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties> (getProperties());
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
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::getPid()
{
	return pid;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::getTitle()
{
	return title;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::getDescription()
{
	return description;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::setDescription(std::string  description)
{
	this->description = description;
}

ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo::setProperties(ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties  properties)
{
	this->properties = properties;
}


