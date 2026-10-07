#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo()
{
	//__init();
}

ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::~ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo()
{
	//__cleanup();
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties();
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::__cleanup()
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
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::fromJson(char* jsonStr)
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
	

		if (isprimitive("ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties")) {
			jsonToValue(&properties, node, "ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties", "ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties");
		} else {
			
			ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties* obj = static_cast<ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::toJson()
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
	if (isprimitive("ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties")) {
		ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties obj = getProperties();
		node = converttoJson(&obj, "ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties", "");
	}
	else {
		
		ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties obj = static_cast<ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties> (getProperties());
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
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::setDescription(std::string  description)
{
	this->description = description;
}

ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo::setProperties(ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties  properties)
{
	this->properties = properties;
}


