

#include "ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo.h"

using namespace Tiny;

ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo::ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties();
}

ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo::ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo::~ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo()
{

}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties
ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo::setProperties(ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties properties)
{
	this->properties = properties;
}



