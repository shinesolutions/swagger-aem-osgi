
/*
 * ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo();
    ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo();


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
	ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo_H_ */
