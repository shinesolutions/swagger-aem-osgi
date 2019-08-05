/*
 * ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties_H_
#define _ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"
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

class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties();
	ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDeletepathregexps();

	/*! \brief Set 
	 */
	void setDeletepathregexps(ConfigNodePropertyArray  deletepathregexps);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDeletesql2query();

	/*! \brief Set 
	 */
	void setDeletesql2query(ConfigNodePropertyString  deletesql2query);

private:
	ConfigNodePropertyArray deletepathregexps;
	ConfigNodePropertyString deletesql2query;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties_H_ */
