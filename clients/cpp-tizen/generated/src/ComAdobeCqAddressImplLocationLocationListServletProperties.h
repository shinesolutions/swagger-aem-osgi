/*
 * ComAdobeCqAddressImplLocationLocationListServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqAddressImplLocationLocationListServletProperties_H_
#define _ComAdobeCqAddressImplLocationLocationListServletProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqAddressImplLocationLocationListServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqAddressImplLocationLocationListServletProperties();
	ComAdobeCqAddressImplLocationLocationListServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqAddressImplLocationLocationListServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqaddresslocationdefaultmaxResults();

	/*! \brief Set 
	 */
	void setCqaddresslocationdefaultmaxResults(ConfigNodePropertyInteger  cqaddresslocationdefaultmaxResults);

private:
	ConfigNodePropertyInteger cqaddresslocationdefaultmaxResults;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqAddressImplLocationLocationListServletProperties_H_ */
