

#include "ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo.h"

using namespace Tiny;

ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo::ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties();
}

ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo::ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo::~ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo()
{

}

void
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo::setProperties(ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties properties)
{
	this->properties = properties;
}



