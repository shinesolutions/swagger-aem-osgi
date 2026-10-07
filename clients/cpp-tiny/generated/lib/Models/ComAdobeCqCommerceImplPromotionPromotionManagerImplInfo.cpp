

#include "ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo.h"

using namespace Tiny;

ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo::ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties();
}

ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo::ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo::~ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo()
{

}

void
ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties
ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo::setProperties(ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties properties)
{
	this->properties = properties;
}



