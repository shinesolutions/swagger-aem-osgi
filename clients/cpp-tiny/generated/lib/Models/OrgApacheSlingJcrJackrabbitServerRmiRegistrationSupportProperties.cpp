

#include "OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.h"

using namespace Tiny;

OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties()
{
	port = ConfigNodePropertyInteger();
}

OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::~OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties()
{

}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *portKey = "port";

    if(object.has_key(portKey))
    {
        bourne::json value = object[portKey];




        ConfigNodePropertyInteger* obj = &port;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["port"] = getPort().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::getPort()
{
	return port;
}

void
OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties::setPort(ConfigNodePropertyInteger port)
{
	this->port = port;
}



