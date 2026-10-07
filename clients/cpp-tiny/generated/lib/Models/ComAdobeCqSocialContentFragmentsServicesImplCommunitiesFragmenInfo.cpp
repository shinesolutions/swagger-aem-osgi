

#include "ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo.h"

using namespace Tiny;

ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo::ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties();
}

ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo::ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo::~ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo()
{

}

void
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo::setProperties(ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties properties)
{
	this->properties = properties;
}



