

#include "ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.h"

using namespace Tiny;

ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties()
{
	name = ConfigNodePropertyString();
	username = ConfigNodePropertyString();
	encryptedPassword = ConfigNodePropertyString();
}

ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::~ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties()
{

}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::fromJson(std::string jsonObj)
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

    const char *encryptedPasswordKey = "encryptedPassword";

    if(object.has_key(encryptedPasswordKey))
    {
        bourne::json value = object[encryptedPasswordKey];




        ConfigNodePropertyString* obj = &encryptedPassword;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["username"] = getUsername().toJson();






	object["encryptedPassword"] = getEncryptedPassword().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::getName()
{
	return name;
}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::getUsername()
{
	return username;
}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::setUsername(ConfigNodePropertyString username)
{
	this->username = username;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::getEncryptedPassword()
{
	return encryptedPassword;
}

void
ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties::setEncryptedPassword(ConfigNodePropertyString encryptedPassword)
{
	this->encryptedPassword = encryptedPassword;
}



