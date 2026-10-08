

#include "ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.h"

using namespace Tiny;

ComAdobeCqScheduledExporterImplScheduledExporterImplInfo::ComAdobeCqScheduledExporterImplScheduledExporterImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqScheduledExporterImplScheduledExporterImplProperties();
}

ComAdobeCqScheduledExporterImplScheduledExporterImplInfo::ComAdobeCqScheduledExporterImplScheduledExporterImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScheduledExporterImplScheduledExporterImplInfo::~ComAdobeCqScheduledExporterImplScheduledExporterImplInfo()
{

}

void
ComAdobeCqScheduledExporterImplScheduledExporterImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqScheduledExporterImplScheduledExporterImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScheduledExporterImplScheduledExporterImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqScheduledExporterImplScheduledExporterImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqScheduledExporterImplScheduledExporterImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqScheduledExporterImplScheduledExporterImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqScheduledExporterImplScheduledExporterImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqScheduledExporterImplScheduledExporterImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqScheduledExporterImplScheduledExporterImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqScheduledExporterImplScheduledExporterImplProperties
ComAdobeCqScheduledExporterImplScheduledExporterImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqScheduledExporterImplScheduledExporterImplInfo::setProperties(ComAdobeCqScheduledExporterImplScheduledExporterImplProperties properties)
{
	this->properties = properties;
}



