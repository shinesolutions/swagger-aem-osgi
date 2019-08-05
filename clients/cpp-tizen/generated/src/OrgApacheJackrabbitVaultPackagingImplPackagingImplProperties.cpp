#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties()
{
	//__init();
}

OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::~OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::__init()
{
	//packageRoots = new ConfigNodePropertyArray();
}

void
OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::__cleanup()
{
	//if(packageRoots != NULL) {
	//
	//delete packageRoots;
	//packageRoots = NULL;
	//}
	//
}

void
OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *packageRootsKey = "packageRoots";
	node = json_object_get_member(pJsonObject, packageRootsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&packageRoots, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&packageRoots);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPackageRoots();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPackageRoots());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *packageRootsKey = "packageRoots";
	json_object_set_member(pJsonObject, packageRootsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::getPackageRoots()
{
	return packageRoots;
}

void
OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::setPackageRoots(ConfigNodePropertyArray  packageRoots)
{
	this->packageRoots = packageRoots;
}


