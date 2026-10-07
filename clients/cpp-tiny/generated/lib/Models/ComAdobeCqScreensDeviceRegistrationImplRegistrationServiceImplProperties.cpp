

#include "ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties()
{
	deviceRegistrationTimeout = ConfigNodePropertyInteger();
}

ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::~ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties()
{

}

void
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *deviceRegistrationTimeoutKey = "deviceRegistrationTimeout";

    if(object.has_key(deviceRegistrationTimeoutKey))
    {
        bourne::json value = object[deviceRegistrationTimeoutKey];




        ConfigNodePropertyInteger* obj = &deviceRegistrationTimeout;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["deviceRegistrationTimeout"] = getDeviceRegistrationTimeout().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::getDeviceRegistrationTimeout()
{
	return deviceRegistrationTimeout;
}

void
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties::setDeviceRegistrationTimeout(ConfigNodePropertyInteger deviceRegistrationTimeout)
{
	this->deviceRegistrationTimeout = deviceRegistrationTimeout;
}



