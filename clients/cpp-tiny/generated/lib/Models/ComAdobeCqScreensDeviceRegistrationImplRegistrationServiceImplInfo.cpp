

#include "ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo.h"

using namespace Tiny;

ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo::ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties();
}

ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo::ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo::~ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo()
{

}

void
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pidKey = "pid";

    if(object.has_key(pidKey))
    {
        bourne::json value = object[pidKey];



        jsonToValue(&pid, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];




        ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo::setProperties(ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties properties)
{
	this->properties = properties;
}



