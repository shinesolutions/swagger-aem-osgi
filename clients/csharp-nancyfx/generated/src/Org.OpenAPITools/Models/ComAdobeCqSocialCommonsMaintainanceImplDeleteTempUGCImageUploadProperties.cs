using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties:  IEquatable<ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties>
    { 
        /// <summary>
        /// NumberOfDays
        /// </summary>
        public ConfigNodePropertyInteger NumberOfDays { get; private set; }

        /// <summary>
        /// AgeOfFile
        /// </summary>
        public ConfigNodePropertyInteger AgeOfFile { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties()
        {
        }

        private ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties(ConfigNodePropertyInteger NumberOfDays, ConfigNodePropertyInteger AgeOfFile)
        {
            
            this.NumberOfDays = NumberOfDays;
            
            this.AgeOfFile = AgeOfFile;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder With()
        {
            return Builder()
                .NumberOfDays(NumberOfDays)
                .AgeOfFile(AgeOfFile);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties left, ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties left, ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder
        {
            private ConfigNodePropertyInteger _NumberOfDays;
            private ConfigNodePropertyInteger _AgeOfFile;

            internal ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.NumberOfDays property.
            /// </summary>
            /// <param name="value">NumberOfDays</param>
            public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder NumberOfDays(ConfigNodePropertyInteger value)
            {
                _NumberOfDays = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.AgeOfFile property.
            /// </summary>
            /// <param name="value">AgeOfFile</param>
            public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesBuilder AgeOfFile(ConfigNodePropertyInteger value)
            {
                _AgeOfFile = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties</returns>
            public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties(
                    NumberOfDays: _NumberOfDays,
                    AgeOfFile: _AgeOfFile
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}