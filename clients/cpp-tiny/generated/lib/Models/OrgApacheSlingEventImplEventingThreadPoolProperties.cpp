

#include "OrgApacheSlingEventImplEventingThreadPoolProperties.h"

using namespace Tiny;

OrgApacheSlingEventImplEventingThreadPoolProperties::OrgApacheSlingEventImplEventingThreadPoolProperties()
{
	minPoolSize = ConfigNodePropertyInteger();
}

OrgApacheSlingEventImplEventingThreadPoolProperties::OrgApacheSlingEventImplEventingThreadPoolProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEventImplEventingThreadPoolProperties::~OrgApacheSlingEventImplEventingThreadPoolProperties()
{

}

void
OrgApacheSlingEventImplEventingThreadPoolProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *minPoolSizeKey = "minPoolSize";

    if(object.has_key(minPoolSizeKey))
    {
        bourne::json value = object[minPoolSizeKey];




        ConfigNodePropertyInteger* obj = &minPoolSize;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEventImplEventingThreadPoolProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["minPoolSize"] = getMinPoolSize().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingEventImplEventingThreadPoolProperties::getMinPoolSize()
{
	return minPoolSize;
}

void
OrgApacheSlingEventImplEventingThreadPoolProperties::setMinPoolSize(ConfigNodePropertyInteger minPoolSize)
{
	this->minPoolSize = minPoolSize;
}



