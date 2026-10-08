
/*
 * OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyDropDown.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties();
    OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getProviderType();

	/*! \brief Set 
	 */
	void setProviderType(ConfigNodePropertyDropDown providerType);


    private:
    ConfigNodePropertyDropDown providerType;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties_H_ */
