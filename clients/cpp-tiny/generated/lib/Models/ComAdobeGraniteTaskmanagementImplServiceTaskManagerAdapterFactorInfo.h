
/*
 * ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo();
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo();


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
	ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo_H_ */
