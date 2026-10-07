/*
 * ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties_H_
#define _ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties();
	ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDeletenameregexps();

	/*! \brief Set 
	 */
	void setDeletenameregexps(ConfigNodePropertyArray  deletenameregexps);

private:
	ConfigNodePropertyArray deletenameregexps;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties_H_ */
