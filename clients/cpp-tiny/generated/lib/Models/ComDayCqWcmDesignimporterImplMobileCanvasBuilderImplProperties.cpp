

#include "ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.h"

using namespace Tiny;

ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties()
{
	filepattern = ConfigNodePropertyString();
	devicegroups = ConfigNodePropertyArray();
	buildpagenodes = ConfigNodePropertyBoolean();
	buildclientlibs = ConfigNodePropertyBoolean();
	buildcanvascomponent = ConfigNodePropertyBoolean();
}

ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::~ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties()
{

}

void
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *filepatternKey = "filepattern";

    if(object.has_key(filepatternKey))
    {
        bourne::json value = object[filepatternKey];




        ConfigNodePropertyString* obj = &filepattern;
		obj->fromJson(value.dump());

    }

    const char *devicegroupsKey = "device.groups";

    if(object.has_key(devicegroupsKey))
    {
        bourne::json value = object[devicegroupsKey];




        ConfigNodePropertyArray* obj = &devicegroups;
		obj->fromJson(value.dump());

    }

    const char *buildpagenodesKey = "build.page.nodes";

    if(object.has_key(buildpagenodesKey))
    {
        bourne::json value = object[buildpagenodesKey];




        ConfigNodePropertyBoolean* obj = &buildpagenodes;
		obj->fromJson(value.dump());

    }

    const char *buildclientlibsKey = "build.client.libs";

    if(object.has_key(buildclientlibsKey))
    {
        bourne::json value = object[buildclientlibsKey];




        ConfigNodePropertyBoolean* obj = &buildclientlibs;
		obj->fromJson(value.dump());

    }

    const char *buildcanvascomponentKey = "build.canvas.component";

    if(object.has_key(buildcanvascomponentKey))
    {
        bourne::json value = object[buildcanvascomponentKey];




        ConfigNodePropertyBoolean* obj = &buildcanvascomponent;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["filepattern"] = getFilepattern().toJson();






	object["devicegroups"] = getDevicegroups().toJson();






	object["buildpagenodes"] = getBuildpagenodes().toJson();






	object["buildclientlibs"] = getBuildclientlibs().toJson();






	object["buildcanvascomponent"] = getBuildcanvascomponent().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::getFilepattern()
{
	return filepattern;
}

void
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::setFilepattern(ConfigNodePropertyString filepattern)
{
	this->filepattern = filepattern;
}

ConfigNodePropertyArray
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::getDevicegroups()
{
	return devicegroups;
}

void
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::setDevicegroups(ConfigNodePropertyArray devicegroups)
{
	this->devicegroups = devicegroups;
}

ConfigNodePropertyBoolean
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::getBuildpagenodes()
{
	return buildpagenodes;
}

void
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::setBuildpagenodes(ConfigNodePropertyBoolean buildpagenodes)
{
	this->buildpagenodes = buildpagenodes;
}

ConfigNodePropertyBoolean
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::getBuildclientlibs()
{
	return buildclientlibs;
}

void
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::setBuildclientlibs(ConfigNodePropertyBoolean buildclientlibs)
{
	this->buildclientlibs = buildclientlibs;
}

ConfigNodePropertyBoolean
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::getBuildcanvascomponent()
{
	return buildcanvascomponent;
}

void
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties::setBuildcanvascomponent(ConfigNodePropertyBoolean buildcanvascomponent)
{
	this->buildcanvascomponent = buildcanvascomponent;
}



