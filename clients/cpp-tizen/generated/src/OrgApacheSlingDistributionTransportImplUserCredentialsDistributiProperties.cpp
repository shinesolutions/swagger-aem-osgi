#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties()
{
	//__init();
}

OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::~OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//username = new ConfigNodePropertyString();
	//password = new ConfigNodePropertyString();
}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//if(password != NULL) {
	//
	//delete password;
	//password = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::fromJson(char* jsonStr)
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
	const gchar *usernameKey = "username";
	node = json_object_get_member(pJsonObject, usernameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&username, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&username);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passwordKey = "password";
	node = json_object_get_member(pJsonObject, passwordKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&password, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&password);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::toJson()
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
		ConfigNodePropertyString obj = getUsername();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUsername());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usernameKey = "username";
	json_object_set_member(pJsonObject, usernameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPassword();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPassword());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passwordKey = "password";
	json_object_set_member(pJsonObject, passwordKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::getUsername()
{
	return username;
}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::setUsername(ConfigNodePropertyString  username)
{
	this->username = username;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::getPassword()
{
	return password;
}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::setPassword(ConfigNodePropertyString  password)
{
	this->password = password;
}


