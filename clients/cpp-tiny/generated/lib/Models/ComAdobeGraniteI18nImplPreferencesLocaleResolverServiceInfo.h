
/*
 * ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo();
    ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo();


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
	ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo_H_ */
