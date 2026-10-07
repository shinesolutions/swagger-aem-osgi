
/*
 * OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo_H_
#define TINY_CPP_CLIENT_OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo();
    OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo_H_ */
