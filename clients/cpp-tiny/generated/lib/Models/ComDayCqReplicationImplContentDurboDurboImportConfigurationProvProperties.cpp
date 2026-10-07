

#include "ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.h"

using namespace Tiny;

ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties()
{
	preservehierarchynodes = ConfigNodePropertyBoolean();
	ignoreversioning = ConfigNodePropertyBoolean();
	importacl = ConfigNodePropertyBoolean();
	savethreshold = ConfigNodePropertyInteger();
	preserveuserpaths = ConfigNodePropertyBoolean();
	preserveuuid = ConfigNodePropertyBoolean();
	preserveuuidnodetypes = ConfigNodePropertyArray();
	preserveuuidsubtrees = ConfigNodePropertyArray();
	autocommit = ConfigNodePropertyBoolean();
}

ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::~ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties()
{

}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *preservehierarchynodesKey = "preserve.hierarchy.nodes";

    if(object.has_key(preservehierarchynodesKey))
    {
        bourne::json value = object[preservehierarchynodesKey];




        ConfigNodePropertyBoolean* obj = &preservehierarchynodes;
		obj->fromJson(value.dump());

    }

    const char *ignoreversioningKey = "ignore.versioning";

    if(object.has_key(ignoreversioningKey))
    {
        bourne::json value = object[ignoreversioningKey];




        ConfigNodePropertyBoolean* obj = &ignoreversioning;
		obj->fromJson(value.dump());

    }

    const char *importaclKey = "import.acl";

    if(object.has_key(importaclKey))
    {
        bourne::json value = object[importaclKey];




        ConfigNodePropertyBoolean* obj = &importacl;
		obj->fromJson(value.dump());

    }

    const char *savethresholdKey = "save.threshold";

    if(object.has_key(savethresholdKey))
    {
        bourne::json value = object[savethresholdKey];




        ConfigNodePropertyInteger* obj = &savethreshold;
		obj->fromJson(value.dump());

    }

    const char *preserveuserpathsKey = "preserve.user.paths";

    if(object.has_key(preserveuserpathsKey))
    {
        bourne::json value = object[preserveuserpathsKey];




        ConfigNodePropertyBoolean* obj = &preserveuserpaths;
		obj->fromJson(value.dump());

    }

    const char *preserveuuidKey = "preserve.uuid";

    if(object.has_key(preserveuuidKey))
    {
        bourne::json value = object[preserveuuidKey];




        ConfigNodePropertyBoolean* obj = &preserveuuid;
		obj->fromJson(value.dump());

    }

    const char *preserveuuidnodetypesKey = "preserve.uuid.nodetypes";

    if(object.has_key(preserveuuidnodetypesKey))
    {
        bourne::json value = object[preserveuuidnodetypesKey];




        ConfigNodePropertyArray* obj = &preserveuuidnodetypes;
		obj->fromJson(value.dump());

    }

    const char *preserveuuidsubtreesKey = "preserve.uuid.subtrees";

    if(object.has_key(preserveuuidsubtreesKey))
    {
        bourne::json value = object[preserveuuidsubtreesKey];




        ConfigNodePropertyArray* obj = &preserveuuidsubtrees;
		obj->fromJson(value.dump());

    }

    const char *autocommitKey = "auto.commit";

    if(object.has_key(autocommitKey))
    {
        bourne::json value = object[autocommitKey];




        ConfigNodePropertyBoolean* obj = &autocommit;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["preservehierarchynodes"] = getPreservehierarchynodes().toJson();






	object["ignoreversioning"] = getIgnoreversioning().toJson();






	object["importacl"] = getImportacl().toJson();






	object["savethreshold"] = getSavethreshold().toJson();






	object["preserveuserpaths"] = getPreserveuserpaths().toJson();






	object["preserveuuid"] = getPreserveuuid().toJson();






	object["preserveuuidnodetypes"] = getPreserveuuidnodetypes().toJson();






	object["preserveuuidsubtrees"] = getPreserveuuidsubtrees().toJson();






	object["autocommit"] = getAutocommit().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getPreservehierarchynodes()
{
	return preservehierarchynodes;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setPreservehierarchynodes(ConfigNodePropertyBoolean preservehierarchynodes)
{
	this->preservehierarchynodes = preservehierarchynodes;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getIgnoreversioning()
{
	return ignoreversioning;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setIgnoreversioning(ConfigNodePropertyBoolean ignoreversioning)
{
	this->ignoreversioning = ignoreversioning;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getImportacl()
{
	return importacl;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setImportacl(ConfigNodePropertyBoolean importacl)
{
	this->importacl = importacl;
}

ConfigNodePropertyInteger
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getSavethreshold()
{
	return savethreshold;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setSavethreshold(ConfigNodePropertyInteger savethreshold)
{
	this->savethreshold = savethreshold;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getPreserveuserpaths()
{
	return preserveuserpaths;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setPreserveuserpaths(ConfigNodePropertyBoolean preserveuserpaths)
{
	this->preserveuserpaths = preserveuserpaths;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getPreserveuuid()
{
	return preserveuuid;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setPreserveuuid(ConfigNodePropertyBoolean preserveuuid)
{
	this->preserveuuid = preserveuuid;
}

ConfigNodePropertyArray
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getPreserveuuidnodetypes()
{
	return preserveuuidnodetypes;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setPreserveuuidnodetypes(ConfigNodePropertyArray preserveuuidnodetypes)
{
	this->preserveuuidnodetypes = preserveuuidnodetypes;
}

ConfigNodePropertyArray
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getPreserveuuidsubtrees()
{
	return preserveuuidsubtrees;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setPreserveuuidsubtrees(ConfigNodePropertyArray preserveuuidsubtrees)
{
	this->preserveuuidsubtrees = preserveuuidsubtrees;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getAutocommit()
{
	return autocommit;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setAutocommit(ConfigNodePropertyBoolean autocommit)
{
	this->autocommit = autocommit;
}



