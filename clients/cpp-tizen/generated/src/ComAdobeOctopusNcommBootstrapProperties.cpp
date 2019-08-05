#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeOctopusNcommBootstrapProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeOctopusNcommBootstrapProperties::ComAdobeOctopusNcommBootstrapProperties()
{
	//__init();
}

ComAdobeOctopusNcommBootstrapProperties::~ComAdobeOctopusNcommBootstrapProperties()
{
	//__cleanup();
}

void
ComAdobeOctopusNcommBootstrapProperties::__init()
{
	//maxConnections = new ConfigNodePropertyInteger();
	//maxRequests = new ConfigNodePropertyInteger();
	//requestTimeout = new ConfigNodePropertyInteger();
	//requestRetries = new ConfigNodePropertyInteger();
	//launchTimeout = new ConfigNodePropertyInteger();
}

void
ComAdobeOctopusNcommBootstrapProperties::__cleanup()
{
	//if(maxConnections != NULL) {
	//
	//delete maxConnections;
	//maxConnections = NULL;
	//}
	//if(maxRequests != NULL) {
	//
	//delete maxRequests;
	//maxRequests = NULL;
	//}
	//if(requestTimeout != NULL) {
	//
	//delete requestTimeout;
	//requestTimeout = NULL;
	//}
	//if(requestRetries != NULL) {
	//
	//delete requestRetries;
	//requestRetries = NULL;
	//}
	//if(launchTimeout != NULL) {
	//
	//delete launchTimeout;
	//launchTimeout = NULL;
	//}
	//
}

void
ComAdobeOctopusNcommBootstrapProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maxConnectionsKey = "maxConnections";
	node = json_object_get_member(pJsonObject, maxConnectionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxConnections, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxConnections);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxRequestsKey = "maxRequests";
	node = json_object_get_member(pJsonObject, maxRequestsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxRequests, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxRequests);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *requestTimeoutKey = "requestTimeout";
	node = json_object_get_member(pJsonObject, requestTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&requestTimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&requestTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *requestRetriesKey = "requestRetries";
	node = json_object_get_member(pJsonObject, requestRetriesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&requestRetries, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&requestRetries);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *launchTimeoutKey = "launchTimeout";
	node = json_object_get_member(pJsonObject, launchTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&launchTimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&launchTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeOctopusNcommBootstrapProperties::ComAdobeOctopusNcommBootstrapProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeOctopusNcommBootstrapProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxConnections();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxConnections());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxConnectionsKey = "maxConnections";
	json_object_set_member(pJsonObject, maxConnectionsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxRequests();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxRequests());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxRequestsKey = "maxRequests";
	json_object_set_member(pJsonObject, maxRequestsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRequestTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRequestTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requestTimeoutKey = "requestTimeout";
	json_object_set_member(pJsonObject, requestTimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRequestRetries();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRequestRetries());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requestRetriesKey = "requestRetries";
	json_object_set_member(pJsonObject, requestRetriesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getLaunchTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getLaunchTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *launchTimeoutKey = "launchTimeout";
	json_object_set_member(pJsonObject, launchTimeoutKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeOctopusNcommBootstrapProperties::getMaxConnections()
{
	return maxConnections;
}

void
ComAdobeOctopusNcommBootstrapProperties::setMaxConnections(ConfigNodePropertyInteger  maxConnections)
{
	this->maxConnections = maxConnections;
}

ConfigNodePropertyInteger
ComAdobeOctopusNcommBootstrapProperties::getMaxRequests()
{
	return maxRequests;
}

void
ComAdobeOctopusNcommBootstrapProperties::setMaxRequests(ConfigNodePropertyInteger  maxRequests)
{
	this->maxRequests = maxRequests;
}

ConfigNodePropertyInteger
ComAdobeOctopusNcommBootstrapProperties::getRequestTimeout()
{
	return requestTimeout;
}

void
ComAdobeOctopusNcommBootstrapProperties::setRequestTimeout(ConfigNodePropertyInteger  requestTimeout)
{
	this->requestTimeout = requestTimeout;
}

ConfigNodePropertyInteger
ComAdobeOctopusNcommBootstrapProperties::getRequestRetries()
{
	return requestRetries;
}

void
ComAdobeOctopusNcommBootstrapProperties::setRequestRetries(ConfigNodePropertyInteger  requestRetries)
{
	this->requestRetries = requestRetries;
}

ConfigNodePropertyInteger
ComAdobeOctopusNcommBootstrapProperties::getLaunchTimeout()
{
	return launchTimeout;
}

void
ComAdobeOctopusNcommBootstrapProperties::setLaunchTimeout(ConfigNodePropertyInteger  launchTimeout)
{
	this->launchTimeout = launchTimeout;
}


