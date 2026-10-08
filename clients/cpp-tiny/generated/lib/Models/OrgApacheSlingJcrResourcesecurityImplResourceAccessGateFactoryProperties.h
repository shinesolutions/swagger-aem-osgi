
/*
 * OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties_H_


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

class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties();
    OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString path);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCheckpathprefix();

	/*! \brief Set 
	 */
	void setCheckpathprefix(ConfigNodePropertyString checkpathprefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJcrPath();

	/*! \brief Set 
	 */
	void setJcrPath(ConfigNodePropertyString jcrPath);


    private:
    ConfigNodePropertyString path;
    ConfigNodePropertyString checkpathprefix;
    ConfigNodePropertyString jcrPath;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties_H_ */
