
/*
 * OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties_H_


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

class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties();
    OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxItems();

	/*! \brief Set 
	 */
	void setMaxItems(ConfigNodePropertyInteger maxItems);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxPathDepth();

	/*! \brief Set 
	 */
	void setMaxPathDepth(ConfigNodePropertyInteger maxPathDepth);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);


    private:
    ConfigNodePropertyInteger maxItems;
    ConfigNodePropertyInteger maxPathDepth;
    ConfigNodePropertyBoolean enabled;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties_H_ */
