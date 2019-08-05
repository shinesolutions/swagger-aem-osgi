using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEngineImplSlingMainServletProperties
    /// </summary>
    public sealed class OrgApacheSlingEngineImplSlingMainServletProperties:  IEquatable<OrgApacheSlingEngineImplSlingMainServletProperties>
    { 
        /// <summary>
        /// SlingMaxCalls
        /// </summary>
        public ConfigNodePropertyInteger SlingMaxCalls { get; private set; }

        /// <summary>
        /// SlingMaxInclusions
        /// </summary>
        public ConfigNodePropertyInteger SlingMaxInclusions { get; private set; }

        /// <summary>
        /// SlingTraceAllow
        /// </summary>
        public ConfigNodePropertyBoolean SlingTraceAllow { get; private set; }

        /// <summary>
        /// SlingMaxRecordRequests
        /// </summary>
        public ConfigNodePropertyInteger SlingMaxRecordRequests { get; private set; }

        /// <summary>
        /// SlingStorePatternRequests
        /// </summary>
        public ConfigNodePropertyArray SlingStorePatternRequests { get; private set; }

        /// <summary>
        /// SlingServerinfo
        /// </summary>
        public ConfigNodePropertyString SlingServerinfo { get; private set; }

        /// <summary>
        /// SlingAdditionalResponseHeaders
        /// </summary>
        public ConfigNodePropertyArray SlingAdditionalResponseHeaders { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEngineImplSlingMainServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEngineImplSlingMainServletProperties()
        {
        }

        private OrgApacheSlingEngineImplSlingMainServletProperties(ConfigNodePropertyInteger SlingMaxCalls, ConfigNodePropertyInteger SlingMaxInclusions, ConfigNodePropertyBoolean SlingTraceAllow, ConfigNodePropertyInteger SlingMaxRecordRequests, ConfigNodePropertyArray SlingStorePatternRequests, ConfigNodePropertyString SlingServerinfo, ConfigNodePropertyArray SlingAdditionalResponseHeaders)
        {
            
            this.SlingMaxCalls = SlingMaxCalls;
            
            this.SlingMaxInclusions = SlingMaxInclusions;
            
            this.SlingTraceAllow = SlingTraceAllow;
            
            this.SlingMaxRecordRequests = SlingMaxRecordRequests;
            
            this.SlingStorePatternRequests = SlingStorePatternRequests;
            
            this.SlingServerinfo = SlingServerinfo;
            
            this.SlingAdditionalResponseHeaders = SlingAdditionalResponseHeaders;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEngineImplSlingMainServletProperties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder</returns>
        public static OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder Builder()
        {
            return new OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder</returns>
        public OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder With()
        {
            return Builder()
                .SlingMaxCalls(SlingMaxCalls)
                .SlingMaxInclusions(SlingMaxInclusions)
                .SlingTraceAllow(SlingTraceAllow)
                .SlingMaxRecordRequests(SlingMaxRecordRequests)
                .SlingStorePatternRequests(SlingStorePatternRequests)
                .SlingServerinfo(SlingServerinfo)
                .SlingAdditionalResponseHeaders(SlingAdditionalResponseHeaders);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingEngineImplSlingMainServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEngineImplSlingMainServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplSlingMainServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplSlingMainServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEngineImplSlingMainServletProperties left, OrgApacheSlingEngineImplSlingMainServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEngineImplSlingMainServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplSlingMainServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplSlingMainServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEngineImplSlingMainServletProperties left, OrgApacheSlingEngineImplSlingMainServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEngineImplSlingMainServletProperties.
        /// </summary>
        public sealed class OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder
        {
            private ConfigNodePropertyInteger _SlingMaxCalls;
            private ConfigNodePropertyInteger _SlingMaxInclusions;
            private ConfigNodePropertyBoolean _SlingTraceAllow;
            private ConfigNodePropertyInteger _SlingMaxRecordRequests;
            private ConfigNodePropertyArray _SlingStorePatternRequests;
            private ConfigNodePropertyString _SlingServerinfo;
            private ConfigNodePropertyArray _SlingAdditionalResponseHeaders;

            internal OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplSlingMainServletProperties.SlingMaxCalls property.
            /// </summary>
            /// <param name="value">SlingMaxCalls</param>
            public OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder SlingMaxCalls(ConfigNodePropertyInteger value)
            {
                _SlingMaxCalls = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplSlingMainServletProperties.SlingMaxInclusions property.
            /// </summary>
            /// <param name="value">SlingMaxInclusions</param>
            public OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder SlingMaxInclusions(ConfigNodePropertyInteger value)
            {
                _SlingMaxInclusions = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplSlingMainServletProperties.SlingTraceAllow property.
            /// </summary>
            /// <param name="value">SlingTraceAllow</param>
            public OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder SlingTraceAllow(ConfigNodePropertyBoolean value)
            {
                _SlingTraceAllow = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplSlingMainServletProperties.SlingMaxRecordRequests property.
            /// </summary>
            /// <param name="value">SlingMaxRecordRequests</param>
            public OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder SlingMaxRecordRequests(ConfigNodePropertyInteger value)
            {
                _SlingMaxRecordRequests = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplSlingMainServletProperties.SlingStorePatternRequests property.
            /// </summary>
            /// <param name="value">SlingStorePatternRequests</param>
            public OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder SlingStorePatternRequests(ConfigNodePropertyArray value)
            {
                _SlingStorePatternRequests = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplSlingMainServletProperties.SlingServerinfo property.
            /// </summary>
            /// <param name="value">SlingServerinfo</param>
            public OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder SlingServerinfo(ConfigNodePropertyString value)
            {
                _SlingServerinfo = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplSlingMainServletProperties.SlingAdditionalResponseHeaders property.
            /// </summary>
            /// <param name="value">SlingAdditionalResponseHeaders</param>
            public OrgApacheSlingEngineImplSlingMainServletPropertiesBuilder SlingAdditionalResponseHeaders(ConfigNodePropertyArray value)
            {
                _SlingAdditionalResponseHeaders = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEngineImplSlingMainServletProperties.
            /// </summary>
            /// <returns>OrgApacheSlingEngineImplSlingMainServletProperties</returns>
            public OrgApacheSlingEngineImplSlingMainServletProperties Build()
            {
                Validate();
                return new OrgApacheSlingEngineImplSlingMainServletProperties(
                    SlingMaxCalls: _SlingMaxCalls,
                    SlingMaxInclusions: _SlingMaxInclusions,
                    SlingTraceAllow: _SlingTraceAllow,
                    SlingMaxRecordRequests: _SlingMaxRecordRequests,
                    SlingStorePatternRequests: _SlingStorePatternRequests,
                    SlingServerinfo: _SlingServerinfo,
                    SlingAdditionalResponseHeaders: _SlingAdditionalResponseHeaders
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}