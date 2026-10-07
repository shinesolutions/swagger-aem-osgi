/*
 * ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties_H_
#define _ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties_H_


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

class ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties();
	ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletpaths();

	/*! \brief Set 
	 */
	void setSlingservletpaths(ConfigNodePropertyString  slingservletpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyString  slingservletmethods);

private:
	ConfigNodePropertyString slingservletpaths;
	ConfigNodePropertyString slingservletmethods;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties_H_ */
