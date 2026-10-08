

#include "ComAdobeCqScreensDeviceImplDeviceServiceProperties.h"

using namespace Tiny;

ComAdobeCqScreensDeviceImplDeviceServiceProperties::ComAdobeCqScreensDeviceImplDeviceServiceProperties()
{
	comadobeaemscreensplayerpingfrequency = ConfigNodePropertyInteger();
	comadobeaemscreensdevicepaswordspecialchars = ConfigNodePropertyString();
	comadobeaemscreensdevicepaswordminlowercasechars = ConfigNodePropertyInteger();
	comadobeaemscreensdevicepaswordminuppercasechars = ConfigNodePropertyInteger();
	comadobeaemscreensdevicepaswordminnumberchars = ConfigNodePropertyInteger();
	comadobeaemscreensdevicepaswordminspecialchars = ConfigNodePropertyInteger();
	comadobeaemscreensdevicepaswordminlength = ConfigNodePropertyInteger();
}

ComAdobeCqScreensDeviceImplDeviceServiceProperties::ComAdobeCqScreensDeviceImplDeviceServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensDeviceImplDeviceServiceProperties::~ComAdobeCqScreensDeviceImplDeviceServiceProperties()
{

}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *comadobeaemscreensplayerpingfrequencyKey = "com.adobe.aem.screens.player.pingfrequency";

    if(object.has_key(comadobeaemscreensplayerpingfrequencyKey))
    {
        bourne::json value = object[comadobeaemscreensplayerpingfrequencyKey];




        ConfigNodePropertyInteger* obj = &comadobeaemscreensplayerpingfrequency;
		obj->fromJson(value.dump());

    }

    const char *comadobeaemscreensdevicepaswordspecialcharsKey = "com.adobe.aem.screens.device.pasword.specialchars";

    if(object.has_key(comadobeaemscreensdevicepaswordspecialcharsKey))
    {
        bourne::json value = object[comadobeaemscreensdevicepaswordspecialcharsKey];




        ConfigNodePropertyString* obj = &comadobeaemscreensdevicepaswordspecialchars;
		obj->fromJson(value.dump());

    }

    const char *comadobeaemscreensdevicepaswordminlowercasecharsKey = "com.adobe.aem.screens.device.pasword.minlowercasechars";

    if(object.has_key(comadobeaemscreensdevicepaswordminlowercasecharsKey))
    {
        bourne::json value = object[comadobeaemscreensdevicepaswordminlowercasecharsKey];




        ConfigNodePropertyInteger* obj = &comadobeaemscreensdevicepaswordminlowercasechars;
		obj->fromJson(value.dump());

    }

    const char *comadobeaemscreensdevicepaswordminuppercasecharsKey = "com.adobe.aem.screens.device.pasword.minuppercasechars";

    if(object.has_key(comadobeaemscreensdevicepaswordminuppercasecharsKey))
    {
        bourne::json value = object[comadobeaemscreensdevicepaswordminuppercasecharsKey];




        ConfigNodePropertyInteger* obj = &comadobeaemscreensdevicepaswordminuppercasechars;
		obj->fromJson(value.dump());

    }

    const char *comadobeaemscreensdevicepaswordminnumbercharsKey = "com.adobe.aem.screens.device.pasword.minnumberchars";

    if(object.has_key(comadobeaemscreensdevicepaswordminnumbercharsKey))
    {
        bourne::json value = object[comadobeaemscreensdevicepaswordminnumbercharsKey];




        ConfigNodePropertyInteger* obj = &comadobeaemscreensdevicepaswordminnumberchars;
		obj->fromJson(value.dump());

    }

    const char *comadobeaemscreensdevicepaswordminspecialcharsKey = "com.adobe.aem.screens.device.pasword.minspecialchars";

    if(object.has_key(comadobeaemscreensdevicepaswordminspecialcharsKey))
    {
        bourne::json value = object[comadobeaemscreensdevicepaswordminspecialcharsKey];




        ConfigNodePropertyInteger* obj = &comadobeaemscreensdevicepaswordminspecialchars;
		obj->fromJson(value.dump());

    }

    const char *comadobeaemscreensdevicepaswordminlengthKey = "com.adobe.aem.screens.device.pasword.minlength";

    if(object.has_key(comadobeaemscreensdevicepaswordminlengthKey))
    {
        bourne::json value = object[comadobeaemscreensdevicepaswordminlengthKey];




        ConfigNodePropertyInteger* obj = &comadobeaemscreensdevicepaswordminlength;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensDeviceImplDeviceServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["comadobeaemscreensplayerpingfrequency"] = getComadobeaemscreensplayerpingfrequency().toJson();






	object["comadobeaemscreensdevicepaswordspecialchars"] = getComadobeaemscreensdevicepaswordspecialchars().toJson();






	object["comadobeaemscreensdevicepaswordminlowercasechars"] = getComadobeaemscreensdevicepaswordminlowercasechars().toJson();






	object["comadobeaemscreensdevicepaswordminuppercasechars"] = getComadobeaemscreensdevicepaswordminuppercasechars().toJson();






	object["comadobeaemscreensdevicepaswordminnumberchars"] = getComadobeaemscreensdevicepaswordminnumberchars().toJson();






	object["comadobeaemscreensdevicepaswordminspecialchars"] = getComadobeaemscreensdevicepaswordminspecialchars().toJson();






	object["comadobeaemscreensdevicepaswordminlength"] = getComadobeaemscreensdevicepaswordminlength().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComadobeaemscreensplayerpingfrequency()
{
	return comadobeaemscreensplayerpingfrequency;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComadobeaemscreensplayerpingfrequency(ConfigNodePropertyInteger comadobeaemscreensplayerpingfrequency)
{
	this->comadobeaemscreensplayerpingfrequency = comadobeaemscreensplayerpingfrequency;
}

ConfigNodePropertyString
ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComadobeaemscreensdevicepaswordspecialchars()
{
	return comadobeaemscreensdevicepaswordspecialchars;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComadobeaemscreensdevicepaswordspecialchars(ConfigNodePropertyString comadobeaemscreensdevicepaswordspecialchars)
{
	this->comadobeaemscreensdevicepaswordspecialchars = comadobeaemscreensdevicepaswordspecialchars;
}

ConfigNodePropertyInteger
ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComadobeaemscreensdevicepaswordminlowercasechars()
{
	return comadobeaemscreensdevicepaswordminlowercasechars;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComadobeaemscreensdevicepaswordminlowercasechars(ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminlowercasechars)
{
	this->comadobeaemscreensdevicepaswordminlowercasechars = comadobeaemscreensdevicepaswordminlowercasechars;
}

ConfigNodePropertyInteger
ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComadobeaemscreensdevicepaswordminuppercasechars()
{
	return comadobeaemscreensdevicepaswordminuppercasechars;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComadobeaemscreensdevicepaswordminuppercasechars(ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminuppercasechars)
{
	this->comadobeaemscreensdevicepaswordminuppercasechars = comadobeaemscreensdevicepaswordminuppercasechars;
}

ConfigNodePropertyInteger
ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComadobeaemscreensdevicepaswordminnumberchars()
{
	return comadobeaemscreensdevicepaswordminnumberchars;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComadobeaemscreensdevicepaswordminnumberchars(ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminnumberchars)
{
	this->comadobeaemscreensdevicepaswordminnumberchars = comadobeaemscreensdevicepaswordminnumberchars;
}

ConfigNodePropertyInteger
ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComadobeaemscreensdevicepaswordminspecialchars()
{
	return comadobeaemscreensdevicepaswordminspecialchars;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComadobeaemscreensdevicepaswordminspecialchars(ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminspecialchars)
{
	this->comadobeaemscreensdevicepaswordminspecialchars = comadobeaemscreensdevicepaswordminspecialchars;
}

ConfigNodePropertyInteger
ComAdobeCqScreensDeviceImplDeviceServiceProperties::getComadobeaemscreensdevicepaswordminlength()
{
	return comadobeaemscreensdevicepaswordminlength;
}

void
ComAdobeCqScreensDeviceImplDeviceServiceProperties::setComadobeaemscreensdevicepaswordminlength(ConfigNodePropertyInteger comadobeaemscreensdevicepaswordminlength)
{
	this->comadobeaemscreensdevicepaswordminlength = comadobeaemscreensdevicepaswordminlength;
}



