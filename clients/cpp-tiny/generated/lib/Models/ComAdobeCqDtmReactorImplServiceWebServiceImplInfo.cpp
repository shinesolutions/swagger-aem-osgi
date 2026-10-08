

#include "ComAdobeCqDtmReactorImplServiceWebServiceImplInfo.h"

using namespace Tiny;

ComAdobeCqDtmReactorImplServiceWebServiceImplInfo::ComAdobeCqDtmReactorImplServiceWebServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDtmReactorImplServiceWebServiceImplProperties();
}

ComAdobeCqDtmReactorImplServiceWebServiceImplInfo::ComAdobeCqDtmReactorImplServiceWebServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDtmReactorImplServiceWebServiceImplInfo::~ComAdobeCqDtmReactorImplServiceWebServiceImplInfo()
{

}

void
ComAdobeCqDtmReactorImplServiceWebServiceImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDtmReactorImplServiceWebServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDtmReactorImplServiceWebServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDtmReactorImplServiceWebServiceImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDtmReactorImplServiceWebServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDtmReactorImplServiceWebServiceImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDtmReactorImplServiceWebServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDtmReactorImplServiceWebServiceImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDtmReactorImplServiceWebServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDtmReactorImplServiceWebServiceImplProperties
ComAdobeCqDtmReactorImplServiceWebServiceImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDtmReactorImplServiceWebServiceImplInfo::setProperties(ComAdobeCqDtmReactorImplServiceWebServiceImplProperties properties)
{
	this->properties = properties;
}



