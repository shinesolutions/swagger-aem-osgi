

#include "ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.h"

using namespace Tiny;

ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties::ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties()
{
	cqwcmmsmactionexcludednodetypes = ConfigNodePropertyArray();
	cqwcmmsmactionexcludedparagraphitems = ConfigNodePropertyArray();
	cqwcmmsmactionexcludedprops = ConfigNodePropertyArray();
	cqwcmmsmactionignoredMixin = ConfigNodePropertyArray();
}

ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties::ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties::~ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties()
{

}

void
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties::fromJson(std::string jsonObj)
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

    const char *cqwcmmsmactionignoredMixinKey = "cq.wcm.msm.action.ignoredMixin";

    if(object.has_key(cqwcmmsmactionignoredMixinKey))
    {
        bourne::json value = object[cqwcmmsmactionignoredMixinKey];




        ConfigNodePropertyArray* obj = &cqwcmmsmactionignoredMixin;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqwcmmsmactionexcludednodetypes"] = getCqwcmmsmactionexcludednodetypes().toJson();






	object["cqwcmmsmactionexcludedparagraphitems"] = getCqwcmmsmactionexcludedparagraphitems().toJson();






	object["cqwcmmsmactionexcludedprops"] = getCqwcmmsmactionexcludedprops().toJson();






	object["cqwcmmsmactionignoredMixin"] = getCqwcmmsmactionignoredMixin().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties::getCqwcmmsmactionexcludednodetypes()
{
	return cqwcmmsmactionexcludednodetypes;
}

void
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties::setCqwcmmsmactionexcludednodetypes(ConfigNodePropertyArray cqwcmmsmactionexcludednodetypes)
{
	this->cqwcmmsmactionexcludednodetypes = cqwcmmsmactionexcludednodetypes;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties::getCqwcmmsmactionexcludedparagraphitems()
{
	return cqwcmmsmactionexcludedparagraphitems;
}

void
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties::setCqwcmmsmactionexcludedparagraphitems(ConfigNodePropertyArray cqwcmmsmactionexcludedparagraphitems)
{
	this->cqwcmmsmactionexcludedparagraphitems = cqwcmmsmactionexcludedparagraphitems;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties::getCqwcmmsmactionexcludedprops()
{
	return cqwcmmsmactionexcludedprops;
}

void
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties::setCqwcmmsmactionexcludedprops(ConfigNodePropertyArray cqwcmmsmactionexcludedprops)
{
	this->cqwcmmsmactionexcludedprops = cqwcmmsmactionexcludedprops;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties::getCqwcmmsmactionignoredMixin()
{
	return cqwcmmsmactionignoredMixin;
}

void
ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties::setCqwcmmsmactionignoredMixin(ConfigNodePropertyArray cqwcmmsmactionignoredMixin)
{
	this->cqwcmmsmactionignoredMixin = cqwcmmsmactionignoredMixin;
}



