#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties()
{
	//__init();
}

OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::~OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties()
{
	//__cleanup();
}

void
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::__init()
{
	//users = new ConfigNodePropertyArray();
	//groups = new ConfigNodePropertyArray();
}

void
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::__cleanup()
{
	//if(users != NULL) {
	//
	//delete users;
	//users = NULL;
	//}
	//if(groups != NULL) {
	//
	//delete groups;
	//groups = NULL;
	//}
	//
}

void
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *usersKey = "users";
	node = json_object_get_member(pJsonObject, usersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&users, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&users);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *groupsKey = "groups";
	node = json_object_get_member(pJsonObject, groupsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&groups, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&groups);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getUsers();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getUsers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usersKey = "users";
	json_object_set_member(pJsonObject, usersKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getGroups();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getGroups());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupsKey = "groups";
	json_object_set_member(pJsonObject, groupsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::getUsers()
{
	return users;
}

void
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::setUsers(ConfigNodePropertyArray  users)
{
	this->users = users;
}

ConfigNodePropertyArray
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::getGroups()
{
	return groups;
}

void
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::setGroups(ConfigNodePropertyArray  groups)
{
	this->groups = groups;
}


