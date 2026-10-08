

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo::~ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties
ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo::setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties properties)
{
	this->properties = properties;
}



