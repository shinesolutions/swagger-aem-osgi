
/*
 * ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties_H_
#define TINY_CPP_CLIENT_ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties();
    ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqanalyticsadapterfactorycontextstores();

	/*! \brief Set 
	 */
	void setCqanalyticsadapterfactorycontextstores(ConfigNodePropertyArray cqanalyticsadapterfactorycontextstores);


    private:
    ConfigNodePropertyArray cqanalyticsadapterfactorycontextstores;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties_H_ */
