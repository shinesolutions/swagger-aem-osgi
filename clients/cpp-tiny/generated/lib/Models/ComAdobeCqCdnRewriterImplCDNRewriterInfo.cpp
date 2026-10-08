

#include "ComAdobeCqCdnRewriterImplCDNRewriterInfo.h"

using namespace Tiny;

ComAdobeCqCdnRewriterImplCDNRewriterInfo::ComAdobeCqCdnRewriterImplCDNRewriterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqCdnRewriterImplCDNRewriterProperties();
}

ComAdobeCqCdnRewriterImplCDNRewriterInfo::ComAdobeCqCdnRewriterImplCDNRewriterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCdnRewriterImplCDNRewriterInfo::~ComAdobeCqCdnRewriterImplCDNRewriterInfo()
{

}

void
ComAdobeCqCdnRewriterImplCDNRewriterInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqCdnRewriterImplCDNRewriterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCdnRewriterImplCDNRewriterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqCdnRewriterImplCDNRewriterInfo::getPid()
{
	return pid;
}

void
ComAdobeCqCdnRewriterImplCDNRewriterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqCdnRewriterImplCDNRewriterInfo::getTitle()
{
	return title;
}

void
ComAdobeCqCdnRewriterImplCDNRewriterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqCdnRewriterImplCDNRewriterInfo::getDescription()
{
	return description;
}

void
ComAdobeCqCdnRewriterImplCDNRewriterInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqCdnRewriterImplCDNRewriterProperties
ComAdobeCqCdnRewriterImplCDNRewriterInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqCdnRewriterImplCDNRewriterInfo::setProperties(ComAdobeCqCdnRewriterImplCDNRewriterProperties properties)
{
	this->properties = properties;
}



