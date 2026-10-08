
/*
 * ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo();
    ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo();


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
	ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo_H_ */
