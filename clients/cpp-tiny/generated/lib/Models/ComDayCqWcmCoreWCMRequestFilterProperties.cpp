

#include "ComDayCqWcmCoreWCMRequestFilterProperties.h"

using namespace Tiny;

ComDayCqWcmCoreWCMRequestFilterProperties::ComDayCqWcmCoreWCMRequestFilterProperties()
{
	wcmfiltermode = ConfigNodePropertyDropDown();
}

ComDayCqWcmCoreWCMRequestFilterProperties::ComDayCqWcmCoreWCMRequestFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreWCMRequestFilterProperties::~ComDayCqWcmCoreWCMRequestFilterProperties()
{

}

void
ComDayCqWcmCoreWCMRequestFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *wcmfiltermodeKey = "wcmfilter.mode";

    if(object.has_key(wcmfiltermodeKey))
    {
        bourne::json value = object[wcmfiltermodeKey];




        ConfigNodePropertyDropDown* obj = &wcmfiltermode;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreWCMRequestFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["wcmfiltermode"] = getWcmfiltermode().toJson();


    return object;

}

ConfigNodePropertyDropDown
ComDayCqWcmCoreWCMRequestFilterProperties::getWcmfiltermode()
{
	return wcmfiltermode;
}

void
ComDayCqWcmCoreWCMRequestFilterProperties::setWcmfiltermode(ConfigNodePropertyDropDown wcmfiltermode)
{
	this->wcmfiltermode = wcmfiltermode;
}



