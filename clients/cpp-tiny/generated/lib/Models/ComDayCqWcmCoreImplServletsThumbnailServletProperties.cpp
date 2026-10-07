

#include "ComDayCqWcmCoreImplServletsThumbnailServletProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplServletsThumbnailServletProperties::ComDayCqWcmCoreImplServletsThumbnailServletProperties()
{
	workspace = ConfigNodePropertyString();
	dimensions = ConfigNodePropertyArray();
}

ComDayCqWcmCoreImplServletsThumbnailServletProperties::ComDayCqWcmCoreImplServletsThumbnailServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplServletsThumbnailServletProperties::~ComDayCqWcmCoreImplServletsThumbnailServletProperties()
{

}

void
ComDayCqWcmCoreImplServletsThumbnailServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *workspaceKey = "workspace";

    if(object.has_key(workspaceKey))
    {
        bourne::json value = object[workspaceKey];




        ConfigNodePropertyString* obj = &workspace;
		obj->fromJson(value.dump());

    }

    const char *dimensionsKey = "dimensions";

    if(object.has_key(dimensionsKey))
    {
        bourne::json value = object[dimensionsKey];




        ConfigNodePropertyArray* obj = &dimensions;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplServletsThumbnailServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["workspace"] = getWorkspace().toJson();






	object["dimensions"] = getDimensions().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmCoreImplServletsThumbnailServletProperties::getWorkspace()
{
	return workspace;
}

void
ComDayCqWcmCoreImplServletsThumbnailServletProperties::setWorkspace(ConfigNodePropertyString workspace)
{
	this->workspace = workspace;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplServletsThumbnailServletProperties::getDimensions()
{
	return dimensions;
}

void
ComDayCqWcmCoreImplServletsThumbnailServletProperties::setDimensions(ConfigNodePropertyArray dimensions)
{
	this->dimensions = dimensions;
}



