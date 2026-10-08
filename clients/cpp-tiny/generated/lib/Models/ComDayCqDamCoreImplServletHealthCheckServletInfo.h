
/*
 * ComDayCqDamCoreImplServletHealthCheckServletInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletHealthCheckServletInfo_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletHealthCheckServletInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqDamCoreImplServletHealthCheckServletProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplServletHealthCheckServletInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletHealthCheckServletInfo();
    ComDayCqDamCoreImplServletHealthCheckServletInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletHealthCheckServletInfo();


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
	ComDayCqDamCoreImplServletHealthCheckServletProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamCoreImplServletHealthCheckServletProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqDamCoreImplServletHealthCheckServletProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletHealthCheckServletInfo_H_ */
