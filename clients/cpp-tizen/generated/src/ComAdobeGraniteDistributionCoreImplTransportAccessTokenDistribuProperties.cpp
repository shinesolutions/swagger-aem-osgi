#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties()
{
	//__init();
}

ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::~ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//serviceName = new ConfigNodePropertyString();
	//userId = new ConfigNodePropertyString();
	//accessTokenProvidertarget = new ConfigNodePropertyString();
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(serviceName != NULL) {
	//
	//delete serviceName;
	//serviceName = NULL;
	//}
	//if(userId != NULL) {
	//
	//delete userId;
	//userId = NULL;
	//}
	//if(accessTokenProvidertarget != NULL) {
	//
	//delete accessTokenProvidertarget;
	//accessTokenProvidertarget = NULL;
	//}
	//
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&name, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *serviceNameKey = "serviceName";
	node = json_object_get_member(pJsonObject, serviceNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&serviceName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&serviceName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userIdKey = "userId";
	node = json_object_get_member(pJsonObject, userIdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&userId, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&userId);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *accessTokenProvidertargetKey = "accessTokenProvider.target";
	node = json_object_get_member(pJsonObject, accessTokenProvidertargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&accessTokenProvidertarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&accessTokenProvidertarget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getServiceName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getServiceName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *serviceNameKey = "serviceName";
	json_object_set_member(pJsonObject, serviceNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUserId();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUserId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userIdKey = "userId";
	json_object_set_member(pJsonObject, userIdKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAccessTokenProvidertarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAccessTokenProvidertarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *accessTokenProvidertargetKey = "accessTokenProvider.target";
	json_object_set_member(pJsonObject, accessTokenProvidertargetKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::getName()
{
	return name;
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::getServiceName()
{
	return serviceName;
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::setServiceName(ConfigNodePropertyString  serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::getUserId()
{
	return userId;
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::setUserId(ConfigNodePropertyString  userId)
{
	this->userId = userId;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::getAccessTokenProvidertarget()
{
	return accessTokenProvidertarget;
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::setAccessTokenProvidertarget(ConfigNodePropertyString  accessTokenProvidertarget)
{
	this->accessTokenProvidertarget = accessTokenProvidertarget;
}


