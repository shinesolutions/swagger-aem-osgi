#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties()
{
	//__init();
}

OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::~OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties()
{
	//__cleanup();
}

void
OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::__init()
{
	//javanamingfactoryinitial = new ConfigNodePropertyString();
	//javanamingproviderurl = new ConfigNodePropertyString();
}

void
OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::__cleanup()
{
	//if(javanamingfactoryinitial != NULL) {
	//
	//delete javanamingfactoryinitial;
	//javanamingfactoryinitial = NULL;
	//}
	//if(javanamingproviderurl != NULL) {
	//
	//delete javanamingproviderurl;
	//javanamingproviderurl = NULL;
	//}
	//
}

void
OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *javanamingfactoryinitialKey = "java.naming.factory.initial";
	node = json_object_get_member(pJsonObject, javanamingfactoryinitialKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&javanamingfactoryinitial, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&javanamingfactoryinitial);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *javanamingproviderurlKey = "java.naming.provider.url";
	node = json_object_get_member(pJsonObject, javanamingproviderurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&javanamingproviderurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&javanamingproviderurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJavanamingfactoryinitial();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJavanamingfactoryinitial());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *javanamingfactoryinitialKey = "java.naming.factory.initial";
	json_object_set_member(pJsonObject, javanamingfactoryinitialKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJavanamingproviderurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJavanamingproviderurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *javanamingproviderurlKey = "java.naming.provider.url";
	json_object_set_member(pJsonObject, javanamingproviderurlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::getJavanamingfactoryinitial()
{
	return javanamingfactoryinitial;
}

void
OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::setJavanamingfactoryinitial(ConfigNodePropertyString  javanamingfactoryinitial)
{
	this->javanamingfactoryinitial = javanamingfactoryinitial;
}

ConfigNodePropertyString
OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::getJavanamingproviderurl()
{
	return javanamingproviderurl;
}

void
OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties::setJavanamingproviderurl(ConfigNodePropertyString  javanamingproviderurl)
{
	this->javanamingproviderurl = javanamingproviderurl;
}


