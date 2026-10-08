

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo::~ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo::setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties properties)
{
	this->properties = properties;
}



