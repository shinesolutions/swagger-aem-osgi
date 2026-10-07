

#include "ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties.h"

using namespace Tiny;

ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties::ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties()
{
	fieldWhitelist = ConfigNodePropertyArray();
}

ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties::ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties::~ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties()
{

}

void
ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fieldWhitelistKey = "fieldWhitelist";

    if(object.has_key(fieldWhitelistKey))
    {
        bourne::json value = object[fieldWhitelistKey];




        ConfigNodePropertyArray* obj = &fieldWhitelist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fieldWhitelist"] = getFieldWhitelist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties::setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}



