

#include "ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.h"

using namespace Tiny;

ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties()
{
	pathBuildertarget = ConfigNodePropertyString();
	suggestbasepath = ConfigNodePropertyString();
}

ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::~ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties()
{

}

void
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathBuildertargetKey = "pathBuilder.target";

    if(object.has_key(pathBuildertargetKey))
    {
        bourne::json value = object[pathBuildertargetKey];




        ConfigNodePropertyString* obj = &pathBuildertarget;
		obj->fromJson(value.dump());

    }

    const char *suggestbasepathKey = "suggest.basepath";

    if(object.has_key(suggestbasepathKey))
    {
        bourne::json value = object[suggestbasepathKey];




        ConfigNodePropertyString* obj = &suggestbasepath;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["pathBuildertarget"] = getPathBuildertarget().toJson();






	object["suggestbasepath"] = getSuggestbasepath().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::getPathBuildertarget()
{
	return pathBuildertarget;
}

void
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::setPathBuildertarget(ConfigNodePropertyString pathBuildertarget)
{
	this->pathBuildertarget = pathBuildertarget;
}

ConfigNodePropertyString
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::getSuggestbasepath()
{
	return suggestbasepath;
}

void
ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties::setSuggestbasepath(ConfigNodePropertyString suggestbasepath)
{
	this->suggestbasepath = suggestbasepath;
}



