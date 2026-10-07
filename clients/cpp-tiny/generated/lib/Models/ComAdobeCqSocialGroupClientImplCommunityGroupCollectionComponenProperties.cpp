

#include "ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.h"

using namespace Tiny;

ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties()
{
	grouplistingpaginationenable = ConfigNodePropertyBoolean();
	grouplistinglazyloadingenable = ConfigNodePropertyBoolean();
	pagesize = ConfigNodePropertyInteger();
	priority = ConfigNodePropertyInteger();
}

ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::~ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties()
{

}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *grouplistingpaginationenableKey = "group.listing.pagination.enable";

    if(object.has_key(grouplistingpaginationenableKey))
    {
        bourne::json value = object[grouplistingpaginationenableKey];




        ConfigNodePropertyBoolean* obj = &grouplistingpaginationenable;
		obj->fromJson(value.dump());

    }

    const char *grouplistinglazyloadingenableKey = "group.listing.lazyloading.enable";

    if(object.has_key(grouplistinglazyloadingenableKey))
    {
        bourne::json value = object[grouplistinglazyloadingenableKey];




        ConfigNodePropertyBoolean* obj = &grouplistinglazyloadingenable;
		obj->fromJson(value.dump());

    }

    const char *pagesizeKey = "page.size";

    if(object.has_key(pagesizeKey))
    {
        bourne::json value = object[pagesizeKey];




        ConfigNodePropertyInteger* obj = &pagesize;
		obj->fromJson(value.dump());

    }

    const char *priorityKey = "priority";

    if(object.has_key(priorityKey))
    {
        bourne::json value = object[priorityKey];




        ConfigNodePropertyInteger* obj = &priority;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["grouplistingpaginationenable"] = getGrouplistingpaginationenable().toJson();






	object["grouplistinglazyloadingenable"] = getGrouplistinglazyloadingenable().toJson();






	object["pagesize"] = getPagesize().toJson();






	object["priority"] = getPriority().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::getGrouplistingpaginationenable()
{
	return grouplistingpaginationenable;
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::setGrouplistingpaginationenable(ConfigNodePropertyBoolean grouplistingpaginationenable)
{
	this->grouplistingpaginationenable = grouplistingpaginationenable;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::getGrouplistinglazyloadingenable()
{
	return grouplistinglazyloadingenable;
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::setGrouplistinglazyloadingenable(ConfigNodePropertyBoolean grouplistinglazyloadingenable)
{
	this->grouplistinglazyloadingenable = grouplistinglazyloadingenable;
}

ConfigNodePropertyInteger
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::getPagesize()
{
	return pagesize;
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::setPagesize(ConfigNodePropertyInteger pagesize)
{
	this->pagesize = pagesize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::setPriority(ConfigNodePropertyInteger priority)
{
	this->priority = priority;
}



