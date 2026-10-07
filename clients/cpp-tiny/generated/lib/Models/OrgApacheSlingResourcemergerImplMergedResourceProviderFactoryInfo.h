
/*
 * OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo_H_
#define TINY_CPP_CLIENT_OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo();
    OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo();


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
	OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo_H_ */
