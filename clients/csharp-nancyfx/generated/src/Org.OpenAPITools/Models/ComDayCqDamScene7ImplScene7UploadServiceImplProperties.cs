using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamScene7ImplScene7UploadServiceImplProperties
    /// </summary>
    public sealed class ComDayCqDamScene7ImplScene7UploadServiceImplProperties:  IEquatable<ComDayCqDamScene7ImplScene7UploadServiceImplProperties>
    { 
        /// <summary>
        /// CqDamScene7UploadserviceActivejobtimeoutLabel
        /// </summary>
        public ConfigNodePropertyInteger CqDamScene7UploadserviceActivejobtimeoutLabel { get; private set; }

        /// <summary>
        /// CqDamScene7UploadserviceConnectionmaxperrouteLabel
        /// </summary>
        public ConfigNodePropertyInteger CqDamScene7UploadserviceConnectionmaxperrouteLabel { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamScene7ImplScene7UploadServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamScene7ImplScene7UploadServiceImplProperties()
        {
        }

        private ComDayCqDamScene7ImplScene7UploadServiceImplProperties(ConfigNodePropertyInteger CqDamScene7UploadserviceActivejobtimeoutLabel, ConfigNodePropertyInteger CqDamScene7UploadserviceConnectionmaxperrouteLabel)
        {
            
            this.CqDamScene7UploadserviceActivejobtimeoutLabel = CqDamScene7UploadserviceActivejobtimeoutLabel;
            
            this.CqDamScene7UploadserviceConnectionmaxperrouteLabel = CqDamScene7UploadserviceConnectionmaxperrouteLabel;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamScene7ImplScene7UploadServiceImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder</returns>
        public static ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder</returns>
        public ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder With()
        {
            return Builder()
                .CqDamScene7UploadserviceActivejobtimeoutLabel(CqDamScene7UploadserviceActivejobtimeoutLabel)
                .CqDamScene7UploadserviceConnectionmaxperrouteLabel(CqDamScene7UploadserviceConnectionmaxperrouteLabel);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamScene7ImplScene7UploadServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamScene7ImplScene7UploadServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7UploadServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7UploadServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamScene7ImplScene7UploadServiceImplProperties left, ComDayCqDamScene7ImplScene7UploadServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamScene7ImplScene7UploadServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7UploadServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7UploadServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamScene7ImplScene7UploadServiceImplProperties left, ComDayCqDamScene7ImplScene7UploadServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamScene7ImplScene7UploadServiceImplProperties.
        /// </summary>
        public sealed class ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _CqDamScene7UploadserviceActivejobtimeoutLabel;
            private ConfigNodePropertyInteger _CqDamScene7UploadserviceConnectionmaxperrouteLabel;

            internal ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7UploadServiceImplProperties.CqDamScene7UploadserviceActivejobtimeoutLabel property.
            /// </summary>
            /// <param name="value">CqDamScene7UploadserviceActivejobtimeoutLabel</param>
            public ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder CqDamScene7UploadserviceActivejobtimeoutLabel(ConfigNodePropertyInteger value)
            {
                _CqDamScene7UploadserviceActivejobtimeoutLabel = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7UploadServiceImplProperties.CqDamScene7UploadserviceConnectionmaxperrouteLabel property.
            /// </summary>
            /// <param name="value">CqDamScene7UploadserviceConnectionmaxperrouteLabel</param>
            public ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder CqDamScene7UploadserviceConnectionmaxperrouteLabel(ConfigNodePropertyInteger value)
            {
                _CqDamScene7UploadserviceConnectionmaxperrouteLabel = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamScene7ImplScene7UploadServiceImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamScene7ImplScene7UploadServiceImplProperties</returns>
            public ComDayCqDamScene7ImplScene7UploadServiceImplProperties Build()
            {
                Validate();
                return new ComDayCqDamScene7ImplScene7UploadServiceImplProperties(
                    CqDamScene7UploadserviceActivejobtimeoutLabel: _CqDamScene7UploadserviceActivejobtimeoutLabel,
                    CqDamScene7UploadserviceConnectionmaxperrouteLabel: _CqDamScene7UploadserviceConnectionmaxperrouteLabel
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}