

#include "OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.h"

using namespace Tiny;

OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties()
{
	maxrecursionlevels = ConfigNodePropertyInteger();
}

OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::~OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties()
{

}

void
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maxrecursionlevelsKey = "max.recursion.levels";

    if(object.has_key(maxrecursionlevelsKey))
    {
        bourne::json value = object[maxrecursionlevelsKey];




        ConfigNodePropertyInteger* obj = &maxrecursionlevels;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maxrecursionlevels"] = getMaxrecursionlevels().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::getMaxrecursionlevels()
{
	return maxrecursionlevels;
}

void
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties::setMaxrecursionlevels(ConfigNodePropertyInteger maxrecursionlevels)
{
	this->maxrecursionlevels = maxrecursionlevels;
}



