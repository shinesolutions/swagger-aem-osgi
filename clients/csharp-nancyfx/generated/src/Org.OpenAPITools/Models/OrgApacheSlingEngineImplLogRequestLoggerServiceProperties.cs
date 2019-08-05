using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEngineImplLogRequestLoggerServiceProperties
    /// </summary>
    public sealed class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties:  IEquatable<OrgApacheSlingEngineImplLogRequestLoggerServiceProperties>
    { 
        /// <summary>
        /// RequestLogServiceFormat
        /// </summary>
        public ConfigNodePropertyString RequestLogServiceFormat { get; private set; }

        /// <summary>
        /// RequestLogServiceOutput
        /// </summary>
        public ConfigNodePropertyString RequestLogServiceOutput { get; private set; }

        /// <summary>
        /// RequestLogServiceOutputtype
        /// </summary>
        public ConfigNodePropertyDropDown RequestLogServiceOutputtype { get; private set; }

        /// <summary>
        /// RequestLogServiceOnentry
        /// </summary>
        public ConfigNodePropertyBoolean RequestLogServiceOnentry { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties()
        {
        }

        private OrgApacheSlingEngineImplLogRequestLoggerServiceProperties(ConfigNodePropertyString RequestLogServiceFormat, ConfigNodePropertyString RequestLogServiceOutput, ConfigNodePropertyDropDown RequestLogServiceOutputtype, ConfigNodePropertyBoolean RequestLogServiceOnentry)
        {
            
            this.RequestLogServiceFormat = RequestLogServiceFormat;
            
            this.RequestLogServiceOutput = RequestLogServiceOutput;
            
            this.RequestLogServiceOutputtype = RequestLogServiceOutputtype;
            
            this.RequestLogServiceOnentry = RequestLogServiceOnentry;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder</returns>
        public static OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder Builder()
        {
            return new OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder</returns>
        public OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder With()
        {
            return Builder()
                .RequestLogServiceFormat(RequestLogServiceFormat)
                .RequestLogServiceOutput(RequestLogServiceOutput)
                .RequestLogServiceOutputtype(RequestLogServiceOutputtype)
                .RequestLogServiceOnentry(RequestLogServiceOnentry);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingEngineImplLogRequestLoggerServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplLogRequestLoggerServiceProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplLogRequestLoggerServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEngineImplLogRequestLoggerServiceProperties left, OrgApacheSlingEngineImplLogRequestLoggerServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplLogRequestLoggerServiceProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplLogRequestLoggerServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEngineImplLogRequestLoggerServiceProperties left, OrgApacheSlingEngineImplLogRequestLoggerServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.
        /// </summary>
        public sealed class OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder
        {
            private ConfigNodePropertyString _RequestLogServiceFormat;
            private ConfigNodePropertyString _RequestLogServiceOutput;
            private ConfigNodePropertyDropDown _RequestLogServiceOutputtype;
            private ConfigNodePropertyBoolean _RequestLogServiceOnentry;

            internal OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.RequestLogServiceFormat property.
            /// </summary>
            /// <param name="value">RequestLogServiceFormat</param>
            public OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder RequestLogServiceFormat(ConfigNodePropertyString value)
            {
                _RequestLogServiceFormat = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.RequestLogServiceOutput property.
            /// </summary>
            /// <param name="value">RequestLogServiceOutput</param>
            public OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder RequestLogServiceOutput(ConfigNodePropertyString value)
            {
                _RequestLogServiceOutput = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.RequestLogServiceOutputtype property.
            /// </summary>
            /// <param name="value">RequestLogServiceOutputtype</param>
            public OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder RequestLogServiceOutputtype(ConfigNodePropertyDropDown value)
            {
                _RequestLogServiceOutputtype = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.RequestLogServiceOnentry property.
            /// </summary>
            /// <param name="value">RequestLogServiceOnentry</param>
            public OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder RequestLogServiceOnentry(ConfigNodePropertyBoolean value)
            {
                _RequestLogServiceOnentry = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.
            /// </summary>
            /// <returns>OrgApacheSlingEngineImplLogRequestLoggerServiceProperties</returns>
            public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties Build()
            {
                Validate();
                return new OrgApacheSlingEngineImplLogRequestLoggerServiceProperties(
                    RequestLogServiceFormat: _RequestLogServiceFormat,
                    RequestLogServiceOutput: _RequestLogServiceOutput,
                    RequestLogServiceOutputtype: _RequestLogServiceOutputtype,
                    RequestLogServiceOnentry: _RequestLogServiceOnentry
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}