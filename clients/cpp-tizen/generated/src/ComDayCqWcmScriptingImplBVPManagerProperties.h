/*
 * ComDayCqWcmScriptingImplBVPManagerProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmScriptingImplBVPManagerProperties_H_
#define _ComDayCqWcmScriptingImplBVPManagerProperties_H_


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

class ComDayCqWcmScriptingImplBVPManagerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmScriptingImplBVPManagerProperties();
	ComDayCqWcmScriptingImplBVPManagerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmScriptingImplBVPManagerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComdaycqwcmscriptingbvpscriptengines();

	/*! \brief Set 
	 */
	void setComdaycqwcmscriptingbvpscriptengines(ConfigNodePropertyArray  comdaycqwcmscriptingbvpscriptengines);

private:
	ConfigNodePropertyArray comdaycqwcmscriptingbvpscriptengines;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmScriptingImplBVPManagerProperties_H_ */
