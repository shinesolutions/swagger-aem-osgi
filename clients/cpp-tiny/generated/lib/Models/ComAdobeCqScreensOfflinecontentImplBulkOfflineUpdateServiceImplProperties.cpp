

#include "ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties()
{
	comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath = ConfigNodePropertyArray();
	comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency = ConfigNodePropertyString();
}

ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::~ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties()
{

}

void
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPathKey = "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath";

    if(object.has_key(comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPathKey))
    {
        bourne::json value = object[comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPathKey];




        ConfigNodePropertyArray* obj = &comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath;
		obj->fromJson(value.dump());

    }

    const char *comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequencyKey = "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency";

    if(object.has_key(comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequencyKey))
    {
        bourne::json value = object[comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequencyKey];




        ConfigNodePropertyString* obj = &comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath"] = getComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath().toJson();






	object["comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency"] = getComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::getComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath()
{
	return comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath;
}

void
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::setComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath(ConfigNodePropertyArray comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath)
{
	this->comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath = comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath;
}

ConfigNodePropertyString
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::getComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency()
{
	return comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency;
}

void
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::setComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency(ConfigNodePropertyString comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency)
{
	this->comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency = comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency;
}



