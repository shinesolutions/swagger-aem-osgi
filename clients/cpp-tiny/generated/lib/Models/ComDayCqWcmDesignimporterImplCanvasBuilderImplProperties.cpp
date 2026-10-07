

#include "ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.h"

using namespace Tiny;

ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties()
{
	filepattern = ConfigNodePropertyString();
	buildpagenodes = ConfigNodePropertyBoolean();
	buildclientlibs = ConfigNodePropertyBoolean();
	buildcanvascomponent = ConfigNodePropertyBoolean();
}

ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::~ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties()
{

}

void
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *filepatternKey = "filepattern";

    if(object.has_key(filepatternKey))
    {
        bourne::json value = object[filepatternKey];




        ConfigNodePropertyString* obj = &filepattern;
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
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["filepattern"] = getFilepattern().toJson();






	object["buildpagenodes"] = getBuildpagenodes().toJson();






	object["buildclientlibs"] = getBuildclientlibs().toJson();






	object["buildcanvascomponent"] = getBuildcanvascomponent().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::getFilepattern()
{
	return filepattern;
}

void
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::setFilepattern(ConfigNodePropertyString filepattern)
{
	this->filepattern = filepattern;
}

ConfigNodePropertyBoolean
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::getBuildpagenodes()
{
	return buildpagenodes;
}

void
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::setBuildpagenodes(ConfigNodePropertyBoolean buildpagenodes)
{
	this->buildpagenodes = buildpagenodes;
}

ConfigNodePropertyBoolean
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::getBuildclientlibs()
{
	return buildclientlibs;
}

void
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::setBuildclientlibs(ConfigNodePropertyBoolean buildclientlibs)
{
	this->buildclientlibs = buildclientlibs;
}

ConfigNodePropertyBoolean
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::getBuildcanvascomponent()
{
	return buildcanvascomponent;
}

void
ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties::setBuildcanvascomponent(ConfigNodePropertyBoolean buildcanvascomponent)
{
	this->buildcanvascomponent = buildcanvascomponent;
}



