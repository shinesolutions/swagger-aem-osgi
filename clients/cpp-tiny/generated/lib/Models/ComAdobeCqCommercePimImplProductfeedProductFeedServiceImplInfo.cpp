

#include "ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo.h"

using namespace Tiny;

ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo::ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties();
}

ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo::ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo::~ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo()
{

}

void
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo::setProperties(ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties properties)
{
	this->properties = properties;
}



