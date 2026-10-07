

#include "ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo.h"

using namespace Tiny;

ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo::ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties();
}

ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo::ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo::~ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo()
{

}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo::getPid()
{
	return pid;
}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo::getTitle()
{
	return title;
}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo::getDescription()
{
	return description;
}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo::setProperties(ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties properties)
{
	this->properties = properties;
}



