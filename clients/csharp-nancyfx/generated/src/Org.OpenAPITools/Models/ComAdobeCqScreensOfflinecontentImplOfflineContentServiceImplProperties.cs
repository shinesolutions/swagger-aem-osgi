using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties:  IEquatable<ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties>
    { 
        /// <summary>
        /// DisableSmartSync
        /// </summary>
        public ConfigNodePropertyBoolean DisableSmartSync { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties()
        {
        }

        private ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties(ConfigNodePropertyBoolean DisableSmartSync)
        {
            
            this.DisableSmartSync = DisableSmartSync;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesBuilder</returns>
        public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesBuilder With()
        {
            return Builder()
                .DisableSmartSync(DisableSmartSync);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties left, ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties left, ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _DisableSmartSync;

            internal ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.DisableSmartSync property.
            /// </summary>
            /// <param name="value">DisableSmartSync</param>
            public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesBuilder DisableSmartSync(ConfigNodePropertyBoolean value)
            {
                _DisableSmartSync = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties</returns>
            public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties(
                    DisableSmartSync: _DisableSmartSync
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}