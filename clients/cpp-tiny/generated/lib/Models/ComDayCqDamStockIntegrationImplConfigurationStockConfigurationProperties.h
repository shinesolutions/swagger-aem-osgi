
/*
 * ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties();
    ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLocale();

	/*! \brief Set 
	 */
	void setLocale(ConfigNodePropertyString locale);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getImsConfig();

	/*! \brief Set 
	 */
	void setImsConfig(ConfigNodePropertyString imsConfig);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyString locale;
    ConfigNodePropertyString imsConfig;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties_H_ */
