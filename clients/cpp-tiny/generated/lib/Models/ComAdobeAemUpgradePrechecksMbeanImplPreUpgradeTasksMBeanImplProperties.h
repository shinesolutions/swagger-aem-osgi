
/*
 * ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties_H_


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

class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties();
    ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPreupgrademaintenancetasks();

	/*! \brief Set 
	 */
	void setPreupgrademaintenancetasks(ConfigNodePropertyArray preupgrademaintenancetasks);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPreupgradehctags();

	/*! \brief Set 
	 */
	void setPreupgradehctags(ConfigNodePropertyArray preupgradehctags);


    private:
    ConfigNodePropertyArray preupgrademaintenancetasks;
    ConfigNodePropertyArray preupgradehctags;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties_H_ */
