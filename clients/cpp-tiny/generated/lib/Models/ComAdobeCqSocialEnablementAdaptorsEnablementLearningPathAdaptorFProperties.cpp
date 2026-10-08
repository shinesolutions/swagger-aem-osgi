

#include "ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties.h"

using namespace Tiny;

ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties()
{
	isMemberCheck = ConfigNodePropertyBoolean();
}

ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::~ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties()
{

}

void
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *isMemberCheckKey = "isMemberCheck";

    if(object.has_key(isMemberCheckKey))
    {
        bourne::json value = object[isMemberCheckKey];




        ConfigNodePropertyBoolean* obj = &isMemberCheck;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["isMemberCheck"] = getIsMemberCheck().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::getIsMemberCheck()
{
	return isMemberCheck;
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::setIsMemberCheck(ConfigNodePropertyBoolean isMemberCheck)
{
	this->isMemberCheck = isMemberCheck;
}



