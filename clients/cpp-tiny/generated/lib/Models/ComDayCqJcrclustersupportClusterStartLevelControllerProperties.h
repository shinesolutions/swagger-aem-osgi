
/*
 * ComDayCqJcrclustersupportClusterStartLevelControllerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqJcrclustersupportClusterStartLevelControllerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqJcrclustersupportClusterStartLevelControllerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqJcrclustersupportClusterStartLevelControllerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqJcrclustersupportClusterStartLevelControllerProperties();
    ComDayCqJcrclustersupportClusterStartLevelControllerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqJcrclustersupportClusterStartLevelControllerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getClusterlevelenable();

	/*! \brief Set 
	 */
	void setClusterlevelenable(ConfigNodePropertyBoolean clusterlevelenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClustermasterlevel();

	/*! \brief Set 
	 */
	void setClustermasterlevel(ConfigNodePropertyInteger clustermasterlevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClusterslavelevel();

	/*! \brief Set 
	 */
	void setClusterslavelevel(ConfigNodePropertyInteger clusterslavelevel);


    private:
    ConfigNodePropertyBoolean clusterlevelenable;
    ConfigNodePropertyInteger clustermasterlevel;
    ConfigNodePropertyInteger clusterslavelevel;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqJcrclustersupportClusterStartLevelControllerProperties_H_ */
