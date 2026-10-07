

#include "ComDayCqWcmCoreImplEventTemplatePostProcessorProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::ComDayCqWcmCoreImplEventTemplatePostProcessorProperties()
{
	paths = ConfigNodePropertyString();
}

ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::ComDayCqWcmCoreImplEventTemplatePostProcessorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::~ComDayCqWcmCoreImplEventTemplatePostProcessorProperties()
{

}

void
ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathsKey = "paths";

    if(object.has_key(pathsKey))
    {
        bourne::json value = object[pathsKey];




        ConfigNodePropertyString* obj = &paths;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["paths"] = getPaths().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::getPaths()
{
	return paths;
}

void
ComDayCqWcmCoreImplEventTemplatePostProcessorProperties::setPaths(ConfigNodePropertyString paths)
{
	this->paths = paths;
}



