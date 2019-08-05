#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties()
{
	//__init();
}

OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::~OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::__init()
{
	//homePath = new ConfigNodePropertyString();
}

void
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::__cleanup()
{
	//if(homePath != NULL) {
	//
	//delete homePath;
	//homePath = NULL;
	//}
	//
}

void
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *homePathKey = "homePath";
	node = json_object_get_member(pJsonObject, homePathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&homePath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&homePath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHomePath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHomePath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *homePathKey = "homePath";
	json_object_set_member(pJsonObject, homePathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::getHomePath()
{
	return homePath;
}

void
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties::setHomePath(ConfigNodePropertyString  homePath)
{
	this->homePath = homePath;
}


