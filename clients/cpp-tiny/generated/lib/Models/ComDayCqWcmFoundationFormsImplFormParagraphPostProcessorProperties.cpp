

#include "ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.h"

using namespace Tiny;

ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties()
{
	formsformparagraphpostprocessorenabled = ConfigNodePropertyBoolean();
	formsformparagraphpostprocessorformresourcetypes = ConfigNodePropertyArray();
}

ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::~ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties()
{

}

void
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *formsformparagraphpostprocessorenabledKey = "forms.formparagraphpostprocessor.enabled";

    if(object.has_key(formsformparagraphpostprocessorenabledKey))
    {
        bourne::json value = object[formsformparagraphpostprocessorenabledKey];




        ConfigNodePropertyBoolean* obj = &formsformparagraphpostprocessorenabled;
		obj->fromJson(value.dump());

    }

    const char *formsformparagraphpostprocessorformresourcetypesKey = "forms.formparagraphpostprocessor.formresourcetypes";

    if(object.has_key(formsformparagraphpostprocessorformresourcetypesKey))
    {
        bourne::json value = object[formsformparagraphpostprocessorformresourcetypesKey];




        ConfigNodePropertyArray* obj = &formsformparagraphpostprocessorformresourcetypes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["formsformparagraphpostprocessorenabled"] = getFormsformparagraphpostprocessorenabled().toJson();






	object["formsformparagraphpostprocessorformresourcetypes"] = getFormsformparagraphpostprocessorformresourcetypes().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::getFormsformparagraphpostprocessorenabled()
{
	return formsformparagraphpostprocessorenabled;
}

void
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::setFormsformparagraphpostprocessorenabled(ConfigNodePropertyBoolean formsformparagraphpostprocessorenabled)
{
	this->formsformparagraphpostprocessorenabled = formsformparagraphpostprocessorenabled;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::getFormsformparagraphpostprocessorformresourcetypes()
{
	return formsformparagraphpostprocessorformresourcetypes;
}

void
ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties::setFormsformparagraphpostprocessorformresourcetypes(ConfigNodePropertyArray formsformparagraphpostprocessorformresourcetypes)
{
	this->formsformparagraphpostprocessorformresourcetypes = formsformparagraphpostprocessorformresourcetypes;
}



