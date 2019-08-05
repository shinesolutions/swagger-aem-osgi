using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEngineParametersProperties
    /// </summary>
    public sealed class OrgApacheSlingEngineParametersProperties:  IEquatable<OrgApacheSlingEngineParametersProperties>
    { 
        /// <summary>
        /// SlingDefaultParameterEncoding
        /// </summary>
        public ConfigNodePropertyString SlingDefaultParameterEncoding { get; private set; }

        /// <summary>
        /// SlingDefaultMaxParameters
        /// </summary>
        public ConfigNodePropertyInteger SlingDefaultMaxParameters { get; private set; }

        /// <summary>
        /// FileLocation
        /// </summary>
        public ConfigNodePropertyString FileLocation { get; private set; }

        /// <summary>
        /// FileThreshold
        /// </summary>
        public ConfigNodePropertyInteger FileThreshold { get; private set; }

        /// <summary>
        /// FileMax
        /// </summary>
        public ConfigNodePropertyInteger FileMax { get; private set; }

        /// <summary>
        /// RequestMax
        /// </summary>
        public ConfigNodePropertyInteger RequestMax { get; private set; }

        /// <summary>
        /// SlingDefaultParameterCheckForAdditionalContainerParameters
        /// </summary>
        public ConfigNodePropertyBoolean SlingDefaultParameterCheckForAdditionalContainerParameters { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEngineParametersProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEngineParametersProperties()
        {
        }

        private OrgApacheSlingEngineParametersProperties(ConfigNodePropertyString SlingDefaultParameterEncoding, ConfigNodePropertyInteger SlingDefaultMaxParameters, ConfigNodePropertyString FileLocation, ConfigNodePropertyInteger FileThreshold, ConfigNodePropertyInteger FileMax, ConfigNodePropertyInteger RequestMax, ConfigNodePropertyBoolean SlingDefaultParameterCheckForAdditionalContainerParameters)
        {
            
            this.SlingDefaultParameterEncoding = SlingDefaultParameterEncoding;
            
            this.SlingDefaultMaxParameters = SlingDefaultMaxParameters;
            
            this.FileLocation = FileLocation;
            
            this.FileThreshold = FileThreshold;
            
            this.FileMax = FileMax;
            
            this.RequestMax = RequestMax;
            
            this.SlingDefaultParameterCheckForAdditionalContainerParameters = SlingDefaultParameterCheckForAdditionalContainerParameters;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEngineParametersProperties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineParametersPropertiesBuilder</returns>
        public static OrgApacheSlingEngineParametersPropertiesBuilder Builder()
        {
            return new OrgApacheSlingEngineParametersPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEngineParametersPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineParametersPropertiesBuilder</returns>
        public OrgApacheSlingEngineParametersPropertiesBuilder With()
        {
            return Builder()
                .SlingDefaultParameterEncoding(SlingDefaultParameterEncoding)
                .SlingDefaultMaxParameters(SlingDefaultMaxParameters)
                .FileLocation(FileLocation)
                .FileThreshold(FileThreshold)
                .FileMax(FileMax)
                .RequestMax(RequestMax)
                .SlingDefaultParameterCheckForAdditionalContainerParameters(SlingDefaultParameterCheckForAdditionalContainerParameters);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingEngineParametersProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEngineParametersProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineParametersProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEngineParametersProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEngineParametersProperties left, OrgApacheSlingEngineParametersProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEngineParametersProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineParametersProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEngineParametersProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEngineParametersProperties left, OrgApacheSlingEngineParametersProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEngineParametersProperties.
        /// </summary>
        public sealed class OrgApacheSlingEngineParametersPropertiesBuilder
        {
            private ConfigNodePropertyString _SlingDefaultParameterEncoding;
            private ConfigNodePropertyInteger _SlingDefaultMaxParameters;
            private ConfigNodePropertyString _FileLocation;
            private ConfigNodePropertyInteger _FileThreshold;
            private ConfigNodePropertyInteger _FileMax;
            private ConfigNodePropertyInteger _RequestMax;
            private ConfigNodePropertyBoolean _SlingDefaultParameterCheckForAdditionalContainerParameters;

            internal OrgApacheSlingEngineParametersPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineParametersProperties.SlingDefaultParameterEncoding property.
            /// </summary>
            /// <param name="value">SlingDefaultParameterEncoding</param>
            public OrgApacheSlingEngineParametersPropertiesBuilder SlingDefaultParameterEncoding(ConfigNodePropertyString value)
            {
                _SlingDefaultParameterEncoding = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineParametersProperties.SlingDefaultMaxParameters property.
            /// </summary>
            /// <param name="value">SlingDefaultMaxParameters</param>
            public OrgApacheSlingEngineParametersPropertiesBuilder SlingDefaultMaxParameters(ConfigNodePropertyInteger value)
            {
                _SlingDefaultMaxParameters = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineParametersProperties.FileLocation property.
            /// </summary>
            /// <param name="value">FileLocation</param>
            public OrgApacheSlingEngineParametersPropertiesBuilder FileLocation(ConfigNodePropertyString value)
            {
                _FileLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineParametersProperties.FileThreshold property.
            /// </summary>
            /// <param name="value">FileThreshold</param>
            public OrgApacheSlingEngineParametersPropertiesBuilder FileThreshold(ConfigNodePropertyInteger value)
            {
                _FileThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineParametersProperties.FileMax property.
            /// </summary>
            /// <param name="value">FileMax</param>
            public OrgApacheSlingEngineParametersPropertiesBuilder FileMax(ConfigNodePropertyInteger value)
            {
                _FileMax = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineParametersProperties.RequestMax property.
            /// </summary>
            /// <param name="value">RequestMax</param>
            public OrgApacheSlingEngineParametersPropertiesBuilder RequestMax(ConfigNodePropertyInteger value)
            {
                _RequestMax = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineParametersProperties.SlingDefaultParameterCheckForAdditionalContainerParameters property.
            /// </summary>
            /// <param name="value">SlingDefaultParameterCheckForAdditionalContainerParameters</param>
            public OrgApacheSlingEngineParametersPropertiesBuilder SlingDefaultParameterCheckForAdditionalContainerParameters(ConfigNodePropertyBoolean value)
            {
                _SlingDefaultParameterCheckForAdditionalContainerParameters = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEngineParametersProperties.
            /// </summary>
            /// <returns>OrgApacheSlingEngineParametersProperties</returns>
            public OrgApacheSlingEngineParametersProperties Build()
            {
                Validate();
                return new OrgApacheSlingEngineParametersProperties(
                    SlingDefaultParameterEncoding: _SlingDefaultParameterEncoding,
                    SlingDefaultMaxParameters: _SlingDefaultMaxParameters,
                    FileLocation: _FileLocation,
                    FileThreshold: _FileThreshold,
                    FileMax: _FileMax,
                    RequestMax: _RequestMax,
                    SlingDefaultParameterCheckForAdditionalContainerParameters: _SlingDefaultParameterCheckForAdditionalContainerParameters
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}