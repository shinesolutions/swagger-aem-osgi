#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqReplicationContentStaticContentBuilderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqReplicationContentStaticContentBuilderProperties::ComDayCqReplicationContentStaticContentBuilderProperties()
{
	//__init();
}

ComDayCqReplicationContentStaticContentBuilderProperties::~ComDayCqReplicationContentStaticContentBuilderProperties()
{
	//__cleanup();
}

void
ComDayCqReplicationContentStaticContentBuilderProperties::__init()
{
	//host = new ConfigNodePropertyString();
	//port = new ConfigNodePropertyInteger();
}

void
ComDayCqReplicationContentStaticContentBuilderProperties::__cleanup()
{
	//if(host != NULL) {
	//
	//delete host;
	//host = NULL;
	//}
	//if(port != NULL) {
	//
	//delete port;
	//port = NULL;
	//}
	//
}

void
ComDayCqReplicationContentStaticContentBuilderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hostKey = "host";
	node = json_object_get_member(pJsonObject, hostKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&host, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&host);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *portKey = "port";
	node = json_object_get_member(pJsonObject, portKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&port, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&port);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqReplicationContentStaticContentBuilderProperties::ComDayCqReplicationContentStaticContentBuilderProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqReplicationContentStaticContentBuilderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHost();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHost());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hostKey = "host";
	json_object_set_member(pJsonObject, hostKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPort();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPort());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *portKey = "port";
	json_object_set_member(pJsonObject, portKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqReplicationContentStaticContentBuilderProperties::getHost()
{
	return host;
}

void
ComDayCqReplicationContentStaticContentBuilderProperties::setHost(ConfigNodePropertyString  host)
{
	this->host = host;
}

ConfigNodePropertyInteger
ComDayCqReplicationContentStaticContentBuilderProperties::getPort()
{
	return port;
}

void
ComDayCqReplicationContentStaticContentBuilderProperties::setPort(ConfigNodePropertyInteger  port)
{
	this->port = port;
}


