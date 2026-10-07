

#include "ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.h"

using namespace Tiny;

ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties()
{
	searchpattern = ConfigNodePropertyString();
	replacepattern = ConfigNodePropertyString();
}

ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::~ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties()
{

}

void
ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *searchpatternKey = "search.pattern";

    if(object.has_key(searchpatternKey))
    {
        bourne::json value = object[searchpatternKey];




        ConfigNodePropertyString* obj = &searchpattern;
		obj->fromJson(value.dump());

    }

    const char *replacepatternKey = "replace.pattern";

    if(object.has_key(replacepatternKey))
    {
        bourne::json value = object[replacepatternKey];




        ConfigNodePropertyString* obj = &replacepattern;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["searchpattern"] = getSearchpattern().toJson();






	object["replacepattern"] = getReplacepattern().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::getSearchpattern()
{
	return searchpattern;
}

void
ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::setSearchpattern(ConfigNodePropertyString searchpattern)
{
	this->searchpattern = searchpattern;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::getReplacepattern()
{
	return replacepattern;
}

void
ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties::setReplacepattern(ConfigNodePropertyString replacepattern)
{
	this->replacepattern = replacepattern;
}



