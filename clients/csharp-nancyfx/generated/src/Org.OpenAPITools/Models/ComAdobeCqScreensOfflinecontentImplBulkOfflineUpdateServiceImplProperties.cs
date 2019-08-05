using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties:  IEquatable<ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties>
    { 
        /// <summary>
        /// ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath
        /// </summary>
        public ConfigNodePropertyArray ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties()
        {
        }

        private ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties(ConfigNodePropertyArray ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath, ConfigNodePropertyString ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency)
        {
            
            this.ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
            
            this.ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder</returns>
        public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder With()
        {
            return Builder()
                .ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath)
                .ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties left, ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties left, ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
            private ConfigNodePropertyString _ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;

            internal ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath</param>
            public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath(ConfigNodePropertyArray value)
            {
                _ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency</param>
            public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency(ConfigNodePropertyString value)
            {
                _ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties</returns>
            public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties(
                    ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath: _ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath,
                    ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency: _ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}