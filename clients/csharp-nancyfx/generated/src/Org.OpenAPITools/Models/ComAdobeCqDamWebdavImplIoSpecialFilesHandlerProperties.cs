using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties
    /// </summary>
    public sealed class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties:  IEquatable<ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties>
    { 
        /// <summary>
        /// ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters
        /// </summary>
        public ConfigNodePropertyArray ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties()
        {
        }

        private ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties(ConfigNodePropertyArray ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters)
        {
            
            this.ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters = ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesBuilder</returns>
        public static ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesBuilder</returns>
        public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesBuilder With()
        {
            return Builder()
                .ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters(ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties left, ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties left, ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.
        /// </summary>
        public sealed class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesBuilder
        {
            private ConfigNodePropertyArray _ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters;

            internal ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters property.
            /// </summary>
            /// <param name="value">ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters</param>
            public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesBuilder ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters(ConfigNodePropertyArray value)
            {
                _ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties</returns>
            public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties Build()
            {
                Validate();
                return new ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties(
                    ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters: _ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}