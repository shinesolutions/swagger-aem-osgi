
/*
 * ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo_H_
#define TINY_CPP_CLIENT_ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo();
    ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo();


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
	ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo_H_ */
