

#include "OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.h"

using namespace Tiny;

OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties()
{
	users = ConfigNodePropertyArray();
	groups = ConfigNodePropertyArray();
}

OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::~OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties()
{

}

void
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *usersKey = "users";

    if(object.has_key(usersKey))
    {
        bourne::json value = object[usersKey];




        ConfigNodePropertyArray* obj = &users;
		obj->fromJson(value.dump());

    }

    const char *groupsKey = "groups";

    if(object.has_key(groupsKey))
    {
        bourne::json value = object[groupsKey];




        ConfigNodePropertyArray* obj = &groups;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["users"] = getUsers().toJson();






	object["groups"] = getGroups().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::getUsers()
{
	return users;
}

void
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::setUsers(ConfigNodePropertyArray users)
{
	this->users = users;
}

ConfigNodePropertyArray
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::getGroups()
{
	return groups;
}

void
OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties::setGroups(ConfigNodePropertyArray groups)
{
	this->groups = groups;
}



