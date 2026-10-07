
/*
 * ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo();
    ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo();


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
	ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo_H_ */
