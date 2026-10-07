/*
 * ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties.h
 *
 * 
 */

#ifndef _ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties_H_
#define _ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties_H_


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

class ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties();
	ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFormportalinterval();

	/*! \brief Set 
	 */
	void setFormportalinterval(ConfigNodePropertyString  formportalinterval);

private:
	ConfigNodePropertyString formportalinterval;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties_H_ */
