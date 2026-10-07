/*
 * ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties_H_
#define _ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties_H_


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

class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties();
	ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBatchcommitsize();

	/*! \brief Set 
	 */
	void setBatchcommitsize(ConfigNodePropertyInteger  batchcommitsize);

private:
	ConfigNodePropertyInteger batchcommitsize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties_H_ */
