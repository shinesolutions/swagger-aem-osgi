#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties()
{
	//__init();
}

ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::~ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties()
{
	//__cleanup();
}

void
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::__init()
{
	//maxConnections = new ConfigNodePropertyString();
	//maxRequests = new ConfigNodePropertyString();
	//requestTimeout = new ConfigNodePropertyString();
	//logDir = new ConfigNodePropertyString();
}

void
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::__cleanup()
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
	//if(logDir != NULL) {
	//
	//delete logDir;
	//logDir = NULL;
	//}
	//
}

void
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maxConnectionsKey = "maxConnections";
	node = json_object_get_member(pJsonObject, maxConnectionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&maxConnections, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&maxConnections);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxRequestsKey = "maxRequests";
	node = json_object_get_member(pJsonObject, maxRequestsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&maxRequests, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&maxRequests);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *requestTimeoutKey = "requestTimeout";
	node = json_object_get_member(pJsonObject, requestTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&requestTimeout, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&requestTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *logDirKey = "logDir";
	node = json_object_get_member(pJsonObject, logDirKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&logDir, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&logDir);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getMaxConnections();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getMaxConnections());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxConnectionsKey = "maxConnections";
	json_object_set_member(pJsonObject, maxConnectionsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getMaxRequests();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getMaxRequests());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxRequestsKey = "maxRequests";
	json_object_set_member(pJsonObject, maxRequestsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRequestTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRequestTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requestTimeoutKey = "requestTimeout";
	json_object_set_member(pJsonObject, requestTimeoutKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLogDir();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLogDir());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *logDirKey = "logDir";
	json_object_set_member(pJsonObject, logDirKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::getMaxConnections()
{
	return maxConnections;
}

void
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::setMaxConnections(ConfigNodePropertyString  maxConnections)
{
	this->maxConnections = maxConnections;
}

ConfigNodePropertyString
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::getMaxRequests()
{
	return maxRequests;
}

void
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::setMaxRequests(ConfigNodePropertyString  maxRequests)
{
	this->maxRequests = maxRequests;
}

ConfigNodePropertyString
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::getRequestTimeout()
{
	return requestTimeout;
}

void
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::setRequestTimeout(ConfigNodePropertyString  requestTimeout)
{
	this->requestTimeout = requestTimeout;
}

ConfigNodePropertyString
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::getLogDir()
{
	return logDir;
}

void
ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties::setLogDir(ConfigNodePropertyString  logDir)
{
	this->logDir = logDir;
}


