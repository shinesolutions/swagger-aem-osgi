

#include "ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.h"

using namespace Tiny;

ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::ComAdobeGraniteLicenseImplLicenseCheckFilterProperties()
{
	checkInternval = ConfigNodePropertyInteger();
	excludeIds = ConfigNodePropertyArray();
	encryptPing = ConfigNodePropertyBoolean();
}

ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::ComAdobeGraniteLicenseImplLicenseCheckFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::~ComAdobeGraniteLicenseImplLicenseCheckFilterProperties()
{

}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *checkInternvalKey = "checkInternval";

    if(object.has_key(checkInternvalKey))
    {
        bourne::json value = object[checkInternvalKey];




        ConfigNodePropertyInteger* obj = &checkInternval;
		obj->fromJson(value.dump());

    }

    const char *excludeIdsKey = "excludeIds";

    if(object.has_key(excludeIdsKey))
    {
        bourne::json value = object[excludeIdsKey];




        ConfigNodePropertyArray* obj = &excludeIds;
		obj->fromJson(value.dump());

    }

    const char *encryptPingKey = "encryptPing";

    if(object.has_key(encryptPingKey))
    {
        bourne::json value = object[encryptPingKey];




        ConfigNodePropertyBoolean* obj = &encryptPing;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["checkInternval"] = getCheckInternval().toJson();






	object["excludeIds"] = getExcludeIds().toJson();






	object["encryptPing"] = getEncryptPing().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::getCheckInternval()
{
	return checkInternval;
}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::setCheckInternval(ConfigNodePropertyInteger checkInternval)
{
	this->checkInternval = checkInternval;
}

ConfigNodePropertyArray
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::getExcludeIds()
{
	return excludeIds;
}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::setExcludeIds(ConfigNodePropertyArray excludeIds)
{
	this->excludeIds = excludeIds;
}

ConfigNodePropertyBoolean
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::getEncryptPing()
{
	return encryptPing;
}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::setEncryptPing(ConfigNodePropertyBoolean encryptPing)
{
	this->encryptPing = encryptPing;
}



