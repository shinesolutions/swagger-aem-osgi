
/*
 * ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties();
    ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDeletepathregexps();

	/*! \brief Set 
	 */
	void setDeletepathregexps(ConfigNodePropertyArray deletepathregexps);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDeletesql2query();

	/*! \brief Set 
	 */
	void setDeletesql2query(ConfigNodePropertyString deletesql2query);


    private:
    ConfigNodePropertyArray deletepathregexps;
    ConfigNodePropertyString deletesql2query;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties_H_ */
