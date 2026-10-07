

#include "ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo.h"

using namespace Tiny;

ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo::ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties();
}

ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo::ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo::~ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo()
{

}

void
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo::getPid()
{
	return pid;
}

void
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo::getTitle()
{
	return title;
}

void
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo::getDescription()
{
	return description;
}

void
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo::setProperties(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties properties)
{
	this->properties = properties;
}



