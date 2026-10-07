

#include "ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.h"

using namespace Tiny;

ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties()
{
	name = ConfigNodePropertyString();
	serviceName = ConfigNodePropertyString();
	userId = ConfigNodePropertyString();
	accessTokenProvidertarget = ConfigNodePropertyString();
}

ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::~ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties()
{

}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *serviceNameKey = "serviceName";

    if(object.has_key(serviceNameKey))
    {
        bourne::json value = object[serviceNameKey];




        ConfigNodePropertyString* obj = &serviceName;
		obj->fromJson(value.dump());

    }

    const char *userIdKey = "userId";

    if(object.has_key(userIdKey))
    {
        bourne::json value = object[userIdKey];




        ConfigNodePropertyString* obj = &userId;
		obj->fromJson(value.dump());

    }

    const char *accessTokenProvidertargetKey = "accessTokenProvider.target";

    if(object.has_key(accessTokenProvidertargetKey))
    {
        bourne::json value = object[accessTokenProvidertargetKey];




        ConfigNodePropertyString* obj = &accessTokenProvidertarget;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["serviceName"] = getServiceName().toJson();






	object["userId"] = getUserId().toJson();






	object["accessTokenProvidertarget"] = getAccessTokenProvidertarget().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::getName()
{
	return name;
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::getServiceName()
{
	return serviceName;
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::setServiceName(ConfigNodePropertyString serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::getUserId()
{
	return userId;
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::setUserId(ConfigNodePropertyString userId)
{
	this->userId = userId;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::getAccessTokenProvidertarget()
{
	return accessTokenProvidertarget;
}

void
ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties::setAccessTokenProvidertarget(ConfigNodePropertyString accessTokenProvidertarget)
{
	this->accessTokenProvidertarget = accessTokenProvidertarget;
}



