/*
 * AnalyticsComponentQueryCacheServiceProperties.h
 *
 * 
 */

#ifndef _AnalyticsComponentQueryCacheServiceProperties_H_
#define _AnalyticsComponentQueryCacheServiceProperties_H_


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

class AnalyticsComponentQueryCacheServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	AnalyticsComponentQueryCacheServiceProperties();
	AnalyticsComponentQueryCacheServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AnalyticsComponentQueryCacheServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqanalyticscomponentquerycachesize();

	/*! \brief Set 
	 */
	void setCqanalyticscomponentquerycachesize(ConfigNodePropertyInteger  cqanalyticscomponentquerycachesize);

private:
	ConfigNodePropertyInteger cqanalyticscomponentquerycachesize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AnalyticsComponentQueryCacheServiceProperties_H_ */
