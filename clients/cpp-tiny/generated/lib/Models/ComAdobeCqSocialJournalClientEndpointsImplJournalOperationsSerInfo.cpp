

#include "ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo.h"

using namespace Tiny;

ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo::ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties();
}

ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo::ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo::~ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo()
{

}

void
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo::setProperties(ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties properties)
{
	this->properties = properties;
}



