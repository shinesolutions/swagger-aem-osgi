

#include "ComDayCqWcmCoreImplEventPagePostProcessorProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplEventPagePostProcessorProperties::ComDayCqWcmCoreImplEventPagePostProcessorProperties()
{
	paths = ConfigNodePropertyArray();
}

ComDayCqWcmCoreImplEventPagePostProcessorProperties::ComDayCqWcmCoreImplEventPagePostProcessorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplEventPagePostProcessorProperties::~ComDayCqWcmCoreImplEventPagePostProcessorProperties()
{

}

void
ComDayCqWcmCoreImplEventPagePostProcessorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathsKey = "paths";

    if(object.has_key(pathsKey))
    {
        bourne::json value = object[pathsKey];




        ConfigNodePropertyArray* obj = &paths;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplEventPagePostProcessorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["paths"] = getPaths().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmCoreImplEventPagePostProcessorProperties::getPaths()
{
	return paths;
}

void
ComDayCqWcmCoreImplEventPagePostProcessorProperties::setPaths(ConfigNodePropertyArray paths)
{
	this->paths = paths;
}



