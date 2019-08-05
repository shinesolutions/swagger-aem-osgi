using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties
    /// </summary>
    public sealed class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties:  IEquatable<ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties>
    { 
        /// <summary>
        /// FormsFormparagraphpostprocessorEnabled
        /// </summary>
        public ConfigNodePropertyBoolean FormsFormparagraphpostprocessorEnabled { get; private set; }

        /// <summary>
        /// FormsFormparagraphpostprocessorFormresourcetypes
        /// </summary>
        public ConfigNodePropertyArray FormsFormparagraphpostprocessorFormresourcetypes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties()
        {
        }

        private ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties(ConfigNodePropertyBoolean FormsFormparagraphpostprocessorEnabled, ConfigNodePropertyArray FormsFormparagraphpostprocessorFormresourcetypes)
        {
            
            this.FormsFormparagraphpostprocessorEnabled = FormsFormparagraphpostprocessorEnabled;
            
            this.FormsFormparagraphpostprocessorFormresourcetypes = FormsFormparagraphpostprocessorFormresourcetypes;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder</returns>
        public static ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder Builder()
        {
            return new ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder</returns>
        public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder With()
        {
            return Builder()
                .FormsFormparagraphpostprocessorEnabled(FormsFormparagraphpostprocessorEnabled)
                .FormsFormparagraphpostprocessorFormresourcetypes(FormsFormparagraphpostprocessorFormresourcetypes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties left, ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties left, ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.
        /// </summary>
        public sealed class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _FormsFormparagraphpostprocessorEnabled;
            private ConfigNodePropertyArray _FormsFormparagraphpostprocessorFormresourcetypes;

            internal ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.FormsFormparagraphpostprocessorEnabled property.
            /// </summary>
            /// <param name="value">FormsFormparagraphpostprocessorEnabled</param>
            public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder FormsFormparagraphpostprocessorEnabled(ConfigNodePropertyBoolean value)
            {
                _FormsFormparagraphpostprocessorEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.FormsFormparagraphpostprocessorFormresourcetypes property.
            /// </summary>
            /// <param name="value">FormsFormparagraphpostprocessorFormresourcetypes</param>
            public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesBuilder FormsFormparagraphpostprocessorFormresourcetypes(ConfigNodePropertyArray value)
            {
                _FormsFormparagraphpostprocessorFormresourcetypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties</returns>
            public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties Build()
            {
                Validate();
                return new ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties(
                    FormsFormparagraphpostprocessorEnabled: _FormsFormparagraphpostprocessorEnabled,
                    FormsFormparagraphpostprocessorFormresourcetypes: _FormsFormparagraphpostprocessorFormresourcetypes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}