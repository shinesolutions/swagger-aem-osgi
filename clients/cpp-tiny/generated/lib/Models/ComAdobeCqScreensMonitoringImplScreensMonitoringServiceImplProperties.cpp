

#include "ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties()
{
	comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath = ConfigNodePropertyArray();
	comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency = ConfigNodePropertyString();
	comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout = ConfigNodePropertyInteger();
	comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients = ConfigNodePropertyString();
	comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver = ConfigNodePropertyString();
	comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport = ConfigNodePropertyInteger();
	comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls = ConfigNodePropertyBoolean();
	comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername = ConfigNodePropertyString();
	comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword = ConfigNodePropertyString();
}

ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::~ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties()
{

}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPathKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath";

    if(object.has_key(comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPathKey))
    {
        bourne::json value = object[comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPathKey];




        ConfigNodePropertyArray* obj = &comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath;
		obj->fromJson(value.dump());

    }

    const char *comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequencyKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency";

    if(object.has_key(comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequencyKey))
    {
        bourne::json value = object[comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequencyKey];




        ConfigNodePropertyString* obj = &comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency;
		obj->fromJson(value.dump());

    }

    const char *comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeoutKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout";

    if(object.has_key(comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeoutKey))
    {
        bourne::json value = object[comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeoutKey];




        ConfigNodePropertyInteger* obj = &comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout;
		obj->fromJson(value.dump());

    }

    const char *comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipientsKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients";

    if(object.has_key(comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipientsKey))
    {
        bourne::json value = object[comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipientsKey];




        ConfigNodePropertyString* obj = &comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients;
		obj->fromJson(value.dump());

    }

    const char *comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserverKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver";

    if(object.has_key(comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserverKey))
    {
        bourne::json value = object[comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserverKey];




        ConfigNodePropertyString* obj = &comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver;
		obj->fromJson(value.dump());

    }

    const char *comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpportKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport";

    if(object.has_key(comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpportKey))
    {
        bourne::json value = object[comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpportKey];




        ConfigNodePropertyInteger* obj = &comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport;
		obj->fromJson(value.dump());

    }

    const char *comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetlsKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls";

    if(object.has_key(comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetlsKey))
    {
        bourne::json value = object[comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetlsKey];




        ConfigNodePropertyBoolean* obj = &comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls;
		obj->fromJson(value.dump());

    }

    const char *comadobecqscreensmonitoringimplScreensMonitoringServiceImplusernameKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username";

    if(object.has_key(comadobecqscreensmonitoringimplScreensMonitoringServiceImplusernameKey))
    {
        bourne::json value = object[comadobecqscreensmonitoringimplScreensMonitoringServiceImplusernameKey];




        ConfigNodePropertyString* obj = &comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername;
		obj->fromJson(value.dump());

    }

    const char *comadobecqscreensmonitoringimplScreensMonitoringServiceImplpasswordKey = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password";

    if(object.has_key(comadobecqscreensmonitoringimplScreensMonitoringServiceImplpasswordKey))
    {
        bourne::json value = object[comadobecqscreensmonitoringimplScreensMonitoringServiceImplpasswordKey];




        ConfigNodePropertyString* obj = &comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath"] = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath().toJson();






	object["comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency"] = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency().toJson();






	object["comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout"] = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout().toJson();






	object["comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients"] = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients().toJson();






	object["comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver"] = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver().toJson();






	object["comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport"] = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport().toJson();






	object["comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls"] = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls().toJson();






	object["comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername"] = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplusername().toJson();






	object["comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword"] = getComadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath(ConfigNodePropertyArray comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath = comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath;
}

ConfigNodePropertyString
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency(ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency = comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout(ConfigNodePropertyInteger comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout = comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout;
}

ConfigNodePropertyString
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients(ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients = comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients;
}

ConfigNodePropertyString
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver(ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver = comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver;
}

ConfigNodePropertyInteger
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport(ConfigNodePropertyInteger comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport = comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport;
}

ConfigNodePropertyBoolean
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls(ConfigNodePropertyBoolean comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls = comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls;
}

ConfigNodePropertyString
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplusername()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplusername(ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername = comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername;
}

ConfigNodePropertyString
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::getComadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword()
{
	return comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword;
}

void
ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties::setComadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword(ConfigNodePropertyString comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword)
{
	this->comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword = comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword;
}



