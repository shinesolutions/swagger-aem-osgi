using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties
    /// </summary>
    public sealed class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties:  IEquatable<OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties>
    { 
        /// <summary>
        /// Extensions
        /// </summary>
        public ConfigNodePropertyArray Extensions { get; private set; }

        /// <summary>
        /// MinDurationMs
        /// </summary>
        public ConfigNodePropertyInteger MinDurationMs { get; private set; }

        /// <summary>
        /// MaxDurationMs
        /// </summary>
        public ConfigNodePropertyInteger MaxDurationMs { get; private set; }

        /// <summary>
        /// CompactLogFormat
        /// </summary>
        public ConfigNodePropertyBoolean CompactLogFormat { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties()
        {
        }

        private OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties(ConfigNodePropertyArray Extensions, ConfigNodePropertyInteger MinDurationMs, ConfigNodePropertyInteger MaxDurationMs, ConfigNodePropertyBoolean CompactLogFormat)
        {
            
            this.Extensions = Extensions;
            
            this.MinDurationMs = MinDurationMs;
            
            this.MaxDurationMs = MaxDurationMs;
            
            this.CompactLogFormat = CompactLogFormat;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder</returns>
        public static OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder Builder()
        {
            return new OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder</returns>
        public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder With()
        {
            return Builder()
                .Extensions(Extensions)
                .MinDurationMs(MinDurationMs)
                .MaxDurationMs(MaxDurationMs)
                .CompactLogFormat(CompactLogFormat);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties left, OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties left, OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.
        /// </summary>
        public sealed class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder
        {
            private ConfigNodePropertyArray _Extensions;
            private ConfigNodePropertyInteger _MinDurationMs;
            private ConfigNodePropertyInteger _MaxDurationMs;
            private ConfigNodePropertyBoolean _CompactLogFormat;

            internal OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.Extensions property.
            /// </summary>
            /// <param name="value">Extensions</param>
            public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder Extensions(ConfigNodePropertyArray value)
            {
                _Extensions = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.MinDurationMs property.
            /// </summary>
            /// <param name="value">MinDurationMs</param>
            public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder MinDurationMs(ConfigNodePropertyInteger value)
            {
                _MinDurationMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.MaxDurationMs property.
            /// </summary>
            /// <param name="value">MaxDurationMs</param>
            public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder MaxDurationMs(ConfigNodePropertyInteger value)
            {
                _MaxDurationMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.CompactLogFormat property.
            /// </summary>
            /// <param name="value">CompactLogFormat</param>
            public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesBuilder CompactLogFormat(ConfigNodePropertyBoolean value)
            {
                _CompactLogFormat = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.
            /// </summary>
            /// <returns>OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties</returns>
            public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties Build()
            {
                Validate();
                return new OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties(
                    Extensions: _Extensions,
                    MinDurationMs: _MinDurationMs,
                    MaxDurationMs: _MaxDurationMs,
                    CompactLogFormat: _CompactLogFormat
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}