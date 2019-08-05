using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingTracerInternalLogTracerProperties
    /// </summary>
    public sealed class OrgApacheSlingTracerInternalLogTracerProperties:  IEquatable<OrgApacheSlingTracerInternalLogTracerProperties>
    { 
        /// <summary>
        /// TracerSets
        /// </summary>
        public ConfigNodePropertyArray TracerSets { get; private set; }

        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }

        /// <summary>
        /// ServletEnabled
        /// </summary>
        public ConfigNodePropertyBoolean ServletEnabled { get; private set; }

        /// <summary>
        /// RecordingCacheSizeInMB
        /// </summary>
        public ConfigNodePropertyInteger RecordingCacheSizeInMB { get; private set; }

        /// <summary>
        /// RecordingCacheDurationInSecs
        /// </summary>
        public ConfigNodePropertyInteger RecordingCacheDurationInSecs { get; private set; }

        /// <summary>
        /// RecordingCompressionEnabled
        /// </summary>
        public ConfigNodePropertyBoolean RecordingCompressionEnabled { get; private set; }

        /// <summary>
        /// GzipResponse
        /// </summary>
        public ConfigNodePropertyBoolean GzipResponse { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingTracerInternalLogTracerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingTracerInternalLogTracerProperties()
        {
        }

        private OrgApacheSlingTracerInternalLogTracerProperties(ConfigNodePropertyArray TracerSets, ConfigNodePropertyBoolean Enabled, ConfigNodePropertyBoolean ServletEnabled, ConfigNodePropertyInteger RecordingCacheSizeInMB, ConfigNodePropertyInteger RecordingCacheDurationInSecs, ConfigNodePropertyBoolean RecordingCompressionEnabled, ConfigNodePropertyBoolean GzipResponse)
        {
            
            this.TracerSets = TracerSets;
            
            this.Enabled = Enabled;
            
            this.ServletEnabled = ServletEnabled;
            
            this.RecordingCacheSizeInMB = RecordingCacheSizeInMB;
            
            this.RecordingCacheDurationInSecs = RecordingCacheDurationInSecs;
            
            this.RecordingCompressionEnabled = RecordingCompressionEnabled;
            
            this.GzipResponse = GzipResponse;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingTracerInternalLogTracerProperties.
        /// </summary>
        /// <returns>OrgApacheSlingTracerInternalLogTracerPropertiesBuilder</returns>
        public static OrgApacheSlingTracerInternalLogTracerPropertiesBuilder Builder()
        {
            return new OrgApacheSlingTracerInternalLogTracerPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingTracerInternalLogTracerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingTracerInternalLogTracerPropertiesBuilder</returns>
        public OrgApacheSlingTracerInternalLogTracerPropertiesBuilder With()
        {
            return Builder()
                .TracerSets(TracerSets)
                .Enabled(Enabled)
                .ServletEnabled(ServletEnabled)
                .RecordingCacheSizeInMB(RecordingCacheSizeInMB)
                .RecordingCacheDurationInSecs(RecordingCacheDurationInSecs)
                .RecordingCompressionEnabled(RecordingCompressionEnabled)
                .GzipResponse(GzipResponse);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingTracerInternalLogTracerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingTracerInternalLogTracerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingTracerInternalLogTracerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingTracerInternalLogTracerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingTracerInternalLogTracerProperties left, OrgApacheSlingTracerInternalLogTracerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingTracerInternalLogTracerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingTracerInternalLogTracerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingTracerInternalLogTracerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingTracerInternalLogTracerProperties left, OrgApacheSlingTracerInternalLogTracerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingTracerInternalLogTracerProperties.
        /// </summary>
        public sealed class OrgApacheSlingTracerInternalLogTracerPropertiesBuilder
        {
            private ConfigNodePropertyArray _TracerSets;
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyBoolean _ServletEnabled;
            private ConfigNodePropertyInteger _RecordingCacheSizeInMB;
            private ConfigNodePropertyInteger _RecordingCacheDurationInSecs;
            private ConfigNodePropertyBoolean _RecordingCompressionEnabled;
            private ConfigNodePropertyBoolean _GzipResponse;

            internal OrgApacheSlingTracerInternalLogTracerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTracerInternalLogTracerProperties.TracerSets property.
            /// </summary>
            /// <param name="value">TracerSets</param>
            public OrgApacheSlingTracerInternalLogTracerPropertiesBuilder TracerSets(ConfigNodePropertyArray value)
            {
                _TracerSets = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTracerInternalLogTracerProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingTracerInternalLogTracerPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTracerInternalLogTracerProperties.ServletEnabled property.
            /// </summary>
            /// <param name="value">ServletEnabled</param>
            public OrgApacheSlingTracerInternalLogTracerPropertiesBuilder ServletEnabled(ConfigNodePropertyBoolean value)
            {
                _ServletEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTracerInternalLogTracerProperties.RecordingCacheSizeInMB property.
            /// </summary>
            /// <param name="value">RecordingCacheSizeInMB</param>
            public OrgApacheSlingTracerInternalLogTracerPropertiesBuilder RecordingCacheSizeInMB(ConfigNodePropertyInteger value)
            {
                _RecordingCacheSizeInMB = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTracerInternalLogTracerProperties.RecordingCacheDurationInSecs property.
            /// </summary>
            /// <param name="value">RecordingCacheDurationInSecs</param>
            public OrgApacheSlingTracerInternalLogTracerPropertiesBuilder RecordingCacheDurationInSecs(ConfigNodePropertyInteger value)
            {
                _RecordingCacheDurationInSecs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTracerInternalLogTracerProperties.RecordingCompressionEnabled property.
            /// </summary>
            /// <param name="value">RecordingCompressionEnabled</param>
            public OrgApacheSlingTracerInternalLogTracerPropertiesBuilder RecordingCompressionEnabled(ConfigNodePropertyBoolean value)
            {
                _RecordingCompressionEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTracerInternalLogTracerProperties.GzipResponse property.
            /// </summary>
            /// <param name="value">GzipResponse</param>
            public OrgApacheSlingTracerInternalLogTracerPropertiesBuilder GzipResponse(ConfigNodePropertyBoolean value)
            {
                _GzipResponse = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingTracerInternalLogTracerProperties.
            /// </summary>
            /// <returns>OrgApacheSlingTracerInternalLogTracerProperties</returns>
            public OrgApacheSlingTracerInternalLogTracerProperties Build()
            {
                Validate();
                return new OrgApacheSlingTracerInternalLogTracerProperties(
                    TracerSets: _TracerSets,
                    Enabled: _Enabled,
                    ServletEnabled: _ServletEnabled,
                    RecordingCacheSizeInMB: _RecordingCacheSizeInMB,
                    RecordingCacheDurationInSecs: _RecordingCacheDurationInSecs,
                    RecordingCompressionEnabled: _RecordingCompressionEnabled,
                    GzipResponse: _GzipResponse
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}