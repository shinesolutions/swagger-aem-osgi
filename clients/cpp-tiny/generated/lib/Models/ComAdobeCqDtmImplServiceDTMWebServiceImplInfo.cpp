

#include "ComAdobeCqDtmImplServiceDTMWebServiceImplInfo.h"

using namespace Tiny;

ComAdobeCqDtmImplServiceDTMWebServiceImplInfo::ComAdobeCqDtmImplServiceDTMWebServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDtmImplServiceDTMWebServiceImplProperties();
}

ComAdobeCqDtmImplServiceDTMWebServiceImplInfo::ComAdobeCqDtmImplServiceDTMWebServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDtmImplServiceDTMWebServiceImplInfo::~ComAdobeCqDtmImplServiceDTMWebServiceImplInfo()
{

}

void
ComAdobeCqDtmImplServiceDTMWebServiceImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDtmImplServiceDTMWebServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDtmImplServiceDTMWebServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDtmImplServiceDTMWebServiceImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDtmImplServiceDTMWebServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDtmImplServiceDTMWebServiceImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDtmImplServiceDTMWebServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDtmImplServiceDTMWebServiceImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDtmImplServiceDTMWebServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDtmImplServiceDTMWebServiceImplProperties
ComAdobeCqDtmImplServiceDTMWebServiceImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDtmImplServiceDTMWebServiceImplInfo::setProperties(ComAdobeCqDtmImplServiceDTMWebServiceImplProperties properties)
{
	this->properties = properties;
}



