

#include "OrgApacheSlingJmxProviderImplJMXResourceProviderProperties.h"

using namespace Tiny;

OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::OrgApacheSlingJmxProviderImplJMXResourceProviderProperties()
{
	providerroots = ConfigNodePropertyString();
}

OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::OrgApacheSlingJmxProviderImplJMXResourceProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::~OrgApacheSlingJmxProviderImplJMXResourceProviderProperties()
{

}

void
OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *providerrootsKey = "provider.roots";

    if(object.has_key(providerrootsKey))
    {
        bourne::json value = object[providerrootsKey];




        ConfigNodePropertyString* obj = &providerroots;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["providerroots"] = getProviderroots().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::getProviderroots()
{
	return providerroots;
}

void
OrgApacheSlingJmxProviderImplJMXResourceProviderProperties::setProviderroots(ConfigNodePropertyString providerroots)
{
	this->providerroots = providerroots;
}



