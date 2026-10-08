

#include "ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo.h"

using namespace Tiny;

ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo::ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties();
}

ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo::ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo::~ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo()
{

}

void
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo::getPid()
{
	return pid;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo::getTitle()
{
	return title;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo::getDescription()
{
	return description;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo::setProperties(ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties properties)
{
	this->properties = properties;
}



