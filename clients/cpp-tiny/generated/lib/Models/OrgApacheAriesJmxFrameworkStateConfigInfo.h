
/*
 * OrgApacheAriesJmxFrameworkStateConfigInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheAriesJmxFrameworkStateConfigInfo_H_
#define TINY_CPP_CLIENT_OrgApacheAriesJmxFrameworkStateConfigInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrgApacheAriesJmxFrameworkStateConfigProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheAriesJmxFrameworkStateConfigInfo{
public:

    /*! \brief Constructor.
	 */
    OrgApacheAriesJmxFrameworkStateConfigInfo();
    OrgApacheAriesJmxFrameworkStateConfigInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheAriesJmxFrameworkStateConfigInfo();


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
	OrgApacheAriesJmxFrameworkStateConfigProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheAriesJmxFrameworkStateConfigProperties properties);
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
    OrgApacheAriesJmxFrameworkStateConfigProperties properties;
    std::string bundle_location{};
    std::string service_location{};
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheAriesJmxFrameworkStateConfigInfo_H_ */
