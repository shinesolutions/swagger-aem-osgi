

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTProperties();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo::~ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTProperties
ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo::setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTProperties properties)
{
	this->properties = properties;
}



