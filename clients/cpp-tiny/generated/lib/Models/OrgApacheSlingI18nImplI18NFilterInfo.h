
/*
 * OrgApacheSlingI18nImplI18NFilterInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingI18nImplI18NFilterInfo_H_
#define TINY_CPP_CLIENT_OrgApacheSlingI18nImplI18NFilterInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrgApacheSlingI18nImplI18NFilterProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingI18nImplI18NFilterInfo{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingI18nImplI18NFilterInfo();
    OrgApacheSlingI18nImplI18NFilterInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingI18nImplI18NFilterInfo();


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
	OrgApacheSlingI18nImplI18NFilterProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingI18nImplI18NFilterProperties properties);
	/*! \brief Get 
	 */
	std::string getBundleLocation();

	/*! \brief Set 
	 */
	void setBundleLocation(std::string bundle_location);
	/*! \brief Get 
	 */
	std::string getServiceLocation();

	/*! \brief Set 
	 */
	void setServiceLocation(std::string service_location);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    OrgApacheSlingI18nImplI18NFilterProperties properties;
    std::string bundle_location{};
    std::string service_location{};
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingI18nImplI18NFilterInfo_H_ */
