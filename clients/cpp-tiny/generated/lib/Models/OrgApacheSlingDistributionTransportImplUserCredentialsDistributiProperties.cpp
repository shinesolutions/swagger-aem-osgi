

#include "OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties()
{
	name = ConfigNodePropertyString();
	username = ConfigNodePropertyString();
	password = ConfigNodePropertyString();
}

OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::~OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties()
{

}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *usernameKey = "username";

    if(object.has_key(usernameKey))
    {
        bourne::json value = object[usernameKey];




        ConfigNodePropertyString* obj = &username;
		obj->fromJson(value.dump());

    }

    const char *passwordKey = "password";

    if(object.has_key(passwordKey))
    {
        bourne::json value = object[passwordKey];




        ConfigNodePropertyString* obj = &password;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["username"] = getUsername().toJson();






	object["password"] = getPassword().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::getUsername()
{
	return username;
}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::setUsername(ConfigNodePropertyString username)
{
	this->username = username;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::getPassword()
{
	return password;
}

void
OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties::setPassword(ConfigNodePropertyString password)
{
	this->password = password;
}



