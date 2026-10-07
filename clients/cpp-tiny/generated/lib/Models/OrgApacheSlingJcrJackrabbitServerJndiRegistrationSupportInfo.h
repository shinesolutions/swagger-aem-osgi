
/*
 * OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo_H_
#define TINY_CPP_CLIENT_OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo();
    OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo();


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
	OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo_H_ */
