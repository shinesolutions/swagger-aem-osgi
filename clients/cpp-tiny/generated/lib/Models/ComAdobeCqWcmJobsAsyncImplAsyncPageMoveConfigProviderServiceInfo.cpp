

#include "ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo.h"

using namespace Tiny;

ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo::ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties();
}

ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo::ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo::~ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo()
{

}

void
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo::getPid()
{
	return pid;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo::getTitle()
{
	return title;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo::getDescription()
{
	return description;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo::setProperties(ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties properties)
{
	this->properties = properties;
}



