

#include "ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties()
{
	dimdefaultmode = ConfigNodePropertyDropDown();
	dimappcacheenabled = ConfigNodePropertyBoolean();
}

ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::~ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties()
{

}

void
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dimdefaultmodeKey = "dim.default.mode";

    if(object.has_key(dimdefaultmodeKey))
    {
        bourne::json value = object[dimdefaultmodeKey];




        ConfigNodePropertyDropDown* obj = &dimdefaultmode;
		obj->fromJson(value.dump());

    }

    const char *dimappcacheenabledKey = "dim.appcache.enabled";

    if(object.has_key(dimappcacheenabledKey))
    {
        bourne::json value = object[dimappcacheenabledKey];




        ConfigNodePropertyBoolean* obj = &dimappcacheenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["dimdefaultmode"] = getDimdefaultmode().toJson();






	object["dimappcacheenabled"] = getDimappcacheenabled().toJson();


    return object;

}

ConfigNodePropertyDropDown
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::getDimdefaultmode()
{
	return dimdefaultmode;
}

void
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::setDimdefaultmode(ConfigNodePropertyDropDown dimdefaultmode)
{
	this->dimdefaultmode = dimdefaultmode;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::getDimappcacheenabled()
{
	return dimappcacheenabled;
}

void
ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties::setDimappcacheenabled(ConfigNodePropertyBoolean dimappcacheenabled)
{
	this->dimappcacheenabled = dimappcacheenabled;
}



