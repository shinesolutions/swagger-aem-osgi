

#include "ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.h"

using namespace Tiny;

ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties()
{
	group2memberrelationshipoutgoing = ConfigNodePropertyString();
	group2memberexcludedoutgoing = ConfigNodePropertyArray();
	group2memberrelationshipincoming = ConfigNodePropertyString();
	group2memberexcludedincoming = ConfigNodePropertyArray();
}

ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::~ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties()
{

}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *group2memberrelationshipoutgoingKey = "group2member.relationship.outgoing";

    if(object.has_key(group2memberrelationshipoutgoingKey))
    {
        bourne::json value = object[group2memberrelationshipoutgoingKey];




        ConfigNodePropertyString* obj = &group2memberrelationshipoutgoing;
		obj->fromJson(value.dump());

    }

    const char *group2memberexcludedoutgoingKey = "group2member.excluded.outgoing";

    if(object.has_key(group2memberexcludedoutgoingKey))
    {
        bourne::json value = object[group2memberexcludedoutgoingKey];




        ConfigNodePropertyArray* obj = &group2memberexcludedoutgoing;
		obj->fromJson(value.dump());

    }

    const char *group2memberrelationshipincomingKey = "group2member.relationship.incoming";

    if(object.has_key(group2memberrelationshipincomingKey))
    {
        bourne::json value = object[group2memberrelationshipincomingKey];




        ConfigNodePropertyString* obj = &group2memberrelationshipincoming;
		obj->fromJson(value.dump());

    }

    const char *group2memberexcludedincomingKey = "group2member.excluded.incoming";

    if(object.has_key(group2memberexcludedincomingKey))
    {
        bourne::json value = object[group2memberexcludedincomingKey];




        ConfigNodePropertyArray* obj = &group2memberexcludedincoming;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["group2memberrelationshipoutgoing"] = getGroup2memberrelationshipoutgoing().toJson();






	object["group2memberexcludedoutgoing"] = getGroup2memberexcludedoutgoing().toJson();






	object["group2memberrelationshipincoming"] = getGroup2memberrelationshipincoming().toJson();






	object["group2memberexcludedincoming"] = getGroup2memberexcludedincoming().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::getGroup2memberrelationshipoutgoing()
{
	return group2memberrelationshipoutgoing;
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::setGroup2memberrelationshipoutgoing(ConfigNodePropertyString group2memberrelationshipoutgoing)
{
	this->group2memberrelationshipoutgoing = group2memberrelationshipoutgoing;
}

ConfigNodePropertyArray
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::getGroup2memberexcludedoutgoing()
{
	return group2memberexcludedoutgoing;
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::setGroup2memberexcludedoutgoing(ConfigNodePropertyArray group2memberexcludedoutgoing)
{
	this->group2memberexcludedoutgoing = group2memberexcludedoutgoing;
}

ConfigNodePropertyString
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::getGroup2memberrelationshipincoming()
{
	return group2memberrelationshipincoming;
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::setGroup2memberrelationshipincoming(ConfigNodePropertyString group2memberrelationshipincoming)
{
	this->group2memberrelationshipincoming = group2memberrelationshipincoming;
}

ConfigNodePropertyArray
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::getGroup2memberexcludedincoming()
{
	return group2memberexcludedincoming;
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::setGroup2memberexcludedincoming(ConfigNodePropertyArray group2memberexcludedincoming)
{
	this->group2memberexcludedincoming = group2memberexcludedincoming;
}



