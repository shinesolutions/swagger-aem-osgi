

#include "ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties()
{
	numberOfDays = ConfigNodePropertyInteger();
	ageOfFile = ConfigNodePropertyInteger();
}

ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::~ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties()
{

}

void
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *numberOfDaysKey = "numberOfDays";

    if(object.has_key(numberOfDaysKey))
    {
        bourne::json value = object[numberOfDaysKey];




        ConfigNodePropertyInteger* obj = &numberOfDays;
		obj->fromJson(value.dump());

    }

    const char *ageOfFileKey = "ageOfFile";

    if(object.has_key(ageOfFileKey))
    {
        bourne::json value = object[ageOfFileKey];




        ConfigNodePropertyInteger* obj = &ageOfFile;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["numberOfDays"] = getNumberOfDays().toJson();






	object["ageOfFile"] = getAgeOfFile().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::getNumberOfDays()
{
	return numberOfDays;
}

void
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::setNumberOfDays(ConfigNodePropertyInteger numberOfDays)
{
	this->numberOfDays = numberOfDays;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::getAgeOfFile()
{
	return ageOfFile;
}

void
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::setAgeOfFile(ConfigNodePropertyInteger ageOfFile)
{
	this->ageOfFile = ageOfFile;
}



