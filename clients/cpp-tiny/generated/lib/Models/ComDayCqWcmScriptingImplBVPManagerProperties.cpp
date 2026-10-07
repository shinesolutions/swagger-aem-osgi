

#include "ComDayCqWcmScriptingImplBVPManagerProperties.h"

using namespace Tiny;

ComDayCqWcmScriptingImplBVPManagerProperties::ComDayCqWcmScriptingImplBVPManagerProperties()
{
	comdaycqwcmscriptingbvpscriptengines = ConfigNodePropertyArray();
}

ComDayCqWcmScriptingImplBVPManagerProperties::ComDayCqWcmScriptingImplBVPManagerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmScriptingImplBVPManagerProperties::~ComDayCqWcmScriptingImplBVPManagerProperties()
{

}

void
ComDayCqWcmScriptingImplBVPManagerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *comdaycqwcmscriptingbvpscriptenginesKey = "com.day.cq.wcm.scripting.bvp.script.engines";

    if(object.has_key(comdaycqwcmscriptingbvpscriptenginesKey))
    {
        bourne::json value = object[comdaycqwcmscriptingbvpscriptenginesKey];




        ConfigNodePropertyArray* obj = &comdaycqwcmscriptingbvpscriptengines;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmScriptingImplBVPManagerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["comdaycqwcmscriptingbvpscriptengines"] = getComdaycqwcmscriptingbvpscriptengines().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmScriptingImplBVPManagerProperties::getComdaycqwcmscriptingbvpscriptengines()
{
	return comdaycqwcmscriptingbvpscriptengines;
}

void
ComDayCqWcmScriptingImplBVPManagerProperties::setComdaycqwcmscriptingbvpscriptengines(ConfigNodePropertyArray comdaycqwcmscriptingbvpscriptengines)
{
	this->comdaycqwcmscriptingbvpscriptengines = comdaycqwcmscriptingbvpscriptengines;
}



