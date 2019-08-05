using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamIdsImplIDSJobProcessorProperties
    /// </summary>
    public sealed class ComDayCqDamIdsImplIDSJobProcessorProperties:  IEquatable<ComDayCqDamIdsImplIDSJobProcessorProperties>
    { 
        /// <summary>
        /// EnableMultisession
        /// </summary>
        public ConfigNodePropertyBoolean EnableMultisession { get; private set; }

        /// <summary>
        /// IdsCcEnable
        /// </summary>
        public ConfigNodePropertyBoolean IdsCcEnable { get; private set; }

        /// <summary>
        /// EnableRetry
        /// </summary>
        public ConfigNodePropertyBoolean EnableRetry { get; private set; }

        /// <summary>
        /// EnableRetryScripterror
        /// </summary>
        public ConfigNodePropertyBoolean EnableRetryScripterror { get; private set; }

        /// <summary>
        /// ExternalizerDomainCqhost
        /// </summary>
        public ConfigNodePropertyString ExternalizerDomainCqhost { get; private set; }

        /// <summary>
        /// ExternalizerDomainHttp
        /// </summary>
        public ConfigNodePropertyString ExternalizerDomainHttp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamIdsImplIDSJobProcessorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamIdsImplIDSJobProcessorProperties()
        {
        }

        private ComDayCqDamIdsImplIDSJobProcessorProperties(ConfigNodePropertyBoolean EnableMultisession, ConfigNodePropertyBoolean IdsCcEnable, ConfigNodePropertyBoolean EnableRetry, ConfigNodePropertyBoolean EnableRetryScripterror, ConfigNodePropertyString ExternalizerDomainCqhost, ConfigNodePropertyString ExternalizerDomainHttp)
        {
            
            this.EnableMultisession = EnableMultisession;
            
            this.IdsCcEnable = IdsCcEnable;
            
            this.EnableRetry = EnableRetry;
            
            this.EnableRetryScripterror = EnableRetryScripterror;
            
            this.ExternalizerDomainCqhost = ExternalizerDomainCqhost;
            
            this.ExternalizerDomainHttp = ExternalizerDomainHttp;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamIdsImplIDSJobProcessorProperties.
        /// </summary>
        /// <returns>ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder</returns>
        public static ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder Builder()
        {
            return new ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder</returns>
        public ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder With()
        {
            return Builder()
                .EnableMultisession(EnableMultisession)
                .IdsCcEnable(IdsCcEnable)
                .EnableRetry(EnableRetry)
                .EnableRetryScripterror(EnableRetryScripterror)
                .ExternalizerDomainCqhost(ExternalizerDomainCqhost)
                .ExternalizerDomainHttp(ExternalizerDomainHttp);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamIdsImplIDSJobProcessorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamIdsImplIDSJobProcessorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamIdsImplIDSJobProcessorProperties</param>
        /// <param name="right">Compared (ComDayCqDamIdsImplIDSJobProcessorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamIdsImplIDSJobProcessorProperties left, ComDayCqDamIdsImplIDSJobProcessorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamIdsImplIDSJobProcessorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamIdsImplIDSJobProcessorProperties</param>
        /// <param name="right">Compared (ComDayCqDamIdsImplIDSJobProcessorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamIdsImplIDSJobProcessorProperties left, ComDayCqDamIdsImplIDSJobProcessorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamIdsImplIDSJobProcessorProperties.
        /// </summary>
        public sealed class ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _EnableMultisession;
            private ConfigNodePropertyBoolean _IdsCcEnable;
            private ConfigNodePropertyBoolean _EnableRetry;
            private ConfigNodePropertyBoolean _EnableRetryScripterror;
            private ConfigNodePropertyString _ExternalizerDomainCqhost;
            private ConfigNodePropertyString _ExternalizerDomainHttp;

            internal ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSJobProcessorProperties.EnableMultisession property.
            /// </summary>
            /// <param name="value">EnableMultisession</param>
            public ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder EnableMultisession(ConfigNodePropertyBoolean value)
            {
                _EnableMultisession = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSJobProcessorProperties.IdsCcEnable property.
            /// </summary>
            /// <param name="value">IdsCcEnable</param>
            public ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder IdsCcEnable(ConfigNodePropertyBoolean value)
            {
                _IdsCcEnable = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSJobProcessorProperties.EnableRetry property.
            /// </summary>
            /// <param name="value">EnableRetry</param>
            public ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder EnableRetry(ConfigNodePropertyBoolean value)
            {
                _EnableRetry = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSJobProcessorProperties.EnableRetryScripterror property.
            /// </summary>
            /// <param name="value">EnableRetryScripterror</param>
            public ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder EnableRetryScripterror(ConfigNodePropertyBoolean value)
            {
                _EnableRetryScripterror = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSJobProcessorProperties.ExternalizerDomainCqhost property.
            /// </summary>
            /// <param name="value">ExternalizerDomainCqhost</param>
            public ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder ExternalizerDomainCqhost(ConfigNodePropertyString value)
            {
                _ExternalizerDomainCqhost = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSJobProcessorProperties.ExternalizerDomainHttp property.
            /// </summary>
            /// <param name="value">ExternalizerDomainHttp</param>
            public ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder ExternalizerDomainHttp(ConfigNodePropertyString value)
            {
                _ExternalizerDomainHttp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamIdsImplIDSJobProcessorProperties.
            /// </summary>
            /// <returns>ComDayCqDamIdsImplIDSJobProcessorProperties</returns>
            public ComDayCqDamIdsImplIDSJobProcessorProperties Build()
            {
                Validate();
                return new ComDayCqDamIdsImplIDSJobProcessorProperties(
                    EnableMultisession: _EnableMultisession,
                    IdsCcEnable: _IdsCcEnable,
                    EnableRetry: _EnableRetry,
                    EnableRetryScripterror: _EnableRetryScripterror,
                    ExternalizerDomainCqhost: _ExternalizerDomainCqhost,
                    ExternalizerDomainHttp: _ExternalizerDomainHttp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}