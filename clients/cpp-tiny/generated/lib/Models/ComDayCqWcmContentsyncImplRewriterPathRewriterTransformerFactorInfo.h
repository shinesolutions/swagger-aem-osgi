
/*
 * ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo_H_
#define TINY_CPP_CLIENT_ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo();
    ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo();


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
	ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo_H_ */
