/*
 * ComDayCqPollingImporterImplManagedPollConfigImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqPollingImporterImplManagedPollConfigImplProperties_H_
#define _ComDayCqPollingImporterImplManagedPollConfigImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqPollingImporterImplManagedPollConfigImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqPollingImporterImplManagedPollConfigImplProperties();
	ComDayCqPollingImporterImplManagedPollConfigImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqPollingImporterImplManagedPollConfigImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getId();

	/*! \brief Set 
	 */
	void setId(ConfigNodePropertyString  id);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getReference();

	/*! \brief Set 
	 */
	void setReference(ConfigNodePropertyBoolean  reference);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getInterval();

	/*! \brief Set 
	 */
	void setInterval(ConfigNodePropertyInteger  interval);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getExpression();

	/*! \brief Set 
	 */
	void setExpression(ConfigNodePropertyString  expression);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSource();

	/*! \brief Set 
	 */
	void setSource(ConfigNodePropertyString  source);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTarget();

	/*! \brief Set 
	 */
	void setTarget(ConfigNodePropertyString  target);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getLogin();

	/*! \brief Set 
	 */
	void setLogin(ConfigNodePropertyString  login);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPassword();

	/*! \brief Set 
	 */
	void setPassword(ConfigNodePropertyString  password);

private:
	ConfigNodePropertyString id;
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyBoolean reference;
	ConfigNodePropertyInteger interval;
	ConfigNodePropertyString expression;
	ConfigNodePropertyString source;
	ConfigNodePropertyString target;
	ConfigNodePropertyString login;
	ConfigNodePropertyString password;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqPollingImporterImplManagedPollConfigImplProperties_H_ */
