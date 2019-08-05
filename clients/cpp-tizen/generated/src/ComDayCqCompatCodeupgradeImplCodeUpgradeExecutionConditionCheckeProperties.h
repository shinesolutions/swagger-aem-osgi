/*
 * ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.h
 *
 * 
 */

#ifndef _ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties_H_
#define _ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties_H_


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

class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties();
	ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCodeupgradetasks();

	/*! \brief Set 
	 */
	void setCodeupgradetasks(ConfigNodePropertyArray  codeupgradetasks);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCodeupgradetaskfilters();

	/*! \brief Set 
	 */
	void setCodeupgradetaskfilters(ConfigNodePropertyArray  codeupgradetaskfilters);

private:
	ConfigNodePropertyArray codeupgradetasks;
	ConfigNodePropertyArray codeupgradetaskfilters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties_H_ */
