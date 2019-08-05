/*
 * ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties_H_
#define _ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties_H_


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

class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties();
	ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqanalyticsadapterfactorycontextstores();

	/*! \brief Set 
	 */
	void setCqanalyticsadapterfactorycontextstores(ConfigNodePropertyArray  cqanalyticsadapterfactorycontextstores);

private:
	ConfigNodePropertyArray cqanalyticsadapterfactorycontextstores;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties_H_ */
