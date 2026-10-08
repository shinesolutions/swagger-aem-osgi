
/*
 * ComDayCqDamScene7ImplScene7UploadServiceImplInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7UploadServiceImplInfo_H_
#define TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7UploadServiceImplInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqDamScene7ImplScene7UploadServiceImplProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamScene7ImplScene7UploadServiceImplInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamScene7ImplScene7UploadServiceImplInfo();
    ComDayCqDamScene7ImplScene7UploadServiceImplInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamScene7ImplScene7UploadServiceImplInfo();


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
	ComDayCqDamScene7ImplScene7UploadServiceImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamScene7ImplScene7UploadServiceImplProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqDamScene7ImplScene7UploadServiceImplProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7UploadServiceImplInfo_H_ */
