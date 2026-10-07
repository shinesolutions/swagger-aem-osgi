/*
 * ComDayCqJcrclustersupportClusterStartLevelControllerProperties.h
 *
 * 
 */

#ifndef _ComDayCqJcrclustersupportClusterStartLevelControllerProperties_H_
#define _ComDayCqJcrclustersupportClusterStartLevelControllerProperties_H_


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

class ComDayCqJcrclustersupportClusterStartLevelControllerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqJcrclustersupportClusterStartLevelControllerProperties();
	ComDayCqJcrclustersupportClusterStartLevelControllerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqJcrclustersupportClusterStartLevelControllerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getClusterlevelenable();

	/*! \brief Set 
	 */
	void setClusterlevelenable(ConfigNodePropertyBoolean  clusterlevelenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClustermasterlevel();

	/*! \brief Set 
	 */
	void setClustermasterlevel(ConfigNodePropertyInteger  clustermasterlevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClusterslavelevel();

	/*! \brief Set 
	 */
	void setClusterslavelevel(ConfigNodePropertyInteger  clusterslavelevel);

private:
	ConfigNodePropertyBoolean clusterlevelenable;
	ConfigNodePropertyInteger clustermasterlevel;
	ConfigNodePropertyInteger clusterslavelevel;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqJcrclustersupportClusterStartLevelControllerProperties_H_ */
