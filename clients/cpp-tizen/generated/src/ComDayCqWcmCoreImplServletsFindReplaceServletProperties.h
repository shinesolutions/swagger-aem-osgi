/*
 * ComDayCqWcmCoreImplServletsFindReplaceServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplServletsFindReplaceServletProperties_H_
#define _ComDayCqWcmCoreImplServletsFindReplaceServletProperties_H_


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

class ComDayCqWcmCoreImplServletsFindReplaceServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplServletsFindReplaceServletProperties();
	ComDayCqWcmCoreImplServletsFindReplaceServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplServletsFindReplaceServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getScope();

	/*! \brief Set 
	 */
	void setScope(ConfigNodePropertyArray  scope);

private:
	ConfigNodePropertyArray scope;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplServletsFindReplaceServletProperties_H_ */
