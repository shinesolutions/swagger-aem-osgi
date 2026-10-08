

#include "ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo.h"

using namespace Tiny;

ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo::ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties();
}

ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo::ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo::~ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo()
{

}

void
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo::getPid()
{
	return pid;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo::getTitle()
{
	return title;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo::getDescription()
{
	return description;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo::setProperties(ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties properties)
{
	this->properties = properties;
}



