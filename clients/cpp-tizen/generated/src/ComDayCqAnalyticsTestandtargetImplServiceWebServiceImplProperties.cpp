#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties()
{
	//__init();
}

ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::~ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties()
{
	//__cleanup();
}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::__init()
{
	//endpointUri = new ConfigNodePropertyString();
	//connectionTimeout = new ConfigNodePropertyInteger();
	//socketTimeout = new ConfigNodePropertyInteger();
}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::__cleanup()
{
	//if(endpointUri != NULL) {
	//
	//delete endpointUri;
	//endpointUri = NULL;
	//}
	//if(connectionTimeout != NULL) {
	//
	//delete connectionTimeout;
	//connectionTimeout = NULL;
	//}
	//if(socketTimeout != NULL) {
	//
	//delete socketTimeout;
	//socketTimeout = NULL;
	//}
	//
}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *endpointUriKey = "endpointUri";
	node = json_object_get_member(pJsonObject, endpointUriKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&endpointUri, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&endpointUri);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *connectionTimeoutKey = "connectionTimeout";
	node = json_object_get_member(pJsonObject, connectionTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&connectionTimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&connectionTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *socketTimeoutKey = "socketTimeout";
	node = json_object_get_member(pJsonObject, socketTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&socketTimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&socketTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEndpointUri();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEndpointUri());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *endpointUriKey = "endpointUri";
	json_object_set_member(pJsonObject, endpointUriKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getConnectionTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getConnectionTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *connectionTimeoutKey = "connectionTimeout";
	json_object_set_member(pJsonObject, connectionTimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSocketTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSocketTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *socketTimeoutKey = "socketTimeout";
	json_object_set_member(pJsonObject, socketTimeoutKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::getEndpointUri()
{
	return endpointUri;
}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::setEndpointUri(ConfigNodePropertyString  endpointUri)
{
	this->endpointUri = endpointUri;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::getConnectionTimeout()
{
	return connectionTimeout;
}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::setConnectionTimeout(ConfigNodePropertyInteger  connectionTimeout)
{
	this->connectionTimeout = connectionTimeout;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::getSocketTimeout()
{
	return socketTimeout;
}

void
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties::setSocketTimeout(ConfigNodePropertyInteger  socketTimeout)
{
	this->socketTimeout = socketTimeout;
}


