/*
 * ComDayCqWcmCoreImplWarpTimeWarpFilterProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplWarpTimeWarpFilterProperties_H_
#define _ComDayCqWcmCoreImplWarpTimeWarpFilterProperties_H_


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

class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplWarpTimeWarpFilterProperties();
	ComDayCqWcmCoreImplWarpTimeWarpFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplWarpTimeWarpFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFilterorder();

	/*! \brief Set 
	 */
	void setFilterorder(ConfigNodePropertyString  filterorder);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFilterscope();

	/*! \brief Set 
	 */
	void setFilterscope(ConfigNodePropertyString  filterscope);

private:
	ConfigNodePropertyString filterorder;
	ConfigNodePropertyString filterscope;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplWarpTimeWarpFilterProperties_H_ */
