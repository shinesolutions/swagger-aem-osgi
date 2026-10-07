

#include "ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.h"

using namespace Tiny;

ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo::ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties();
}

ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo::ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo::~ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo()
{

}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo::setProperties(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties properties)
{
	this->properties = properties;
}



