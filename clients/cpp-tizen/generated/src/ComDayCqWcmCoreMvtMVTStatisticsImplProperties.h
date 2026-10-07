/*
 * ComDayCqWcmCoreMvtMVTStatisticsImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreMvtMVTStatisticsImplProperties_H_
#define _ComDayCqWcmCoreMvtMVTStatisticsImplProperties_H_


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

class ComDayCqWcmCoreMvtMVTStatisticsImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreMvtMVTStatisticsImplProperties();
	ComDayCqWcmCoreMvtMVTStatisticsImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreMvtMVTStatisticsImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMvtstatisticstrackingurl();

	/*! \brief Set 
	 */
	void setMvtstatisticstrackingurl(ConfigNodePropertyString  mvtstatisticstrackingurl);

private:
	ConfigNodePropertyString mvtstatisticstrackingurl;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreMvtMVTStatisticsImplProperties_H_ */
