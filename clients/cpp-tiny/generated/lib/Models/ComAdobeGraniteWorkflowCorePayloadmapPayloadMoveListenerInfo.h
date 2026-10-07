
/*
 * ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo();
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo();


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
	ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo_H_ */
