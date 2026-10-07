

#include "ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.h"

using namespace Tiny;

ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties()
{
	cqwcmmsmactionexcludednodetypes = ConfigNodePropertyArray();
	cqwcmmsmactionexcludedparagraphitems = ConfigNodePropertyArray();
	cqwcmmsmactionexcludedprops = ConfigNodePropertyArray();
	cqwcmmsmimplactionspagemoveprop_referenceUpdate = ConfigNodePropertyBoolean();
}

ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::~ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties()
{

}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::fromJson(std::string jsonObj)
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

    const char *cqwcmmsmimplactionspagemoveprop_referenceUpdateKey = "cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate";

    if(object.has_key(cqwcmmsmimplactionspagemoveprop_referenceUpdateKey))
    {
        bourne::json value = object[cqwcmmsmimplactionspagemoveprop_referenceUpdateKey];




        ConfigNodePropertyBoolean* obj = &cqwcmmsmimplactionspagemoveprop_referenceUpdate;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqwcmmsmactionexcludednodetypes"] = getCqwcmmsmactionexcludednodetypes().toJson();






	object["cqwcmmsmactionexcludedparagraphitems"] = getCqwcmmsmactionexcludedparagraphitems().toJson();






	object["cqwcmmsmactionexcludedprops"] = getCqwcmmsmactionexcludedprops().toJson();






	object["cqwcmmsmimplactionspagemoveprop_referenceUpdate"] = getCqwcmmsmimplactionspagemovepropReferenceUpdate().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::getCqwcmmsmactionexcludednodetypes()
{
	return cqwcmmsmactionexcludednodetypes;
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::setCqwcmmsmactionexcludednodetypes(ConfigNodePropertyArray cqwcmmsmactionexcludednodetypes)
{
	this->cqwcmmsmactionexcludednodetypes = cqwcmmsmactionexcludednodetypes;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::getCqwcmmsmactionexcludedparagraphitems()
{
	return cqwcmmsmactionexcludedparagraphitems;
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::setCqwcmmsmactionexcludedparagraphitems(ConfigNodePropertyArray cqwcmmsmactionexcludedparagraphitems)
{
	this->cqwcmmsmactionexcludedparagraphitems = cqwcmmsmactionexcludedparagraphitems;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::getCqwcmmsmactionexcludedprops()
{
	return cqwcmmsmactionexcludedprops;
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::setCqwcmmsmactionexcludedprops(ConfigNodePropertyArray cqwcmmsmactionexcludedprops)
{
	this->cqwcmmsmactionexcludedprops = cqwcmmsmactionexcludedprops;
}

ConfigNodePropertyBoolean
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::getCqwcmmsmimplactionspagemovepropReferenceUpdate()
{
	return cqwcmmsmimplactionspagemoveprop_referenceUpdate;
}

void
ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties::setCqwcmmsmimplactionspagemovepropReferenceUpdate(ConfigNodePropertyBoolean cqwcmmsmimplactionspagemoveprop_referenceUpdate)
{
	this->cqwcmmsmimplactionspagemoveprop_referenceUpdate = cqwcmmsmimplactionspagemoveprop_referenceUpdate;
}



