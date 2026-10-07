

#include "ComAdobeCqDtmImplServletsDTMDeployHookServletInfo.h"

using namespace Tiny;

ComAdobeCqDtmImplServletsDTMDeployHookServletInfo::ComAdobeCqDtmImplServletsDTMDeployHookServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDtmImplServletsDTMDeployHookServletProperties();
}

ComAdobeCqDtmImplServletsDTMDeployHookServletInfo::ComAdobeCqDtmImplServletsDTMDeployHookServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDtmImplServletsDTMDeployHookServletInfo::~ComAdobeCqDtmImplServletsDTMDeployHookServletInfo()
{

}

void
ComAdobeCqDtmImplServletsDTMDeployHookServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDtmImplServletsDTMDeployHookServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDtmImplServletsDTMDeployHookServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDtmImplServletsDTMDeployHookServletInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDtmImplServletsDTMDeployHookServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDtmImplServletsDTMDeployHookServletInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDtmImplServletsDTMDeployHookServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDtmImplServletsDTMDeployHookServletInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDtmImplServletsDTMDeployHookServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDtmImplServletsDTMDeployHookServletProperties
ComAdobeCqDtmImplServletsDTMDeployHookServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDtmImplServletsDTMDeployHookServletInfo::setProperties(ComAdobeCqDtmImplServletsDTMDeployHookServletProperties properties)
{
	this->properties = properties;
}



