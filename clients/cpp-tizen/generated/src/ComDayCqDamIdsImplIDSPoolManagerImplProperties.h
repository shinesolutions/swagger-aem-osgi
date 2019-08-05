/*
 * ComDayCqDamIdsImplIDSPoolManagerImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamIdsImplIDSPoolManagerImplProperties_H_
#define _ComDayCqDamIdsImplIDSPoolManagerImplProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class ComDayCqDamIdsImplIDSPoolManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamIdsImplIDSPoolManagerImplProperties();
	ComDayCqDamIdsImplIDSPoolManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamIdsImplIDSPoolManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxerrorstoblacklist();

	/*! \brief Set 
	 */
	void setMaxerrorstoblacklist(ConfigNodePropertyInteger  maxerrorstoblacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRetryintervaltowhitelist();

	/*! \brief Set 
	 */
	void setRetryintervaltowhitelist(ConfigNodePropertyInteger  retryintervaltowhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConnecttimeout();

	/*! \brief Set 
	 */
	void setConnecttimeout(ConfigNodePropertyInteger  connecttimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSockettimeout();

	/*! \brief Set 
	 */
	void setSockettimeout(ConfigNodePropertyInteger  sockettimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getProcesslabel();

	/*! \brief Set 
	 */
	void setProcesslabel(ConfigNodePropertyString  processlabel);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConnectionusemax();

	/*! \brief Set 
	 */
	void setConnectionusemax(ConfigNodePropertyInteger  connectionusemax);

private:
	ConfigNodePropertyInteger maxerrorstoblacklist;
	ConfigNodePropertyInteger retryintervaltowhitelist;
	ConfigNodePropertyInteger connecttimeout;
	ConfigNodePropertyInteger sockettimeout;
	ConfigNodePropertyString processlabel;
	ConfigNodePropertyInteger connectionusemax;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamIdsImplIDSPoolManagerImplProperties_H_ */
