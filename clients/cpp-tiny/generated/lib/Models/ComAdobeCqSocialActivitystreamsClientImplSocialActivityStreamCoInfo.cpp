

#include "ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.h"

using namespace Tiny;

ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo::ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties();
}

ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo::ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo::~ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo()
{

}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo::setProperties(ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties properties)
{
	this->properties = properties;
}



