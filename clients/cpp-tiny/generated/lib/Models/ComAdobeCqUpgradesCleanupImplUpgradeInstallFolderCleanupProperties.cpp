

#include "ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.h"

using namespace Tiny;

ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties()
{
	deletenameregexps = ConfigNodePropertyArray();
}

ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::~ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties()
{

}

void
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *deletenameregexpsKey = "delete.name.regexps";

    if(object.has_key(deletenameregexpsKey))
    {
        bourne::json value = object[deletenameregexpsKey];




        ConfigNodePropertyArray* obj = &deletenameregexps;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["deletenameregexps"] = getDeletenameregexps().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::getDeletenameregexps()
{
	return deletenameregexps;
}

void
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::setDeletenameregexps(ConfigNodePropertyArray deletenameregexps)
{
	this->deletenameregexps = deletenameregexps;
}



