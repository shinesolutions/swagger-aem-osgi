

#include "ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo.h"

using namespace Tiny;

ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo::ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties();
}

ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo::ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo::~ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo()
{

}

void
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo::setProperties(ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties properties)
{
	this->properties = properties;
}



