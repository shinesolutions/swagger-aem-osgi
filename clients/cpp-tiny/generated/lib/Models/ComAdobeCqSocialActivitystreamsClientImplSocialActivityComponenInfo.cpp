

#include "ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo.h"

using namespace Tiny;

ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo::ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties();
}

ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo::ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo::~ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo()
{

}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo::setProperties(ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties properties)
{
	this->properties = properties;
}



