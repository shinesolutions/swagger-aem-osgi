
/*
 * OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties();
    OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getHcname();

	/*! \brief Set 
	 */
	void setHcname(ConfigNodePropertyString hcname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray hctags);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHcmbeanname();

	/*! \brief Set 
	 */
	void setHcmbeanname(ConfigNodePropertyString hcmbeanname);


    private:
    ConfigNodePropertyString hcname;
    ConfigNodePropertyArray hctags;
    ConfigNodePropertyString hcmbeanname;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties_H_ */
