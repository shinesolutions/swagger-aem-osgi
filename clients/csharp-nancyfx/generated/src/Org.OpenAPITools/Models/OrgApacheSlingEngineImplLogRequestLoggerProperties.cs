using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEngineImplLogRequestLoggerProperties
    /// </summary>
    public sealed class OrgApacheSlingEngineImplLogRequestLoggerProperties:  IEquatable<OrgApacheSlingEngineImplLogRequestLoggerProperties>
    { 
        /// <summary>
        /// RequestLogOutput
        /// </summary>
        public ConfigNodePropertyString RequestLogOutput { get; private set; }

        /// <summary>
        /// RequestLogOutputtype
        /// </summary>
        public ConfigNodePropertyDropDown RequestLogOutputtype { get; private set; }

        /// <summary>
        /// RequestLogEnabled
        /// </summary>
        public ConfigNodePropertyBoolean RequestLogEnabled { get; private set; }

        /// <summary>
        /// AccessLogOutput
        /// </summary>
        public ConfigNodePropertyString AccessLogOutput { get; private set; }

        /// <summary>
        /// AccessLogOutputtype
        /// </summary>
        public ConfigNodePropertyDropDown AccessLogOutputtype { get; private set; }

        /// <summary>
        /// AccessLogEnabled
        /// </summary>
        public ConfigNodePropertyBoolean AccessLogEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEngineImplLogRequestLoggerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEngineImplLogRequestLoggerProperties()
        {
        }

        private OrgApacheSlingEngineImplLogRequestLoggerProperties(ConfigNodePropertyString RequestLogOutput, ConfigNodePropertyDropDown RequestLogOutputtype, ConfigNodePropertyBoolean RequestLogEnabled, ConfigNodePropertyString AccessLogOutput, ConfigNodePropertyDropDown AccessLogOutputtype, ConfigNodePropertyBoolean AccessLogEnabled)
        {
            
            this.RequestLogOutput = RequestLogOutput;
            
            this.RequestLogOutputtype = RequestLogOutputtype;
            
            this.RequestLogEnabled = RequestLogEnabled;
            
            this.AccessLogOutput = AccessLogOutput;
            
            this.AccessLogOutputtype = AccessLogOutputtype;
            
            this.AccessLogEnabled = AccessLogEnabled;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEngineImplLogRequestLoggerProperties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder</returns>
        public static OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder Builder()
        {
            return new OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder</returns>
        public OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder With()
        {
            return Builder()
                .RequestLogOutput(RequestLogOutput)
                .RequestLogOutputtype(RequestLogOutputtype)
                .RequestLogEnabled(RequestLogEnabled)
                .AccessLogOutput(AccessLogOutput)
                .AccessLogOutputtype(AccessLogOutputtype)
                .AccessLogEnabled(AccessLogEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingEngineImplLogRequestLoggerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEngineImplLogRequestLoggerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplLogRequestLoggerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplLogRequestLoggerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEngineImplLogRequestLoggerProperties left, OrgApacheSlingEngineImplLogRequestLoggerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEngineImplLogRequestLoggerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplLogRequestLoggerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplLogRequestLoggerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEngineImplLogRequestLoggerProperties left, OrgApacheSlingEngineImplLogRequestLoggerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEngineImplLogRequestLoggerProperties.
        /// </summary>
        public sealed class OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder
        {
            private ConfigNodePropertyString _RequestLogOutput;
            private ConfigNodePropertyDropDown _RequestLogOutputtype;
            private ConfigNodePropertyBoolean _RequestLogEnabled;
            private ConfigNodePropertyString _AccessLogOutput;
            private ConfigNodePropertyDropDown _AccessLogOutputtype;
            private ConfigNodePropertyBoolean _AccessLogEnabled;

            internal OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerProperties.RequestLogOutput property.
            /// </summary>
            /// <param name="value">RequestLogOutput</param>
            public OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder RequestLogOutput(ConfigNodePropertyString value)
            {
                _RequestLogOutput = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerProperties.RequestLogOutputtype property.
            /// </summary>
            /// <param name="value">RequestLogOutputtype</param>
            public OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder RequestLogOutputtype(ConfigNodePropertyDropDown value)
            {
                _RequestLogOutputtype = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerProperties.RequestLogEnabled property.
            /// </summary>
            /// <param name="value">RequestLogEnabled</param>
            public OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder RequestLogEnabled(ConfigNodePropertyBoolean value)
            {
                _RequestLogEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerProperties.AccessLogOutput property.
            /// </summary>
            /// <param name="value">AccessLogOutput</param>
            public OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder AccessLogOutput(ConfigNodePropertyString value)
            {
                _AccessLogOutput = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerProperties.AccessLogOutputtype property.
            /// </summary>
            /// <param name="value">AccessLogOutputtype</param>
            public OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder AccessLogOutputtype(ConfigNodePropertyDropDown value)
            {
                _AccessLogOutputtype = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerProperties.AccessLogEnabled property.
            /// </summary>
            /// <param name="value">AccessLogEnabled</param>
            public OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder AccessLogEnabled(ConfigNodePropertyBoolean value)
            {
                _AccessLogEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEngineImplLogRequestLoggerProperties.
            /// </summary>
            /// <returns>OrgApacheSlingEngineImplLogRequestLoggerProperties</returns>
            public OrgApacheSlingEngineImplLogRequestLoggerProperties Build()
            {
                Validate();
                return new OrgApacheSlingEngineImplLogRequestLoggerProperties(
                    RequestLogOutput: _RequestLogOutput,
                    RequestLogOutputtype: _RequestLogOutputtype,
                    RequestLogEnabled: _RequestLogEnabled,
                    AccessLogOutput: _AccessLogOutput,
                    AccessLogOutputtype: _AccessLogOutputtype,
                    AccessLogEnabled: _AccessLogEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}