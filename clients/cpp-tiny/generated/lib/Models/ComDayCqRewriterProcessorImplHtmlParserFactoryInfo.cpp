

#include "ComDayCqRewriterProcessorImplHtmlParserFactoryInfo.h"

using namespace Tiny;

ComDayCqRewriterProcessorImplHtmlParserFactoryInfo::ComDayCqRewriterProcessorImplHtmlParserFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqRewriterProcessorImplHtmlParserFactoryProperties();
}

ComDayCqRewriterProcessorImplHtmlParserFactoryInfo::ComDayCqRewriterProcessorImplHtmlParserFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqRewriterProcessorImplHtmlParserFactoryInfo::~ComDayCqRewriterProcessorImplHtmlParserFactoryInfo()
{

}

void
ComDayCqRewriterProcessorImplHtmlParserFactoryInfo::fromJson(std::string jsonObj)
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




        ComDayCqRewriterProcessorImplHtmlParserFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqRewriterProcessorImplHtmlParserFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqRewriterProcessorImplHtmlParserFactoryInfo::getPid()
{
	return pid;
}

void
ComDayCqRewriterProcessorImplHtmlParserFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqRewriterProcessorImplHtmlParserFactoryInfo::getTitle()
{
	return title;
}

void
ComDayCqRewriterProcessorImplHtmlParserFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqRewriterProcessorImplHtmlParserFactoryInfo::getDescription()
{
	return description;
}

void
ComDayCqRewriterProcessorImplHtmlParserFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqRewriterProcessorImplHtmlParserFactoryProperties
ComDayCqRewriterProcessorImplHtmlParserFactoryInfo::getProperties()
{
	return properties;
}

void
ComDayCqRewriterProcessorImplHtmlParserFactoryInfo::setProperties(ComDayCqRewriterProcessorImplHtmlParserFactoryProperties properties)
{
	this->properties = properties;
}



