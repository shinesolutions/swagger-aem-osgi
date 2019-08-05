/*
 * ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreStatsPageViewStatisticsImplProperties_H_
#define _ComDayCqWcmCoreStatsPageViewStatisticsImplProperties_H_


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

class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreStatsPageViewStatisticsImplProperties();
	ComDayCqWcmCoreStatsPageViewStatisticsImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreStatsPageViewStatisticsImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPageviewstatisticstrackingurl();

	/*! \brief Set 
	 */
	void setPageviewstatisticstrackingurl(ConfigNodePropertyString  pageviewstatisticstrackingurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPageviewstatisticstrackingscriptenabled();

	/*! \brief Set 
	 */
	void setPageviewstatisticstrackingscriptenabled(ConfigNodePropertyString  pageviewstatisticstrackingscriptenabled);

private:
	ConfigNodePropertyString pageviewstatisticstrackingurl;
	ConfigNodePropertyString pageviewstatisticstrackingscriptenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreStatsPageViewStatisticsImplProperties_H_ */
