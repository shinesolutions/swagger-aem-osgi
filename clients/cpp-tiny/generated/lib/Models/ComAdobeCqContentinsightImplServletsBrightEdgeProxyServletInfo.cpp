

#include "ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo.h"

using namespace Tiny;

ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo::ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties();
}

ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo::ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo::~ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo()
{

}

void
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo::getPid()
{
	return pid;
}

void
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo::getTitle()
{
	return title;
}

void
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo::getDescription()
{
	return description;
}

void
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo::setProperties(ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties properties)
{
	this->properties = properties;
}



