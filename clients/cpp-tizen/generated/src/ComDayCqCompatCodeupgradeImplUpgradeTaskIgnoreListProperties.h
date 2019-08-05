/*
 * ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.h
 *
 * 
 */

#ifndef _ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties_H_
#define _ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties_H_


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

class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties();
	ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUpgradeTaskIgnoreList();

	/*! \brief Set 
	 */
	void setUpgradeTaskIgnoreList(ConfigNodePropertyArray  upgradeTaskIgnoreList);

private:
	ConfigNodePropertyArray upgradeTaskIgnoreList;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties_H_ */
