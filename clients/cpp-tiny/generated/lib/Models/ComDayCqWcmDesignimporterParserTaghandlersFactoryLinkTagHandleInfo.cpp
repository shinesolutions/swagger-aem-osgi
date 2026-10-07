

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo::~ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo::setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties properties)
{
	this->properties = properties;
}



