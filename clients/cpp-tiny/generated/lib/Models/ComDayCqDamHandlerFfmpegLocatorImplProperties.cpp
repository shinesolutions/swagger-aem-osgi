

#include "ComDayCqDamHandlerFfmpegLocatorImplProperties.h"

using namespace Tiny;

ComDayCqDamHandlerFfmpegLocatorImplProperties::ComDayCqDamHandlerFfmpegLocatorImplProperties()
{
	executablesearchpath = ConfigNodePropertyArray();
}

ComDayCqDamHandlerFfmpegLocatorImplProperties::ComDayCqDamHandlerFfmpegLocatorImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamHandlerFfmpegLocatorImplProperties::~ComDayCqDamHandlerFfmpegLocatorImplProperties()
{

}

void
ComDayCqDamHandlerFfmpegLocatorImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *executablesearchpathKey = "executable.searchpath";

    if(object.has_key(executablesearchpathKey))
    {
        bourne::json value = object[executablesearchpathKey];




        ConfigNodePropertyArray* obj = &executablesearchpath;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamHandlerFfmpegLocatorImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["executablesearchpath"] = getExecutablesearchpath().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqDamHandlerFfmpegLocatorImplProperties::getExecutablesearchpath()
{
	return executablesearchpath;
}

void
ComDayCqDamHandlerFfmpegLocatorImplProperties::setExecutablesearchpath(ConfigNodePropertyArray executablesearchpath)
{
	this->executablesearchpath = executablesearchpath;
}



