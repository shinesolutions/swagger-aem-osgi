

#include "ComDayCqRewriterProcessorImplHtmlParserFactoryProperties.h"

using namespace Tiny;

ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::ComDayCqRewriterProcessorImplHtmlParserFactoryProperties()
{
	htmlparserprocessTags = ConfigNodePropertyArray();
	htmlparserpreserveCamelCase = ConfigNodePropertyBoolean();
}

ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::ComDayCqRewriterProcessorImplHtmlParserFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::~ComDayCqRewriterProcessorImplHtmlParserFactoryProperties()
{

}

void
ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *htmlparserprocessTagsKey = "htmlparser.processTags";

    if(object.has_key(htmlparserprocessTagsKey))
    {
        bourne::json value = object[htmlparserprocessTagsKey];




        ConfigNodePropertyArray* obj = &htmlparserprocessTags;
		obj->fromJson(value.dump());

    }

    const char *htmlparserpreserveCamelCaseKey = "htmlparser.preserveCamelCase";

    if(object.has_key(htmlparserpreserveCamelCaseKey))
    {
        bourne::json value = object[htmlparserpreserveCamelCaseKey];




        ConfigNodePropertyBoolean* obj = &htmlparserpreserveCamelCase;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["htmlparserprocessTags"] = getHtmlparserprocessTags().toJson();






	object["htmlparserpreserveCamelCase"] = getHtmlparserpreserveCamelCase().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::getHtmlparserprocessTags()
{
	return htmlparserprocessTags;
}

void
ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::setHtmlparserprocessTags(ConfigNodePropertyArray htmlparserprocessTags)
{
	this->htmlparserprocessTags = htmlparserprocessTags;
}

ConfigNodePropertyBoolean
ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::getHtmlparserpreserveCamelCase()
{
	return htmlparserpreserveCamelCase;
}

void
ComDayCqRewriterProcessorImplHtmlParserFactoryProperties::setHtmlparserpreserveCamelCase(ConfigNodePropertyBoolean htmlparserpreserveCamelCase)
{
	this->htmlparserpreserveCamelCase = htmlparserpreserveCamelCase;
}



