

#include "ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties.h"

using namespace Tiny;

ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties::ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties()
{
	cqwcmmsmactionexcludednodetypes = ConfigNodePropertyArray();
	cqwcmmsmactionexcludedparagraphitems = ConfigNodePropertyArray();
	cqwcmmsmactionexcludedprops = ConfigNodePropertyArray();
}

ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties::ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties::~ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties()
{

}

void
ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties::fromJson(std::string jsonObj)
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
ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqwcmmsmactionexcludednodetypes"] = getCqwcmmsmactionexcludednodetypes().toJson();






	object["cqwcmmsmactionexcludedparagraphitems"] = getCqwcmmsmactionexcludedparagraphitems().toJson();






	object["cqwcmmsmactionexcludedprops"] = getCqwcmmsmactionexcludedprops().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties::getCqwcmmsmactionexcludednodetypes()
{
	return cqwcmmsmactionexcludednodetypes;
}

void
ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties::setCqwcmmsmactionexcludednodetypes(ConfigNodePropertyArray cqwcmmsmactionexcludednodetypes)
{
	this->cqwcmmsmactionexcludednodetypes = cqwcmmsmactionexcludednodetypes;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties::getCqwcmmsmactionexcludedparagraphitems()
{
	return cqwcmmsmactionexcludedparagraphitems;
}

void
ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties::setCqwcmmsmactionexcludedparagraphitems(ConfigNodePropertyArray cqwcmmsmactionexcludedparagraphitems)
{
	this->cqwcmmsmactionexcludedparagraphitems = cqwcmmsmactionexcludedparagraphitems;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties::getCqwcmmsmactionexcludedprops()
{
	return cqwcmmsmactionexcludedprops;
}

void
ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties::setCqwcmmsmactionexcludedprops(ConfigNodePropertyArray cqwcmmsmactionexcludedprops)
{
	this->cqwcmmsmactionexcludedprops = cqwcmmsmactionexcludedprops;
}



