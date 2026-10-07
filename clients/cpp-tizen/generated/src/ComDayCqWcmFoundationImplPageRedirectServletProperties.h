/*
 * ComDayCqWcmFoundationImplPageRedirectServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmFoundationImplPageRedirectServletProperties_H_
#define _ComDayCqWcmFoundationImplPageRedirectServletProperties_H_


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

class ComDayCqWcmFoundationImplPageRedirectServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmFoundationImplPageRedirectServletProperties();
	ComDayCqWcmFoundationImplPageRedirectServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmFoundationImplPageRedirectServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExcludedresourcetypes();

	/*! \brief Set 
	 */
	void setExcludedresourcetypes(ConfigNodePropertyArray  excludedresourcetypes);

private:
	ConfigNodePropertyArray excludedresourcetypes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmFoundationImplPageRedirectServletProperties_H_ */
