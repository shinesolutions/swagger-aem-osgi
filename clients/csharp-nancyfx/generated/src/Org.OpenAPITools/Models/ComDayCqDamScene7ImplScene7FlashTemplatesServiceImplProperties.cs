using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties
    /// </summary>
    public sealed class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties:  IEquatable<ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties>
    { 
        /// <summary>
        /// Scene7FlashTemplatesRti
        /// </summary>
        public ConfigNodePropertyString Scene7FlashTemplatesRti { get; private set; }

        /// <summary>
        /// Scene7FlashTemplatesRsi
        /// </summary>
        public ConfigNodePropertyString Scene7FlashTemplatesRsi { get; private set; }

        /// <summary>
        /// Scene7FlashTemplatesRb
        /// </summary>
        public ConfigNodePropertyString Scene7FlashTemplatesRb { get; private set; }

        /// <summary>
        /// Scene7FlashTemplatesRurl
        /// </summary>
        public ConfigNodePropertyString Scene7FlashTemplatesRurl { get; private set; }

        /// <summary>
        /// Scene7FlashTemplateUrlFormatParameter
        /// </summary>
        public ConfigNodePropertyString Scene7FlashTemplateUrlFormatParameter { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties()
        {
        }

        private ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties(ConfigNodePropertyString Scene7FlashTemplatesRti, ConfigNodePropertyString Scene7FlashTemplatesRsi, ConfigNodePropertyString Scene7FlashTemplatesRb, ConfigNodePropertyString Scene7FlashTemplatesRurl, ConfigNodePropertyString Scene7FlashTemplateUrlFormatParameter)
        {
            
            this.Scene7FlashTemplatesRti = Scene7FlashTemplatesRti;
            
            this.Scene7FlashTemplatesRsi = Scene7FlashTemplatesRsi;
            
            this.Scene7FlashTemplatesRb = Scene7FlashTemplatesRb;
            
            this.Scene7FlashTemplatesRurl = Scene7FlashTemplatesRurl;
            
            this.Scene7FlashTemplateUrlFormatParameter = Scene7FlashTemplateUrlFormatParameter;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder</returns>
        public static ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder</returns>
        public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder With()
        {
            return Builder()
                .Scene7FlashTemplatesRti(Scene7FlashTemplatesRti)
                .Scene7FlashTemplatesRsi(Scene7FlashTemplatesRsi)
                .Scene7FlashTemplatesRb(Scene7FlashTemplatesRb)
                .Scene7FlashTemplatesRurl(Scene7FlashTemplatesRurl)
                .Scene7FlashTemplateUrlFormatParameter(Scene7FlashTemplateUrlFormatParameter);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties left, ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties left, ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.
        /// </summary>
        public sealed class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyString _Scene7FlashTemplatesRti;
            private ConfigNodePropertyString _Scene7FlashTemplatesRsi;
            private ConfigNodePropertyString _Scene7FlashTemplatesRb;
            private ConfigNodePropertyString _Scene7FlashTemplatesRurl;
            private ConfigNodePropertyString _Scene7FlashTemplateUrlFormatParameter;

            internal ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.Scene7FlashTemplatesRti property.
            /// </summary>
            /// <param name="value">Scene7FlashTemplatesRti</param>
            public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder Scene7FlashTemplatesRti(ConfigNodePropertyString value)
            {
                _Scene7FlashTemplatesRti = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.Scene7FlashTemplatesRsi property.
            /// </summary>
            /// <param name="value">Scene7FlashTemplatesRsi</param>
            public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder Scene7FlashTemplatesRsi(ConfigNodePropertyString value)
            {
                _Scene7FlashTemplatesRsi = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.Scene7FlashTemplatesRb property.
            /// </summary>
            /// <param name="value">Scene7FlashTemplatesRb</param>
            public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder Scene7FlashTemplatesRb(ConfigNodePropertyString value)
            {
                _Scene7FlashTemplatesRb = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.Scene7FlashTemplatesRurl property.
            /// </summary>
            /// <param name="value">Scene7FlashTemplatesRurl</param>
            public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder Scene7FlashTemplatesRurl(ConfigNodePropertyString value)
            {
                _Scene7FlashTemplatesRurl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.Scene7FlashTemplateUrlFormatParameter property.
            /// </summary>
            /// <param name="value">Scene7FlashTemplateUrlFormatParameter</param>
            public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesBuilder Scene7FlashTemplateUrlFormatParameter(ConfigNodePropertyString value)
            {
                _Scene7FlashTemplateUrlFormatParameter = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties</returns>
            public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties Build()
            {
                Validate();
                return new ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties(
                    Scene7FlashTemplatesRti: _Scene7FlashTemplatesRti,
                    Scene7FlashTemplatesRsi: _Scene7FlashTemplatesRsi,
                    Scene7FlashTemplatesRb: _Scene7FlashTemplatesRb,
                    Scene7FlashTemplatesRurl: _Scene7FlashTemplatesRurl,
                    Scene7FlashTemplateUrlFormatParameter: _Scene7FlashTemplateUrlFormatParameter
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}