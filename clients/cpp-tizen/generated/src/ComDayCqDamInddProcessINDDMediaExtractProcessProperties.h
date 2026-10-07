/*
 * ComDayCqDamInddProcessINDDMediaExtractProcessProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamInddProcessINDDMediaExtractProcessProperties_H_
#define _ComDayCqDamInddProcessINDDMediaExtractProcessProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamInddProcessINDDMediaExtractProcessProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamInddProcessINDDMediaExtractProcessProperties();
	ComDayCqDamInddProcessINDDMediaExtractProcessProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamInddProcessINDDMediaExtractProcessProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProcesslabel();

	/*! \brief Set 
	 */
	void setProcesslabel(ConfigNodePropertyString  processlabel);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdaminddpagesregex();

	/*! \brief Set 
	 */
	void setCqdaminddpagesregex(ConfigNodePropertyString  cqdaminddpagesregex);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIdsjobdecoupled();

	/*! \brief Set 
	 */
	void setIdsjobdecoupled(ConfigNodePropertyBoolean  idsjobdecoupled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getIdsjobworkflowmodel();

	/*! \brief Set 
	 */
	void setIdsjobworkflowmodel(ConfigNodePropertyString  idsjobworkflowmodel);

private:
	ConfigNodePropertyString processlabel;
	ConfigNodePropertyString cqdaminddpagesregex;
	ConfigNodePropertyBoolean idsjobdecoupled;
	ConfigNodePropertyString idsjobworkflowmodel;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamInddProcessINDDMediaExtractProcessProperties_H_ */
