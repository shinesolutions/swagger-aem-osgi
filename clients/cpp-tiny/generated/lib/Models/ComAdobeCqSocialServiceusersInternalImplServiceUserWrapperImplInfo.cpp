

#include "ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo.h"

using namespace Tiny;

ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties();
}

ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::~ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo()
{

}

void
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo::setProperties(ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties properties)
{
	this->properties = properties;
}



