/*
 * ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties_H_
#define _ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties_H_


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

class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties();
	ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getTestandtargetendpointurl();

	/*! \brief Set 
	 */
	void setTestandtargetendpointurl(ConfigNodePropertyString  testandtargetendpointurl);

private:
	ConfigNodePropertyString testandtargetendpointurl;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties_H_ */
