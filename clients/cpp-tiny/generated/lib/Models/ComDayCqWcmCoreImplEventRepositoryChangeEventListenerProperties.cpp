

#include "ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties()
{
	paths = ConfigNodePropertyArray();
	excludedPaths = ConfigNodePropertyArray();
}

ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::~ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties()
{

}

void
ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathsKey = "paths";

    if(object.has_key(pathsKey))
    {
        bourne::json value = object[pathsKey];




        ConfigNodePropertyArray* obj = &paths;
		obj->fromJson(value.dump());

    }

    const char *excludedPathsKey = "excludedPaths";

    if(object.has_key(excludedPathsKey))
    {
        bourne::json value = object[excludedPathsKey];




        ConfigNodePropertyArray* obj = &excludedPaths;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["paths"] = getPaths().toJson();






	object["excludedPaths"] = getExcludedPaths().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::getPaths()
{
	return paths;
}

void
ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::setPaths(ConfigNodePropertyArray paths)
{
	this->paths = paths;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::getExcludedPaths()
{
	return excludedPaths;
}

void
ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties::setExcludedPaths(ConfigNodePropertyArray excludedPaths)
{
	this->excludedPaths = excludedPaths;
}



