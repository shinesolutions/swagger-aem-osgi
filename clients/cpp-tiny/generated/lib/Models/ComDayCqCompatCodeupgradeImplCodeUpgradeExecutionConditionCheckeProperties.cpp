

#include "ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.h"

using namespace Tiny;

ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties()
{
	codeupgradetasks = ConfigNodePropertyArray();
	codeupgradetaskfilters = ConfigNodePropertyArray();
}

ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::~ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties()
{

}

void
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *codeupgradetasksKey = "codeupgradetasks";

    if(object.has_key(codeupgradetasksKey))
    {
        bourne::json value = object[codeupgradetasksKey];




        ConfigNodePropertyArray* obj = &codeupgradetasks;
		obj->fromJson(value.dump());

    }

    const char *codeupgradetaskfiltersKey = "codeupgradetaskfilters";

    if(object.has_key(codeupgradetaskfiltersKey))
    {
        bourne::json value = object[codeupgradetaskfiltersKey];




        ConfigNodePropertyArray* obj = &codeupgradetaskfilters;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["codeupgradetasks"] = getCodeupgradetasks().toJson();






	object["codeupgradetaskfilters"] = getCodeupgradetaskfilters().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::getCodeupgradetasks()
{
	return codeupgradetasks;
}

void
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::setCodeupgradetasks(ConfigNodePropertyArray codeupgradetasks)
{
	this->codeupgradetasks = codeupgradetasks;
}

ConfigNodePropertyArray
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::getCodeupgradetaskfilters()
{
	return codeupgradetaskfilters;
}

void
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::setCodeupgradetaskfilters(ConfigNodePropertyArray codeupgradetaskfilters)
{
	this->codeupgradetaskfilters = codeupgradetaskfilters;
}



