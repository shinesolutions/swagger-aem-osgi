
/*
 * OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo();
    OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo();


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
	OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo_H_ */
