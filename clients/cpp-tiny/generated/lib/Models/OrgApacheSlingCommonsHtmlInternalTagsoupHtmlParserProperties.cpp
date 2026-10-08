

#include "OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.h"

using namespace Tiny;

OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties()
{
	parserfeatures = ConfigNodePropertyArray();
}

OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::~OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties()
{

}

void
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *parserfeaturesKey = "parser.features";

    if(object.has_key(parserfeaturesKey))
    {
        bourne::json value = object[parserfeaturesKey];




        ConfigNodePropertyArray* obj = &parserfeatures;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["parserfeatures"] = getParserfeatures().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::getParserfeatures()
{
	return parserfeatures;
}

void
OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties::setParserfeatures(ConfigNodePropertyArray parserfeatures)
{
	this->parserfeatures = parserfeatures;
}



