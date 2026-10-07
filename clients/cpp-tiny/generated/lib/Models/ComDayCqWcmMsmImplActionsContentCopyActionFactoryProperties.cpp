

#include "ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.h"

using namespace Tiny;

ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties::ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties()
{
	cqwcmmsmactionexcludednodetypes = ConfigNodePropertyArray();
	cqwcmmsmactionexcludedparagraphitems = ConfigNodePropertyArray();
	cqwcmmsmactionexcludedprops = ConfigNodePropertyArray();
	contentcopyactionorderstyle = ConfigNodePropertyDropDown();
}

ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties::ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties::~ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties()
{

}

void
ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties::fromJson(std::string jsonObj)
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

    const char *contentcopyactionorderstyleKey = "contentcopyaction.order.style";

    if(object.has_key(contentcopyactionorderstyleKey))
    {
        bourne::json value = object[contentcopyactionorderstyleKey];




        ConfigNodePropertyDropDown* obj = &contentcopyactionorderstyle;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqwcmmsmactionexcludednodetypes"] = getCqwcmmsmactionexcludednodetypes().toJson();






	object["cqwcmmsmactionexcludedparagraphitems"] = getCqwcmmsmactionexcludedparagraphitems().toJson();






	object["cqwcmmsmactionexcludedprops"] = getCqwcmmsmactionexcludedprops().toJson();






	object["contentcopyactionorderstyle"] = getContentcopyactionorderstyle().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties::getCqwcmmsmactionexcludednodetypes()
{
	return cqwcmmsmactionexcludednodetypes;
}

void
ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties::setCqwcmmsmactionexcludednodetypes(ConfigNodePropertyArray cqwcmmsmactionexcludednodetypes)
{
	this->cqwcmmsmactionexcludednodetypes = cqwcmmsmactionexcludednodetypes;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties::getCqwcmmsmactionexcludedparagraphitems()
{
	return cqwcmmsmactionexcludedparagraphitems;
}

void
ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties::setCqwcmmsmactionexcludedparagraphitems(ConfigNodePropertyArray cqwcmmsmactionexcludedparagraphitems)
{
	this->cqwcmmsmactionexcludedparagraphitems = cqwcmmsmactionexcludedparagraphitems;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties::getCqwcmmsmactionexcludedprops()
{
	return cqwcmmsmactionexcludedprops;
}

void
ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties::setCqwcmmsmactionexcludedprops(ConfigNodePropertyArray cqwcmmsmactionexcludedprops)
{
	this->cqwcmmsmactionexcludedprops = cqwcmmsmactionexcludedprops;
}

ConfigNodePropertyDropDown
ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties::getContentcopyactionorderstyle()
{
	return contentcopyactionorderstyle;
}

void
ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties::setContentcopyactionorderstyle(ConfigNodePropertyDropDown contentcopyactionorderstyle)
{
	this->contentcopyactionorderstyle = contentcopyactionorderstyle;
}



