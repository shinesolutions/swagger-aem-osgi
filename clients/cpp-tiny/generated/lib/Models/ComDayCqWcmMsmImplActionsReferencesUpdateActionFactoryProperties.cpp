

#include "ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.h"

using namespace Tiny;

ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties()
{
	cqwcmmsmactionexcludednodetypes = ConfigNodePropertyArray();
	cqwcmmsmactionexcludedparagraphitems = ConfigNodePropertyArray();
	cqwcmmsmactionexcludedprops = ConfigNodePropertyArray();
	cqwcmmsmimplactionreferencesupdateprop_updateNested = ConfigNodePropertyBoolean();
}

ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::~ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties()
{

}

void
ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::fromJson(std::string jsonObj)
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

    const char *cqwcmmsmimplactionreferencesupdateprop_updateNestedKey = "cq.wcm.msm.impl.action.referencesupdate.prop_updateNested";

    if(object.has_key(cqwcmmsmimplactionreferencesupdateprop_updateNestedKey))
    {
        bourne::json value = object[cqwcmmsmimplactionreferencesupdateprop_updateNestedKey];




        ConfigNodePropertyBoolean* obj = &cqwcmmsmimplactionreferencesupdateprop_updateNested;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqwcmmsmactionexcludednodetypes"] = getCqwcmmsmactionexcludednodetypes().toJson();






	object["cqwcmmsmactionexcludedparagraphitems"] = getCqwcmmsmactionexcludedparagraphitems().toJson();






	object["cqwcmmsmactionexcludedprops"] = getCqwcmmsmactionexcludedprops().toJson();






	object["cqwcmmsmimplactionreferencesupdateprop_updateNested"] = getCqwcmmsmimplactionreferencesupdatepropUpdateNested().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::getCqwcmmsmactionexcludednodetypes()
{
	return cqwcmmsmactionexcludednodetypes;
}

void
ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::setCqwcmmsmactionexcludednodetypes(ConfigNodePropertyArray cqwcmmsmactionexcludednodetypes)
{
	this->cqwcmmsmactionexcludednodetypes = cqwcmmsmactionexcludednodetypes;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::getCqwcmmsmactionexcludedparagraphitems()
{
	return cqwcmmsmactionexcludedparagraphitems;
}

void
ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::setCqwcmmsmactionexcludedparagraphitems(ConfigNodePropertyArray cqwcmmsmactionexcludedparagraphitems)
{
	this->cqwcmmsmactionexcludedparagraphitems = cqwcmmsmactionexcludedparagraphitems;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::getCqwcmmsmactionexcludedprops()
{
	return cqwcmmsmactionexcludedprops;
}

void
ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::setCqwcmmsmactionexcludedprops(ConfigNodePropertyArray cqwcmmsmactionexcludedprops)
{
	this->cqwcmmsmactionexcludedprops = cqwcmmsmactionexcludedprops;
}

ConfigNodePropertyBoolean
ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::getCqwcmmsmimplactionreferencesupdatepropUpdateNested()
{
	return cqwcmmsmimplactionreferencesupdateprop_updateNested;
}

void
ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::setCqwcmmsmimplactionreferencesupdatepropUpdateNested(ConfigNodePropertyBoolean cqwcmmsmimplactionreferencesupdateprop_updateNested)
{
	this->cqwcmmsmimplactionreferencesupdateprop_updateNested = cqwcmmsmimplactionreferencesupdateprop_updateNested;
}



