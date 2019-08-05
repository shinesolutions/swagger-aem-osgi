#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo()
{
	//__init();
}

ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::~ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo()
{
	//__cleanup();
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties();
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::__cleanup()
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
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties")) {
			jsonToValue(&properties, node, "ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties", "ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties");
		} else {
			
			ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties* obj = static_cast<ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::toJson()
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
	if (isprimitive("ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties")) {
		ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties obj = getProperties();
		node = converttoJson(&obj, "ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties", "");
	}
	else {
		
		ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties obj = static_cast<ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties> (getProperties());
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
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::setDescription(std::string  description)
{
	this->description = description;
}

ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo::setProperties(ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties  properties)
{
	this->properties = properties;
}


