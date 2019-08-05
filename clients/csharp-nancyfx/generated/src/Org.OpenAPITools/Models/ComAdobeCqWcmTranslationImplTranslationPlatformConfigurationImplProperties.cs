using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties
    /// </summary>
    public sealed class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties:  IEquatable<ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties>
    { 
        /// <summary>
        /// SyncTranslationStateSchedulingFormat
        /// </summary>
        public ConfigNodePropertyString SyncTranslationStateSchedulingFormat { get; private set; }

        /// <summary>
        /// SchedulingRepeatTranslationSchedulingFormat
        /// </summary>
        public ConfigNodePropertyString SchedulingRepeatTranslationSchedulingFormat { get; private set; }

        /// <summary>
        /// SyncTranslationStateLockTimeoutInMinutes
        /// </summary>
        public ConfigNodePropertyString SyncTranslationStateLockTimeoutInMinutes { get; private set; }

        /// <summary>
        /// ExportFormat
        /// </summary>
        public ConfigNodePropertyDropDown ExportFormat { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties()
        {
        }

        private ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties(ConfigNodePropertyString SyncTranslationStateSchedulingFormat, ConfigNodePropertyString SchedulingRepeatTranslationSchedulingFormat, ConfigNodePropertyString SyncTranslationStateLockTimeoutInMinutes, ConfigNodePropertyDropDown ExportFormat)
        {
            
            this.SyncTranslationStateSchedulingFormat = SyncTranslationStateSchedulingFormat;
            
            this.SchedulingRepeatTranslationSchedulingFormat = SchedulingRepeatTranslationSchedulingFormat;
            
            this.SyncTranslationStateLockTimeoutInMinutes = SyncTranslationStateLockTimeoutInMinutes;
            
            this.ExportFormat = ExportFormat;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder</returns>
        public static ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder</returns>
        public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder With()
        {
            return Builder()
                .SyncTranslationStateSchedulingFormat(SyncTranslationStateSchedulingFormat)
                .SchedulingRepeatTranslationSchedulingFormat(SchedulingRepeatTranslationSchedulingFormat)
                .SyncTranslationStateLockTimeoutInMinutes(SyncTranslationStateLockTimeoutInMinutes)
                .ExportFormat(ExportFormat);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties left, ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties left, ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.
        /// </summary>
        public sealed class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder
        {
            private ConfigNodePropertyString _SyncTranslationStateSchedulingFormat;
            private ConfigNodePropertyString _SchedulingRepeatTranslationSchedulingFormat;
            private ConfigNodePropertyString _SyncTranslationStateLockTimeoutInMinutes;
            private ConfigNodePropertyDropDown _ExportFormat;

            internal ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.SyncTranslationStateSchedulingFormat property.
            /// </summary>
            /// <param name="value">SyncTranslationStateSchedulingFormat</param>
            public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder SyncTranslationStateSchedulingFormat(ConfigNodePropertyString value)
            {
                _SyncTranslationStateSchedulingFormat = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.SchedulingRepeatTranslationSchedulingFormat property.
            /// </summary>
            /// <param name="value">SchedulingRepeatTranslationSchedulingFormat</param>
            public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder SchedulingRepeatTranslationSchedulingFormat(ConfigNodePropertyString value)
            {
                _SchedulingRepeatTranslationSchedulingFormat = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.SyncTranslationStateLockTimeoutInMinutes property.
            /// </summary>
            /// <param name="value">SyncTranslationStateLockTimeoutInMinutes</param>
            public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder SyncTranslationStateLockTimeoutInMinutes(ConfigNodePropertyString value)
            {
                _SyncTranslationStateLockTimeoutInMinutes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.ExportFormat property.
            /// </summary>
            /// <param name="value">ExportFormat</param>
            public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesBuilder ExportFormat(ConfigNodePropertyDropDown value)
            {
                _ExportFormat = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties</returns>
            public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties Build()
            {
                Validate();
                return new ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties(
                    SyncTranslationStateSchedulingFormat: _SyncTranslationStateSchedulingFormat,
                    SchedulingRepeatTranslationSchedulingFormat: _SchedulingRepeatTranslationSchedulingFormat,
                    SyncTranslationStateLockTimeoutInMinutes: _SyncTranslationStateLockTimeoutInMinutes,
                    ExportFormat: _ExportFormat
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}