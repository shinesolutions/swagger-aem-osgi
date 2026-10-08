

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlProperties();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo::~ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlProperties
ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo::setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlProperties properties)
{
	this->properties = properties;
}



