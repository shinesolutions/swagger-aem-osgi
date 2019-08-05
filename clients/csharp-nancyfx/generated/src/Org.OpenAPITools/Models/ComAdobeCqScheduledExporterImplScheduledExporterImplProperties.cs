using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScheduledExporterImplScheduledExporterImplProperties
    /// </summary>
    public sealed class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties:  IEquatable<ComAdobeCqScheduledExporterImplScheduledExporterImplProperties>
    { 
        /// <summary>
        /// IncludePaths
        /// </summary>
        public ConfigNodePropertyArray IncludePaths { get; private set; }

        /// <summary>
        /// ExporterUser
        /// </summary>
        public ConfigNodePropertyString ExporterUser { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScheduledExporterImplScheduledExporterImplProperties()
        {
        }

        private ComAdobeCqScheduledExporterImplScheduledExporterImplProperties(ConfigNodePropertyArray IncludePaths, ConfigNodePropertyString ExporterUser)
        {
            
            this.IncludePaths = IncludePaths;
            
            this.ExporterUser = ExporterUser;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder</returns>
        public static ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder</returns>
        public ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder With()
        {
            return Builder()
                .IncludePaths(IncludePaths)
                .ExporterUser(ExporterUser);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqScheduledExporterImplScheduledExporterImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScheduledExporterImplScheduledExporterImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqScheduledExporterImplScheduledExporterImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScheduledExporterImplScheduledExporterImplProperties left, ComAdobeCqScheduledExporterImplScheduledExporterImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScheduledExporterImplScheduledExporterImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqScheduledExporterImplScheduledExporterImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScheduledExporterImplScheduledExporterImplProperties left, ComAdobeCqScheduledExporterImplScheduledExporterImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.
        /// </summary>
        public sealed class ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _IncludePaths;
            private ConfigNodePropertyString _ExporterUser;

            internal ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.IncludePaths property.
            /// </summary>
            /// <param name="value">IncludePaths</param>
            public ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder IncludePaths(ConfigNodePropertyArray value)
            {
                _IncludePaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.ExporterUser property.
            /// </summary>
            /// <param name="value">ExporterUser</param>
            public ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder ExporterUser(ConfigNodePropertyString value)
            {
                _ExporterUser = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqScheduledExporterImplScheduledExporterImplProperties</returns>
            public ComAdobeCqScheduledExporterImplScheduledExporterImplProperties Build()
            {
                Validate();
                return new ComAdobeCqScheduledExporterImplScheduledExporterImplProperties(
                    IncludePaths: _IncludePaths,
                    ExporterUser: _ExporterUser
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}