

#include "ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties()
{
	createPreviewEnabled = ConfigNodePropertyBoolean();
	updatePreviewEnabled = ConfigNodePropertyBoolean();
	queueSize = ConfigNodePropertyInteger();
	folderPreviewRenditionRegex = ConfigNodePropertyString();
}

ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::~ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties()
{

}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *createPreviewEnabledKey = "createPreviewEnabled";

    if(object.has_key(createPreviewEnabledKey))
    {
        bourne::json value = object[createPreviewEnabledKey];




        ConfigNodePropertyBoolean* obj = &createPreviewEnabled;
		obj->fromJson(value.dump());

    }

    const char *updatePreviewEnabledKey = "updatePreviewEnabled";

    if(object.has_key(updatePreviewEnabledKey))
    {
        bourne::json value = object[updatePreviewEnabledKey];




        ConfigNodePropertyBoolean* obj = &updatePreviewEnabled;
		obj->fromJson(value.dump());

    }

    const char *queueSizeKey = "queueSize";

    if(object.has_key(queueSizeKey))
    {
        bourne::json value = object[queueSizeKey];




        ConfigNodePropertyInteger* obj = &queueSize;
		obj->fromJson(value.dump());

    }

    const char *folderPreviewRenditionRegexKey = "folderPreviewRenditionRegex";

    if(object.has_key(folderPreviewRenditionRegexKey))
    {
        bourne::json value = object[folderPreviewRenditionRegexKey];




        ConfigNodePropertyString* obj = &folderPreviewRenditionRegex;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["createPreviewEnabled"] = getCreatePreviewEnabled().toJson();






	object["updatePreviewEnabled"] = getUpdatePreviewEnabled().toJson();






	object["queueSize"] = getQueueSize().toJson();






	object["folderPreviewRenditionRegex"] = getFolderPreviewRenditionRegex().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::getCreatePreviewEnabled()
{
	return createPreviewEnabled;
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::setCreatePreviewEnabled(ConfigNodePropertyBoolean createPreviewEnabled)
{
	this->createPreviewEnabled = createPreviewEnabled;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::getUpdatePreviewEnabled()
{
	return updatePreviewEnabled;
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::setUpdatePreviewEnabled(ConfigNodePropertyBoolean updatePreviewEnabled)
{
	this->updatePreviewEnabled = updatePreviewEnabled;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::getQueueSize()
{
	return queueSize;
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::setQueueSize(ConfigNodePropertyInteger queueSize)
{
	this->queueSize = queueSize;
}

ConfigNodePropertyString
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::getFolderPreviewRenditionRegex()
{
	return folderPreviewRenditionRegex;
}

void
ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties::setFolderPreviewRenditionRegex(ConfigNodePropertyString folderPreviewRenditionRegex)
{
	this->folderPreviewRenditionRegex = folderPreviewRenditionRegex;
}



