/*
 * ComDayCqReportingImplCacheCacheImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqReportingImplCacheCacheImplProperties_H_
#define _ComDayCqReportingImplCacheCacheImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqReportingImplCacheCacheImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReportingImplCacheCacheImplProperties();
	ComDayCqReportingImplCacheCacheImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReportingImplCacheCacheImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRepcacheenable();

	/*! \brief Set 
	 */
	void setRepcacheenable(ConfigNodePropertyBoolean  repcacheenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRepcachettl();

	/*! \brief Set 
	 */
	void setRepcachettl(ConfigNodePropertyInteger  repcachettl);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRepcachemax();

	/*! \brief Set 
	 */
	void setRepcachemax(ConfigNodePropertyInteger  repcachemax);

private:
	ConfigNodePropertyBoolean repcacheenable;
	ConfigNodePropertyInteger repcachettl;
	ConfigNodePropertyInteger repcachemax;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReportingImplCacheCacheImplProperties_H_ */
