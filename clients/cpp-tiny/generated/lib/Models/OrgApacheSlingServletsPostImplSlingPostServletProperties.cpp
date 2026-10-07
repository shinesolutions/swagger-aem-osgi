

#include "OrgApacheSlingServletsPostImplSlingPostServletProperties.h"

using namespace Tiny;

OrgApacheSlingServletsPostImplSlingPostServletProperties::OrgApacheSlingServletsPostImplSlingPostServletProperties()
{
	servletpostdateFormats = ConfigNodePropertyArray();
	servletpostnodeNameHints = ConfigNodePropertyArray();
	servletpostnodeNameMaxLength = ConfigNodePropertyInteger();
	servletpostcheckinNewVersionableNodes = ConfigNodePropertyBoolean();
	servletpostautoCheckout = ConfigNodePropertyBoolean();
	servletpostautoCheckin = ConfigNodePropertyBoolean();
	servletpostignorePattern = ConfigNodePropertyString();
}

OrgApacheSlingServletsPostImplSlingPostServletProperties::OrgApacheSlingServletsPostImplSlingPostServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingServletsPostImplSlingPostServletProperties::~OrgApacheSlingServletsPostImplSlingPostServletProperties()
{

}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servletpostdateFormatsKey = "servlet.post.dateFormats";

    if(object.has_key(servletpostdateFormatsKey))
    {
        bourne::json value = object[servletpostdateFormatsKey];




        ConfigNodePropertyArray* obj = &servletpostdateFormats;
		obj->fromJson(value.dump());

    }

    const char *servletpostnodeNameHintsKey = "servlet.post.nodeNameHints";

    if(object.has_key(servletpostnodeNameHintsKey))
    {
        bourne::json value = object[servletpostnodeNameHintsKey];




        ConfigNodePropertyArray* obj = &servletpostnodeNameHints;
		obj->fromJson(value.dump());

    }

    const char *servletpostnodeNameMaxLengthKey = "servlet.post.nodeNameMaxLength";

    if(object.has_key(servletpostnodeNameMaxLengthKey))
    {
        bourne::json value = object[servletpostnodeNameMaxLengthKey];




        ConfigNodePropertyInteger* obj = &servletpostnodeNameMaxLength;
		obj->fromJson(value.dump());

    }

    const char *servletpostcheckinNewVersionableNodesKey = "servlet.post.checkinNewVersionableNodes";

    if(object.has_key(servletpostcheckinNewVersionableNodesKey))
    {
        bourne::json value = object[servletpostcheckinNewVersionableNodesKey];




        ConfigNodePropertyBoolean* obj = &servletpostcheckinNewVersionableNodes;
		obj->fromJson(value.dump());

    }

    const char *servletpostautoCheckoutKey = "servlet.post.autoCheckout";

    if(object.has_key(servletpostautoCheckoutKey))
    {
        bourne::json value = object[servletpostautoCheckoutKey];




        ConfigNodePropertyBoolean* obj = &servletpostautoCheckout;
		obj->fromJson(value.dump());

    }

    const char *servletpostautoCheckinKey = "servlet.post.autoCheckin";

    if(object.has_key(servletpostautoCheckinKey))
    {
        bourne::json value = object[servletpostautoCheckinKey];




        ConfigNodePropertyBoolean* obj = &servletpostautoCheckin;
		obj->fromJson(value.dump());

    }

    const char *servletpostignorePatternKey = "servlet.post.ignorePattern";

    if(object.has_key(servletpostignorePatternKey))
    {
        bourne::json value = object[servletpostignorePatternKey];




        ConfigNodePropertyString* obj = &servletpostignorePattern;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingServletsPostImplSlingPostServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["servletpostdateFormats"] = getServletpostdateFormats().toJson();






	object["servletpostnodeNameHints"] = getServletpostnodeNameHints().toJson();






	object["servletpostnodeNameMaxLength"] = getServletpostnodeNameMaxLength().toJson();






	object["servletpostcheckinNewVersionableNodes"] = getServletpostcheckinNewVersionableNodes().toJson();






	object["servletpostautoCheckout"] = getServletpostautoCheckout().toJson();






	object["servletpostautoCheckin"] = getServletpostautoCheckin().toJson();






	object["servletpostignorePattern"] = getServletpostignorePattern().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingServletsPostImplSlingPostServletProperties::getServletpostdateFormats()
{
	return servletpostdateFormats;
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::setServletpostdateFormats(ConfigNodePropertyArray servletpostdateFormats)
{
	this->servletpostdateFormats = servletpostdateFormats;
}

ConfigNodePropertyArray
OrgApacheSlingServletsPostImplSlingPostServletProperties::getServletpostnodeNameHints()
{
	return servletpostnodeNameHints;
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::setServletpostnodeNameHints(ConfigNodePropertyArray servletpostnodeNameHints)
{
	this->servletpostnodeNameHints = servletpostnodeNameHints;
}

ConfigNodePropertyInteger
OrgApacheSlingServletsPostImplSlingPostServletProperties::getServletpostnodeNameMaxLength()
{
	return servletpostnodeNameMaxLength;
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::setServletpostnodeNameMaxLength(ConfigNodePropertyInteger servletpostnodeNameMaxLength)
{
	this->servletpostnodeNameMaxLength = servletpostnodeNameMaxLength;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsPostImplSlingPostServletProperties::getServletpostcheckinNewVersionableNodes()
{
	return servletpostcheckinNewVersionableNodes;
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::setServletpostcheckinNewVersionableNodes(ConfigNodePropertyBoolean servletpostcheckinNewVersionableNodes)
{
	this->servletpostcheckinNewVersionableNodes = servletpostcheckinNewVersionableNodes;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsPostImplSlingPostServletProperties::getServletpostautoCheckout()
{
	return servletpostautoCheckout;
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::setServletpostautoCheckout(ConfigNodePropertyBoolean servletpostautoCheckout)
{
	this->servletpostautoCheckout = servletpostautoCheckout;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsPostImplSlingPostServletProperties::getServletpostautoCheckin()
{
	return servletpostautoCheckin;
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::setServletpostautoCheckin(ConfigNodePropertyBoolean servletpostautoCheckin)
{
	this->servletpostautoCheckin = servletpostautoCheckin;
}

ConfigNodePropertyString
OrgApacheSlingServletsPostImplSlingPostServletProperties::getServletpostignorePattern()
{
	return servletpostignorePattern;
}

void
OrgApacheSlingServletsPostImplSlingPostServletProperties::setServletpostignorePattern(ConfigNodePropertyString servletpostignorePattern)
{
	this->servletpostignorePattern = servletpostignorePattern;
}



