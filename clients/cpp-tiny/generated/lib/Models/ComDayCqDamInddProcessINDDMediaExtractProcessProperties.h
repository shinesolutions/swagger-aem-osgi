
/*
 * ComDayCqDamInddProcessINDDMediaExtractProcessProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamInddProcessINDDMediaExtractProcessProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamInddProcessINDDMediaExtractProcessProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamInddProcessINDDMediaExtractProcessProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamInddProcessINDDMediaExtractProcessProperties();
    ComDayCqDamInddProcessINDDMediaExtractProcessProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamInddProcessINDDMediaExtractProcessProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProcesslabel();

	/*! \brief Set 
	 */
	void setProcesslabel(ConfigNodePropertyString processlabel);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdaminddpagesregex();

	/*! \brief Set 
	 */
	void setCqdaminddpagesregex(ConfigNodePropertyString cqdaminddpagesregex);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIdsjobdecoupled();

	/*! \brief Set 
	 */
	void setIdsjobdecoupled(ConfigNodePropertyBoolean idsjobdecoupled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getIdsjobworkflowmodel();

	/*! \brief Set 
	 */
	void setIdsjobworkflowmodel(ConfigNodePropertyString idsjobworkflowmodel);


    private:
    ConfigNodePropertyString processlabel;
    ConfigNodePropertyString cqdaminddpagesregex;
    ConfigNodePropertyBoolean idsjobdecoupled;
    ConfigNodePropertyString idsjobworkflowmodel;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamInddProcessINDDMediaExtractProcessProperties_H_ */
