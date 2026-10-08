

#include "ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo.h"

using namespace Tiny;

ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties();
}

ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo::~ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo()
{

}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo::getPid()
{
	return pid;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo::getTitle()
{
	return title;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo::getDescription()
{
	return description;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo::setProperties(ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties properties)
{
	this->properties = properties;
}



