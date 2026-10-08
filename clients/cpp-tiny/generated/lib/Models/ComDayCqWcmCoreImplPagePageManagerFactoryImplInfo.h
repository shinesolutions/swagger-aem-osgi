
/*
 * ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo();
    ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo();


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
	ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo_H_ */
