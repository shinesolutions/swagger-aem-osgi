

#include "ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo.h"

using namespace Tiny;

ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo::ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties();
}

ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo::ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo::~ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo()
{

}

void
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo::getPid()
{
	return pid;
}

void
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo::getTitle()
{
	return title;
}

void
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo::getDescription()
{
	return description;
}

void
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo::setProperties(ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties properties)
{
	this->properties = properties;
}



