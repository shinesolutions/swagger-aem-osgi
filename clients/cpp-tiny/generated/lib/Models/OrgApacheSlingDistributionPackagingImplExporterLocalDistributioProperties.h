
/*
 * OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties_H_


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

class OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties();
    OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties();


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
	ConfigNodePropertyString getPackageBuildertarget();

	/*! \brief Set 
	 */
	void setPackageBuildertarget(ConfigNodePropertyString packageBuildertarget);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyString packageBuildertarget;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties_H_ */
