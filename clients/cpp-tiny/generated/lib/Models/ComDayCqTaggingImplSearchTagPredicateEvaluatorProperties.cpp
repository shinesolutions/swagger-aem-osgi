

#include "ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties.h"

using namespace Tiny;

ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties()
{
	ignore_path = ConfigNodePropertyBoolean();
}

ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::~ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties()
{

}

void
ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ignore_pathKey = "ignore_path";

    if(object.has_key(ignore_pathKey))
    {
        bourne::json value = object[ignore_pathKey];




        ConfigNodePropertyBoolean* obj = &ignore_path;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["ignore_path"] = getIgnorePath().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::getIgnorePath()
{
	return ignore_path;
}

void
ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties::setIgnorePath(ConfigNodePropertyBoolean ignore_path)
{
	this->ignore_path = ignore_path;
}



