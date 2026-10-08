
/*
 * ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties();
    ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDeletenameregexps();

	/*! \brief Set 
	 */
	void setDeletenameregexps(ConfigNodePropertyArray deletenameregexps);


    private:
    ConfigNodePropertyArray deletenameregexps;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties_H_ */
