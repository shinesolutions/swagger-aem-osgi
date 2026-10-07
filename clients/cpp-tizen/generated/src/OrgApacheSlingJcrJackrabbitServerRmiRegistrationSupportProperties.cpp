#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties()
{
	//__init();
}

OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::~OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties()
{
	//__cleanup();
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::__init()
{
	//port = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::__cleanup()
{
	//if(port != NULL) {
	//
	//delete port;
	//port = NULL;
	//}
	//
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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

OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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

ConfigNodePropertyInteger
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::getPort()
{
	return port;
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::setPort(ConfigNodePropertyInteger  port)
{
	this->port = port;
}


