

#include "ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.h"

using namespace Tiny;

ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties::ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties()
{
	cqwcmmsmactionexcludednodetypes = ConfigNodePropertyArray();
	cqwcmmsmactionexcludedparagraphitems = ConfigNodePropertyArray();
	cqwcmmsmactionexcludedprops = ConfigNodePropertyArray();
}

ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties::ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties::~ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties()
{

}

void
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqwcmmsmactionexcludednodetypesKey = "cq.wcm.msm.action.excludednodetypes";

    if(object.has_key(cqwcmmsmactionexcludednodetypesKey))
    {
        bourne::json value = object[cqwcmmsmactionexcludednodetypesKey];




        ConfigNodePropertyArray* obj = &cqwcmmsmactionexcludednodetypes;
		obj->fromJson(value.dump());

    }

    const char *cqwcmmsmactionexcludedparagraphitemsKey = "cq.wcm.msm.action.excludedparagraphitems";

    if(object.has_key(cqwcmmsmactionexcludedparagraphitemsKey))
    {
        bourne::json value = object[cqwcmmsmactionexcludedparagraphitemsKey];




        ConfigNodePropertyArray* obj = &cqwcmmsmactionexcludedparagraphitems;
		obj->fromJson(value.dump());

    }

    const char *cqwcmmsmactionexcludedpropsKey = "cq.wcm.msm.action.excludedprops";

    if(object.has_key(cqwcmmsmactionexcludedpropsKey))
    {
        bourne::json value = object[cqwcmmsmactionexcludedpropsKey];




        ConfigNodePropertyArray* obj = &cqwcmmsmactionexcludedprops;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqwcmmsmactionexcludednodetypes"] = getCqwcmmsmactionexcludednodetypes().toJson();






	object["cqwcmmsmactionexcludedparagraphitems"] = getCqwcmmsmactionexcludedparagraphitems().toJson();






	object["cqwcmmsmactionexcludedprops"] = getCqwcmmsmactionexcludedprops().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties::getCqwcmmsmactionexcludednodetypes()
{
	return cqwcmmsmactionexcludednodetypes;
}

void
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties::setCqwcmmsmactionexcludednodetypes(ConfigNodePropertyArray cqwcmmsmactionexcludednodetypes)
{
	this->cqwcmmsmactionexcludednodetypes = cqwcmmsmactionexcludednodetypes;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties::getCqwcmmsmactionexcludedparagraphitems()
{
	return cqwcmmsmactionexcludedparagraphitems;
}

void
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties::setCqwcmmsmactionexcludedparagraphitems(ConfigNodePropertyArray cqwcmmsmactionexcludedparagraphitems)
{
	this->cqwcmmsmactionexcludedparagraphitems = cqwcmmsmactionexcludedparagraphitems;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties::getCqwcmmsmactionexcludedprops()
{
	return cqwcmmsmactionexcludedprops;
}

void
ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties::setCqwcmmsmactionexcludedprops(ConfigNodePropertyArray cqwcmmsmactionexcludedprops)
{
	this->cqwcmmsmactionexcludedprops = cqwcmmsmactionexcludedprops;
}



