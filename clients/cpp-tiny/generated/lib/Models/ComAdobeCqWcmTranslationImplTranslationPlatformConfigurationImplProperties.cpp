

#include "ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.h"

using namespace Tiny;

ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties()
{
	syncTranslationStateschedulingFormat = ConfigNodePropertyString();
	schedulingRepeatTranslationschedulingFormat = ConfigNodePropertyString();
	syncTranslationStatelockTimeoutInMinutes = ConfigNodePropertyString();
	exportformat = ConfigNodePropertyDropDown();
}

ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::~ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties()
{

}

void
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *syncTranslationStateschedulingFormatKey = "syncTranslationState.schedulingFormat";

    if(object.has_key(syncTranslationStateschedulingFormatKey))
    {
        bourne::json value = object[syncTranslationStateschedulingFormatKey];




        ConfigNodePropertyString* obj = &syncTranslationStateschedulingFormat;
		obj->fromJson(value.dump());

    }

    const char *schedulingRepeatTranslationschedulingFormatKey = "schedulingRepeatTranslation.schedulingFormat";

    if(object.has_key(schedulingRepeatTranslationschedulingFormatKey))
    {
        bourne::json value = object[schedulingRepeatTranslationschedulingFormatKey];




        ConfigNodePropertyString* obj = &schedulingRepeatTranslationschedulingFormat;
		obj->fromJson(value.dump());

    }

    const char *syncTranslationStatelockTimeoutInMinutesKey = "syncTranslationState.lockTimeoutInMinutes";

    if(object.has_key(syncTranslationStatelockTimeoutInMinutesKey))
    {
        bourne::json value = object[syncTranslationStatelockTimeoutInMinutesKey];




        ConfigNodePropertyString* obj = &syncTranslationStatelockTimeoutInMinutes;
		obj->fromJson(value.dump());

    }

    const char *exportformatKey = "export.format";

    if(object.has_key(exportformatKey))
    {
        bourne::json value = object[exportformatKey];




        ConfigNodePropertyDropDown* obj = &exportformat;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["syncTranslationStateschedulingFormat"] = getSyncTranslationStateschedulingFormat().toJson();






	object["schedulingRepeatTranslationschedulingFormat"] = getSchedulingRepeatTranslationschedulingFormat().toJson();






	object["syncTranslationStatelockTimeoutInMinutes"] = getSyncTranslationStatelockTimeoutInMinutes().toJson();






	object["exportformat"] = getExportformat().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::getSyncTranslationStateschedulingFormat()
{
	return syncTranslationStateschedulingFormat;
}

void
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::setSyncTranslationStateschedulingFormat(ConfigNodePropertyString syncTranslationStateschedulingFormat)
{
	this->syncTranslationStateschedulingFormat = syncTranslationStateschedulingFormat;
}

ConfigNodePropertyString
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::getSchedulingRepeatTranslationschedulingFormat()
{
	return schedulingRepeatTranslationschedulingFormat;
}

void
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::setSchedulingRepeatTranslationschedulingFormat(ConfigNodePropertyString schedulingRepeatTranslationschedulingFormat)
{
	this->schedulingRepeatTranslationschedulingFormat = schedulingRepeatTranslationschedulingFormat;
}

ConfigNodePropertyString
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::getSyncTranslationStatelockTimeoutInMinutes()
{
	return syncTranslationStatelockTimeoutInMinutes;
}

void
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::setSyncTranslationStatelockTimeoutInMinutes(ConfigNodePropertyString syncTranslationStatelockTimeoutInMinutes)
{
	this->syncTranslationStatelockTimeoutInMinutes = syncTranslationStatelockTimeoutInMinutes;
}

ConfigNodePropertyDropDown
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::getExportformat()
{
	return exportformat;
}

void
ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties::setExportformat(ConfigNodePropertyDropDown exportformat)
{
	this->exportformat = exportformat;
}



