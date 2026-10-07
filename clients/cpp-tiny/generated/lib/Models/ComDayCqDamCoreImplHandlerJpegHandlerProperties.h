
/*
 * ComDayCqDamCoreImplHandlerJpegHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplHandlerJpegHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplHandlerJpegHandlerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplHandlerJpegHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplHandlerJpegHandlerProperties();
    ComDayCqDamCoreImplHandlerJpegHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplHandlerJpegHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamenableextmetaextraction();

	/*! \brief Set 
	 */
	void setCqdamenableextmetaextraction(ConfigNodePropertyBoolean cqdamenableextmetaextraction);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLargeFileThreshold();

	/*! \brief Set 
	 */
	void setLargeFileThreshold(ConfigNodePropertyInteger large_file_threshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLargeCommentThreshold();

	/*! \brief Set 
	 */
	void setLargeCommentThreshold(ConfigNodePropertyInteger large_comment_threshold);


    private:
    ConfigNodePropertyBoolean cqdamenableextmetaextraction;
    ConfigNodePropertyInteger large_file_threshold;
    ConfigNodePropertyInteger large_comment_threshold;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplHandlerJpegHandlerProperties_H_ */
