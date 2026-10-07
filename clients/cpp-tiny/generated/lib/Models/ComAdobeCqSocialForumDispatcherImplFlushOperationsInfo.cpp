

#include "ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo.h"

using namespace Tiny;

ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo::ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties();
}

ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo::ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo::~ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo()
{

}

void
ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties
ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo::setProperties(ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties properties)
{
	this->properties = properties;
}



