/*
 * ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties_H_
#define _ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties_H_


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

class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties();
	ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPreupgrademaintenancetasks();

	/*! \brief Set 
	 */
	void setPreupgrademaintenancetasks(ConfigNodePropertyArray  preupgrademaintenancetasks);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPreupgradehctags();

	/*! \brief Set 
	 */
	void setPreupgradehctags(ConfigNodePropertyArray  preupgradehctags);

private:
	ConfigNodePropertyArray preupgrademaintenancetasks;
	ConfigNodePropertyArray preupgradehctags;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties_H_ */
