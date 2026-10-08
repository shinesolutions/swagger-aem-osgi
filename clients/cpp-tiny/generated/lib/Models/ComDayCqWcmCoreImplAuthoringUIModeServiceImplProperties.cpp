

#include "ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties::ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties()
{
	authoringUIModeServicedefault = ConfigNodePropertyString();
}

ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties::ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties::~ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties()
{

}

void
ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *authoringUIModeServicedefaultKey = "authoringUIModeService.default";

    if(object.has_key(authoringUIModeServicedefaultKey))
    {
        bourne::json value = object[authoringUIModeServicedefaultKey];




        ConfigNodePropertyString* obj = &authoringUIModeServicedefault;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["authoringUIModeServicedefault"] = getAuthoringUIModeServicedefault().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties::getAuthoringUIModeServicedefault()
{
	return authoringUIModeServicedefault;
}

void
ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties::setAuthoringUIModeServicedefault(ConfigNodePropertyString authoringUIModeServicedefault)
{
	this->authoringUIModeServicedefault = authoringUIModeServicedefault;
}



