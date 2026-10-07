/*
 * ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.h
 *
 * 
 */

#ifndef _ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties_H_
#define _ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties_H_


#include <string>
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

class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties();
	ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEffectiveBundleListPath();

	/*! \brief Set 
	 */
	void setEffectiveBundleListPath(ConfigNodePropertyString  effectiveBundleListPath);

private:
	ConfigNodePropertyString effectiveBundleListPath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties_H_ */
