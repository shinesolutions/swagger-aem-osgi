

#include "ComAdobeCqDamDmProcessImagePTiffManagerImplInfo.h"

using namespace Tiny;

ComAdobeCqDamDmProcessImagePTiffManagerImplInfo::ComAdobeCqDamDmProcessImagePTiffManagerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamDmProcessImagePTiffManagerImplProperties();
}

ComAdobeCqDamDmProcessImagePTiffManagerImplInfo::ComAdobeCqDamDmProcessImagePTiffManagerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamDmProcessImagePTiffManagerImplInfo::~ComAdobeCqDamDmProcessImagePTiffManagerImplInfo()
{

}

void
ComAdobeCqDamDmProcessImagePTiffManagerImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDamDmProcessImagePTiffManagerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamDmProcessImagePTiffManagerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamDmProcessImagePTiffManagerImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamDmProcessImagePTiffManagerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamDmProcessImagePTiffManagerImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamDmProcessImagePTiffManagerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamDmProcessImagePTiffManagerImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamDmProcessImagePTiffManagerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamDmProcessImagePTiffManagerImplProperties
ComAdobeCqDamDmProcessImagePTiffManagerImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamDmProcessImagePTiffManagerImplInfo::setProperties(ComAdobeCqDamDmProcessImagePTiffManagerImplProperties properties)
{
	this->properties = properties;
}



